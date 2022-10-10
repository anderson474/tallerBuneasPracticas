import java.util.Arrays;

public class createPlaylist {
    private String name;
    private Cancion Canciones[] = new Cancion[2];
    private static int cont=0;

    public createPlaylist(String name) {
        this.name = name;
    }


    public void AddCancion(Cancion song){
        Canciones[cont]=song;
        cont=cont+1;
        if(cont>=2){
            throw new RuntimeException("Solo se pueden adicionar hasta dos");
        }

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "createPlaylist{" +
                "name='" + name + '\'' +
                ", Canciones=" + Arrays.toString(Canciones) +
                '}';
    }
}
