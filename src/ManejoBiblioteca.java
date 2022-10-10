public class ManejoBiblioteca {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Laugh Now Cry Later","2022-01-01",1000,"urbano","caratula"
        ,"esta es una cancion");
        Cancion c2 = new Cancion("Laugh Now Cryed Later","2021-01-01",100,"urbano","caratula1"
                ,"esta es una cancion2");
        System.out.println(c1);
        System.out.println(c2);

        createPlaylist playlist1= new createPlaylist("mis canciones preferidas");
        playlist1.AddCancion(c2);
        System.out.println("playlist1 = " + playlist1);







    }
}
