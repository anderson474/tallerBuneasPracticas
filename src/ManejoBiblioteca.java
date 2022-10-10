public class ManejoBiblioteca {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Laugh Now Cry Later","2022-01-01",1000,"urbano","caratula"
        ,"esta es una cancion");
        Cancion c2 = new Cancion("cake by the Ocean","2021-01-01",100,"urbano","caratula1"
                ,"esta es una cancion2");
        System.out.println(c1);
        System.out.println(c2);

        createPlaylist playlist1= new createPlaylist("mis canciones preferidas");
        playlist1.AddCancion(c2);
        playlist1.imprimir();
        //playlist1.DeleteCanciones();

        createPlaylist playlist2= new createPlaylist("mis canciones no tan preferidas");
        playlist2.AddCancion(c1);
        playlist2.imprimir();



    }
}
