import java.util.Collections;

public class ManejoBiblioteca {
    public static void main(String[] args) {
        Libreria biblioteca = new Libreria();
        Cancion c1 = new Cancion("Laugh Now Cry Later","2022-01-01",1000,"urbano","caratula"
        ,"esta es una cancion");
        Cancion c2 = new Cancion("Laugh Now Cryed Later","2021-01-01",500,"urbano","caratula1"
                ,"esta es una cancion2");
        Cancion c3 = new Cancion("Blinding Lights","2020-10-11",700,"urbano","caratula2"
                ,"esta es una cancion3");

        biblioteca.canciones.add(c1);
        biblioteca.canciones.add(c2);
        biblioteca.canciones.add(c3);
        //System.out.println(c1);
        //System.out.println(c2);
        System.out.println("Desordenado");
        for(int i=0; i<biblioteca.canciones.size(); i++){
            System.out.println(biblioteca.canciones.get(i));
        }

        Collections.sort(biblioteca.canciones, new OrdenarPorDuracion());

        System.out.println("Ordenado por duración");
        for(int i=0; i<biblioteca.canciones.size(); i++){
            System.out.println(biblioteca.canciones.get(i));
        }

        Playlist favoritas = new Playlist("Favoritas");

        favoritas.canciones.add(c1);

        System.out.println(favoritas.canciones.get(0));

        Collections.sort(biblioteca.canciones, new OrdenarPorFecha());

        System.out.println("Ordenado por fecha");
        for(int i=0; i<biblioteca.canciones.size(); i++){
            System.out.println(biblioteca.canciones.get(i));
        }


    }
}
