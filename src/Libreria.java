public abstract class Libreria {
    protected Cancion[] canciones;
    protected int contador;

    public Libreria(){
    canciones = new Cancion[50];
    contador = 0; 
    }

    public abstract void adicionarCancion(Cancion cancion);
}
