import java.time.Duration;
import java.time.LocalDate;


public class Cancion {
    private String title;
    private int id;
    private LocalDate fecha;
    private int duracion;
    private String genero;
    private String caratula;
    private String descripcion;
    private static int contador=0;


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
}
