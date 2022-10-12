import java.util.ArrayList;

public class Biblioteca {
    protected static ArrayList<Cancion> Canciones =   new ArrayList<Cancion>();
    protected static int cont;
    public Biblioteca(){
        cont=0;
    }

    public void AddCancion(Cancion song){
        Canciones.add(song);
        this.cont++;
        if(cont>=12){
            System.out.println("Solo se pueden adicionar hasta doce canciones a la playlist");
        }
    }

    public static ArrayList<Cancion> getCanciones() {
        return Canciones;
    }

    public static int getCont() {
        return cont;
    }
}
