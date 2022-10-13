import java.time.Duration;
import java.time.LocalDate;


/**
 * [Esta clase permite crear canciones con sus diferentes
 * caracteristicas
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
public class Cancion {
    private String title;
    private int id;
    private LocalDate fecha;
    private int duracion;
    private String genero;
    private String caratula;
    private String descripcion;
    private static int contador=0;


    /**
     * Instantiates a new Cancion.
     *
     * @param title       el titulo de la canción.
     * @param fecha       la fecha de creación de la canción.
     * @param duracion    la duracion de la cancion en milisegundos.
     * @param genero      el genero de la canción.
     * @param caratula    la caratúla de la canción.
     * @param descripcion la descripción de la canción
     */
    public Cancion(String title,CharSequence fecha, int duracion, String genero,
                   String caratula, String descripcion) {

        this.title = title;
        this.fecha = LocalDate.parse(fecha);
        this.duracion = duracion;
        this.genero = genero;
        this.caratula = caratula;
        this.descripcion = descripcion;
        contador=contador+1;
        this.id=contador;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Cancion" + id +
                ", titulo " + title  +
                ", fecha " + fecha +
                ", duracion " + duracion +
                ", genero " + genero  +
                ", caratula " + caratula  +
                ", descripcion " + descripcion ;
    }

    public String getGenero() {
        return genero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }
}
