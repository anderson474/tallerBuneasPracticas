import java.time.format.DateTimeParseException;
import java.util.*;

public class libraryManagement {
    public static void main(String[] args) {
        /*instanciación de objeto c1 de tipo Song*/ 
        Song c1 = new Song("Laugh Now Cry Later","2022-01-01",1000,"regeton","caratula"
        ,"esta es una cancion");
        /*instanciación de objeto c2 de tipo Song*/ 
        Song c2 = new Song("cake by the Ocean","2019-01-01",100,"urbano","caratula1"
                ,"esta es una cancion2");
        /*instanciación de objeto bib de tipo Library*/ 
        Library bib=new Library();
        /*llamado al metodo addSong para adicionar canciones al objecto bib */
        bib.addSong(c1);
        bib.addSong(c2);
        Scanner input = new Scanner(System.in);
        /*Declaración variable para controlar ciclo Do-while */
        Boolean menu;
        /*Declaración variable de control de ingreso al switch */
        String accion;
        /*Instanciacion de la lista que contendra playlist */
        List<CreatePlaylist> playlists=new ArrayList<>();
        System.out.println("Bienvenido a su biblioteca de canciones");
        do{
            System.out.println("Seleccione una opción");
            /*Funcionalidad de la aplicación */
            System.out.println("1. Adicionar canción \n2. Ver listado de canciones \n3.Ordenar por duracion");
            System.out.println("4. Ordenar por fecha \n5. Filtar por genero \n6.Filtrar por año \n7.crear" +
                    " playlist \n8. ver playlist");
            accion = input.nextLine();
            //input.skip("\n");
            /*Dependiendo de la elección del usuario ingresa al case correspondiente dentro del switch */
            switch(accion){
                case "1":
                    try{
                        System.out.println("Escriba el nombre de la canción");
                        /* Captura de datos del usuario */
                        String nombre = input.nextLine();

                        System.out.println("Escriba la fecha \"2022-07-07\"");
                        /* Captura de datos del usuario */
                        CharSequence fecha = input.nextLine();

                        System.out.println("Duracion de la canción en segundos: ");
                        /* Captura de datos del usuario */
                        String duracion = input.nextLine();


                        System.out.println("Escriba el genero de la canción");
                        /* Captura de datos del usuario */
                        String genero = input.nextLine();

                        System.out.println("Escriba la caratula de la canción");
                        /* Captura de datos del usuario */
                        String caratula = input.nextLine();

                        System.out.println("Escriba la descripcion de la canción");
                        /* Captura de datos del usuario */
                        String descripcion = input.nextLine();
                        try{
                            /*llamado al metodo addSong e instanciacion 8de objeto del tipo Song */
                            bib.addSong(new Song(nombre, fecha, Integer.parseInt(duracion), genero, caratula, descripcion));
                        }catch (DateTimeParseException e){
                            System.out.println("La fecha ingresada no es valida");
                            System.out.println("Recuerde que el formato es: YEAR-MONTH-DAY");
                        }catch(IllegalArgumentException ex){
                            System.out.println("La duración la debe ingresar en segundos");
                            System.out.println("(deben ser números)");
                        }


                    }catch (IllegalArgumentException e){
                        System.out.println("Solo se pueden adicionar hasta doce canciones a la biblioteca");
                    }
                    break;

                case "2":
                    System.out.println("tu biblioteca: ");
                    /*llamado al metodo print para imprimir todas las canciones en el objeto bib */
                    bib.print(bib.getSongs());
                    break;

                case "3":
                    /*llamado al metodo sort, el cual permite clasificar una lista, en este caso por duración*/
                    Collections.sort(bib.getSongs(), new SortByDuration());
                    System.out.println("Ordenado por duración");
                    for(int i = 0; i<bib.getSongs().size(); i++){
                        System.out.println(bib.getSongs().get(i));
                    }
                    break;
                case "4":
                    /*llamado al metodo sort, el cual permite clasificar una lista, en este caso por fecha*/
                    Collections.sort(bib.getSongs(), new SortByDate());
                    System.out.println("Ordenado por fecha");
                    for(int i = 0; i<bib.getSongs().size(); i++){
                        System.out.println(bib.getSongs().get(i));
                    }
                    break;
                case "5":
                    System.out.println("que genero desea buscar?");
                    /* Captura de datos del usuario */
                    String generoIngresado= input.nextLine();
                    /*llamado al metodo filterGenre que filtra el objeto bib de acuerdo al valor ingresado */
                    try{
                        bib.filterGenre(generoIngresado);
                        System.out.println("Las canciones filtradas por el genero "+generoIngresado+ " :");
                        bib.print(bib.getSongsFilteredGenre());
                    }catch (NullPointerException e){
                        System.out.println("El genero que desea buscar no se encuentra disponible");
                    }
                    break;
                case "6":
                    System.out.println("que año desea buscar?");
                    /* Captura de datos del usuario */
                    String añoIngresado= input.nextLine();
                    int year= Integer.parseInt(añoIngresado);
                    try{
                        /*llamado al metodo filterByYear que filtra el objeto bib de acuerdo al año ingresado */
                        bib.filterByYear(year);
                        System.out.println("Las canciones filtradas por el year "+bib.getYear()+ " :");
                        bib.print(bib.getSongsFilteredYear());
                    }catch (NullPointerException e){
                        System.out.println("El año que desea buscar no se encuentra disponible");
                    }

                    break;
                case "7":
                    System.out.println("que nombre desea para la playlist?");
                    /* Captura de datos del usuario */
                    String name= input.nextLine();
                    boolean masCanicones=true;
                    /*Ciclo que permite la adición de canciones a las playlist */
                    while (masCanicones){
                        System.out.println("que cancion por id desea agregar a la playlist");
                        /* Captura de datos del usuario */
                        String identificador=input.nextLine();
                        int id=Integer.parseInt(identificador);
                        CreatePlaylist playlist =new CreatePlaylist(name);
                        playlists.add(playlist);
                        playlist.addSong(bib.filterId(id));
                        System.out.println("desea agregar otra cancion?");
                        /* Captura de datos del usuario */
                        masCanicones= input.nextBoolean();
                        input.skip("\n");
                    }
                    break;
                case "8":
                    System.out.println("Que playlist desea ver?");
                    /* Captura de datos del usuario */
                    String namePlaylist= input.nextLine();
                    for(int i=0; i<playlists.size(); i++){
                        if(playlists.get(i).getName().equalsIgnoreCase(namePlaylist)){
                            System.out.println(playlists.get(i).getSongs());
                        }
                    }
                    break;



            }
            System.out.println("Desea realizar otra opción true/false:");
            /* Captura de datos del usuario */
            menu = input.nextBoolean();
            input.skip("\n");
        }
        while(menu);
    }
}
