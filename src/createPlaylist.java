import java.util.Arrays;

public class createPlaylist {
    private String name;
    private Cancion[] Canciones =  new Cancion[12];
    private int cont=0;

    public createPlaylist(String name) {
        this.name = name;
        this.cont=0;
    }


    public void AddCancion(Cancion song){
        this.cont=0;
        Canciones[this.cont] = song;
        this.cont++;
        if(cont>=12){
            throw new RuntimeException("Solo se pueden adicionar hasta doce canciones a la playlist");
        }

    }


    public void imprimir() {
        System.out.println("playlist "+ this.name);
        for(int i=0; i<cont; i++) {
            System.out.println(Canciones[i]);
        }



    }
}
