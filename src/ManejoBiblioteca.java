import java.util.Collections;

public class ManejoBiblioteca {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Laugh Now Cry Later","2022-01-01",1000,"regeton","caratula"
        ,"esta es una cancion");
        Cancion c2 = new Cancion("cake by the Ocean","2021-01-01",100,"urbano","caratula1"
                ,"esta es una cancion2");
        Biblioteca bib=new Biblioteca();
        bib.AddCancion(c1);
        bib.AddCancion(c2);

        Filtrar filtrobib = new Filtrar(bib);
        filtrobib.FiltrarGenero("regeton");
        filtrobib.imprimirGe();
        filtrobib.FiltrarGenero("urbano");
        filtrobib.imprimirGe();


        createPlaylist playlist1= new createPlaylist("mis canciones preferidas");
        playlist1.AddCancion(c2);
        playlist1.imprimir();


        createPlaylist playlist2= new createPlaylist("mis canciones no tan preferidas");
        playlist2.AddCancion(c1);
        playlist2.imprimir();


        createPlaylist playlist3= new createPlaylist("todas las canciones");
        playlist3.AddCancion(c1);
        playlist3.AddCancion(c2);
        playlist3.imprimir();

        Filtrar filtroplay3 = new Filtrar(playlist3);
        filtroplay3.FiltrarGenero("urbano");
        filtroplay3.imprimirGe();
        filtroplay3.FiltrarPorAño(2022);
        filtroplay3.imprimirYear();


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
