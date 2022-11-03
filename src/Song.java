import java.time.LocalDate;
import java.time.format.DateTimeParseException;


/**
 * [
 * Esta clase permite crear canciones con sus diferentes
 * caracteristicas.
 * ej:
 * Cancion c1 = new Cancion("Laugh Now Cry Later","2022-01-01",1000,"regeton","caratula"
 *         ,"esta es una cancion");
 * ]
 *
 * @version [1.0.0]
 *
 * @author [Jhon Anderson Galeano Santillana -jhon.galeano201@tau.usbmed.edu.co
 *          Juan Guillermo Morales  -juanguillermo93@gmail.com]
 *
 * @since [1.0.0]
 *
 */
public class Song {
    private String title;
    private int id;
    private LocalDate date;
    private int duration;
    private String genre;
    private String cover;
    private String description;
    private static int counter =0;


    /**
     * Instantiates a new Cancion.
     *
     * @param title       el titulo de la canción.
     * @param date       la fecha de creación de la canción.
     * @param duration    la duracion de la cancion en milisegundos.
     * @param genre      el genero de la canción.
     * @param cover    la caratúla de la canción.
     * @param description la descripción de la canción
     */
    public Song(String title, CharSequence date, int duration, String genre,
                String cover, String description) {

        this.title = title;
        this.date = LocalDate.parse(date);
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
        counter = counter +1;
        this.id= counter;
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
                ", fecha " + date +
                ", duracion " + duration +
                ", genero " + genre +
                ", caratula " + cover +
                ", descripcion " + description;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public int getId() {
        return id;
    }
}
