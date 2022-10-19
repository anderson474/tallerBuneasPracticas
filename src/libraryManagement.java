import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class libraryManagement {
    public static void main(String[] args) {
        Song c1 = new Song("Laugh Now Cry Later","2022-01-01",1000,"regeton","caratula"
        ,"esta es una cancion");
        Song c2 = new Song("cake by the Ocean","2019-01-01",100,"urbano","caratula1"
                ,"esta es una cancion2");
        Library bib=new Library();
        bib.addSong(c1);
        bib.addSong(c2);
        Scanner input = new Scanner(System.in);
        Boolean menu;
        String accion;
        List<CreatePlaylist> playlists=new ArrayList<>();
        System.out.println("Bienvenido a su biblioteca de canciones");
        do{
            System.out.println("Seleccione una opción");
            System.out.println("1. Adicionar canción \n2. Ver listado de canciones \n3.Ordenar por duracion");
            System.out.println("4. Ordenar por fecha \n5. Filtar por genero \n6.Filtrar por año \n7.crear" +
                    " playlist \n8. ver playlist");
            accion = input.nextLine();
            //input.skip("\n");

            switch(accion){
                case "1":
                    System.out.println("Escriba el nombre de la canción");
                    String nombre = input.nextLine();

                    System.out.println("Escriba la fecha \"2022-07-07\"");
                    CharSequence fecha = input.nextLine();

                    System.out.println("Duracion de la canción en segundos: ");
                    int duracion = input.nextInt();
                    input.skip("\n");
                    System.out.println("Escriba el genero de la canción");
                    String genero = input.nextLine();

                    System.out.println("Escriba la caratula de la canción");
                    String caratula = input.nextLine();

                    System.out.println("Escriba la descripcion de la canción");
                    String descripcion = input.nextLine();


                    bib.addSong(new Song(nombre, fecha, duracion, genero, caratula, descripcion));
                    break;

                case "2":
                    System.out.println("tu biblioteca: ");
                    bib.print(bib.getSongs());
                    break;

                case "3":
                    Collections.sort(bib.getSongs(), new OrdenarPorDuracion());
                    System.out.println("Ordenado por duración");
                    for(int i = 0; i<bib.getSongs().size(); i++){
                        System.out.println(bib.getSongs().get(i));
                    }
                    break;
                case "4":
                    Collections.sort(bib.getSongs(), new OrdenarPorFecha());
                    System.out.println("Ordenado por fecha");
                    for(int i = 0; i<bib.getSongs().size(); i++){
                        System.out.println(bib.getSongs().get(i));
                    }
                    break;
                case "5":
                    System.out.println("que genero desea buscar?");
                    String generoIngresado= input.nextLine();
                    bib.filterGenre(generoIngresado);
                    System.out.println("Las canciones filtradas por el genero "+generoIngresado+ " :");
                    bib.print(bib.getSongsFilteredGenre());
                    break;
                case "6":
                    System.out.println("que año desea buscar?");
                    String añoIngresado= input.nextLine();
                    int year= Integer.parseInt(añoIngresado);
                    bib.filterByYear(year);
                    System.out.println("Las canciones filtradas por el year "+bib.getYear()+ " :");
                    bib.print(bib.getSongsFilteredYear());
                    break;
                case "7":
                    System.out.println("que nombre desea para la playlist?");
                    String name= input.nextLine();
                    boolean masCanicones=true;
                    while (masCanicones){
                        System.out.println("que cancion por id desea agregar a la playlist");
                        String identificador=input.nextLine();
                        int id=Integer.parseInt(identificador);
                        CreatePlaylist playlist =new CreatePlaylist(name);
                        playlists.add(playlist);
                        playlist.addSong(bib.filterId(id));
                        System.out.println("desea agregar otra cancion?");
                        masCanicones= input.nextBoolean();
                        input.skip("\n");
                    }
                    break;
                case "8":
                    System.out.println("Que playlist desea ver?");
                    String namePlaylist= input.nextLine();
                    for(int i=0; i<playlists.size(); i++){
                        if(playlists.get(i).getName().equalsIgnoreCase(namePlaylist)){
                            System.out.println(playlists.get(i).getSongs());
                        }
                    }
                    break;



            }
            System.out.println("Desea realizar otra opción true/false:");
            menu = input.nextBoolean();
            input.skip("\n");
        }
        while(menu);














        /*
        System.out.println("tu biblioteca: ");
        bib.imprimir(bib.getCanciones());

        bib.FiltrarGenero("regeton");
        System.out.println("Las canciones filtradas por el genero "+bib.getGenero()+ " :");
        bib.imprimir(bib.getCancionesFiltradasGene());
        bib.FiltrarPorAño(2022);
        System.out.println("Las canciones filtradas por el year "+bib.getYear()+ " :");
        bib.imprimir(bib.getCancionesFiltradasYear());



        createPlaylist playlist1= new createPlaylist("mis canciones preferidas");
        playlist1.AddCancion(c2);
        System.out.println("mis canciones preferidas");
        playlist1.imprimir(playlist1.getCanciones());


        createPlaylist playlist2= new createPlaylist("mis canciones no tan preferidas");
        playlist2.AddCancion(c1);
        System.out.println(playlist2.getName());
        playlist2.imprimir(playlist2.getCanciones());


        createPlaylist playlist3= new createPlaylist("todas las canciones");
        playlist3.AddCancion(c1);
        playlist3.AddCancion(c2);
        System.out.println(playlist3.getName());
        playlist3.imprimir(playlist3.getCanciones());


        playlist3.FiltrarGenero("urbano");
        System.out.println("Las canciones filtradas por el genro "+playlist3.getGenero()+": " );
        playlist3.imprimir(playlist3.getCancionesFiltradasGene());

        Collections.sort(bib.getCanciones(), new OrdenarPorDuracion());
        System.out.println("Ordenado por duración");
        for(int i=0; i<bib.getCanciones().size(); i++){
            System.out.println(bib.getCanciones().get(i));
        }

        Collections.sort(bib.getCanciones(), new OrdenarPorFecha());

        System.out.println("Ordenado por fecha");
        for(int i=0; i<bib.getCanciones().size(); i++){
            System.out.println(bib.getCanciones().get(i));
        }*/
        

    }
}