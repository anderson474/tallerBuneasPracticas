import java.util.Collections;

public class ManejoBiblioteca {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Laugh Now Cry Later","2022-01-01",1000,"regeton","caratula"
        ,"esta es una cancion");
        Cancion c2 = new Cancion("cake by the Ocean","2019-01-01",100,"urbano","caratula1"
                ,"esta es una cancion2");
        Biblioteca bib=new Biblioteca();
        bib.AddCancion(c1);
        bib.AddCancion(c2);
















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
        }

    }
}
