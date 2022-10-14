import java.util.ArrayList;
import java.util.Arrays;

/**
 * [Esta clase permite crear playlists de
 *  mandando el nombre de la canción (String), y utilizando
 *  el metodo de agregar playlist, donde el maximo de canciones son
 *  12
 *
 * ]
 *
 * @version [1.0.0]
 *
 * @author [Jhon Anderson Galeano Santillana -jhon.galeano201@tau.usbmed.edu.co
 *          Juan Guillermo Morales  -]
 *
 * @since [1.0.0]
 *
 */
public class createPlaylist {
    private String name;
    protected ArrayList<Cancion> Canciones =   new ArrayList<Cancion>();
    private int cont=0;

    /**
     *el constructor inicializa el contador en cero
     * para que cada vez que se quiera crear una playlist empieze
     * en la posición cero, y además inicializa su nombre(el de la playlist).
     * @param name el nombre de la playlist.
     */
    public createPlaylist(String name) {
        this.name = name;
        this.cont=0;
    }


    public int getCont() {
        return cont;
    }

    /**
     * Metodo que agrega la cancion a la lista
     * de la playlist
     *
     * @param song el objeto canción que se pasa su referencia
     *             como parametro y lo ubicamos en una lista.
     * @throws IllegalArgumentException si se quiere tener más de doce o doce
     * canciones la consola te sacará un error.
     */

    public void AddCancion(Cancion song) {
        Canciones.add(song);
        this.cont++;
        if(cont>=1){
            throw new IllegalArgumentException("Solo se pueden adicionar hasta doce canciones a la playlist");
        }
    }

    /**
     * se imprimi la playlist y los nombres de las canciones
     * que pertenecen a la playlist.
     */
    public void imprimir() {
        System.out.println("playlist "+ getName());
        for(int i=0; i<cont; i++) {
            System.out.println(Canciones.get(i));
        }

    }

    public String getName() {
        return name;
    }


    public ArrayList<Cancion> getCanciones() {
        return Canciones;
    }
}
