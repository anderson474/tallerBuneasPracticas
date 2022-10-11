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

    @Override
    public String toString() {
        return "Cancion{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", fecha=" + fecha +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", caratula='" + caratula + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public int getDuracion(){
        return this.duracion;
    }

    public String getGenero(){
        return this.genero;
    }
}
