public class Biblioteca {
    protected Cancion[] Canciones =  new Cancion[12];
    protected static int cont;
    public Biblioteca(){
        cont=0;
    }

    public void AddCancion(Cancion song){
        Canciones[this.cont] = song;
        this.cont++;
        if(cont>=12){
            throw new RuntimeException("Solo se pueden adicionar hasta doce canciones a la playlist");
        }
    }

    public Cancion[] getCanciones() {
        return Canciones;
    }

    public static int getCont() {
        return cont;
    }
}
