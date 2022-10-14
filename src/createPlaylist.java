import java.util.ArrayList;
import java.util.Arrays;

/**
 * [Esta clase permite crear playlists de
 *  mandando el nombre de la playlist, y utilizando
 *  el metodo de addSong se le adiciona una cancion a la playlisr,
 *  donde el maximo de canciones son
 *  12
 *  ej:
 *  createPlaylist playlist1= new createPlaylist("mis canciones preferidas");
 *         playlist1.AddCancion(c2);
 *         System.out.println("mis canciones preferidas");
 *         playlist1.imprimir(playlist1.getCanciones());
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
public class createPlaylist extends Biblioteca {
    private String name;



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



    public String getName() {
        return name;
    }



}
