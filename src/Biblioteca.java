public class Biblioteca extends Libreria {
    
    public Biblioteca(){
        super();
    }

    public void adicionarCancion(Cancion cancion){
        if(contador == canciones.length - 1 ){
            System.out.println("ERROR: Biblioteca llena, no se pueden añadir mas canciones a la biblioteca ");
        }
        canciones[contador] = cancion;
        contador++;
    }
}
