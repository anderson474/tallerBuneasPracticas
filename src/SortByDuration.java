import java.util.Comparator;
/**
 * [Esta clase permite comparar dos canciones,
 * para ordenarlas de acuerdo a su atributo duracion,
 * las canciones se ordenan de acuerdo al valor
 * retornado por la clase.
 * En la biblioteca se implementa en el metodo
 * Collection.sort( array, comparador), el cual recibe
 * el array a ordenar y la clase de comparacion.
 * 
 * ]
 *
 * @version [1.0.0]
 *
 * @author [Jhon Anderson Galeano Santillana -jhon.galeano201@tau.usbmed.edu.co
 *          Juan Guillermo Morales -]
 *
 * @since [1.0.0]
 *
 */
public class SortByDuration implements Comparator<Cancion> {
    /**
         * Metodo encargado de comparar dos canciones
         * de acuerdo a su duración
         * @param songA objeto canción del cual se toma la duración
         * @param songB objeto canción del cual se toma la duración
         * @return numero entero que corresponde a la diferencia
         * entre las duraciones de las canciones A y B
         */
    public int compare(Cancion a, Cancion b) {
        return a.getDuracion() - b.getDuracion();
    }
}
