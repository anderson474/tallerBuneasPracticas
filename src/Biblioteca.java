import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * [Esta clase permite crear una biblioteca,
 * adicionarle una cancion, filtrar las canciones
 * por año o por genero, permite imprimir las canciones actuales
 * de la biblioteca ver que canciones se encontraron con el filtro de
 * busqueda
 *  ej:
 *  Biblioteca bib=new Biblioteca();
 *         bib.AddCancion(c1);
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
public class Biblioteca {
    protected List<Cancion> Canciones =   new ArrayList<>();
    protected static int cont;
    /**
     * La varaible donde se va a almacenar las canciones que se filtraron
     * por genero.
     */
    protected List<Cancion> CancionesFiltradasGene = new ArrayList<>();
    /**
     * La varaible donde se va a almacenar las canciones que se filtraron
     * por año.
     */
    protected List<Cancion> CancionesFiltradasYear = new ArrayList<>();
    /**
     * El año que se va mandar a buscar.
     */
    protected int year;
    /**
     * el genero que se desea buscar.
     */
    protected String genero;

    /**
     * Metodo que agrega la cancion a la lista
     * de la playlist
     *
     * @param song el objeto canción que se pasa su referencia
     *             como parametro y lo ubicamos en una lista.
     * @throws IllegalArgumentException si se quiere tener más de doce o doce
     * canciones la consola te sacará un error.
     */
    public void AddCancion(Cancion song){
        Canciones.add(song);
        this.cont++;
        if(cont>=12){
            System.out.println("Solo se pueden adicionar hasta doce canciones a la biblioteca");
        }
    }

    public List<Cancion> getCanciones() {
        return Canciones;
    }

    public void imprimir(List<Cancion> Canciones) {
        for(int i=0; i<Canciones.size(); i++) {
            System.out.println(Canciones.get(i));
        }

    }
    /**
     * Este método guarda en la variable CancionesFiltradasGene
     * las canciones que se encuentren en el arreglo con la coincidencia
     * del genero que se manda como parametro
     *
     * @param genero el genero que se desea buscar
     */
    public void FiltrarGenero(String genero){
        this.genero=genero;
        this.CancionesFiltradasGene =
                Canciones.stream().filter(cancion -> cancion.getGenero() == genero).collect(Collectors.toList());
    }

    /**
     * Este método guarda en la variable CancionesFiltradasYear
     * las canciones que se encuentren en el arreglo con la coincidencia
     * del año que se manda como parametro
     *
     * @param year el año que se desea buscar
     */
    public void FiltrarPorAño(int year){
        this.year=year;
        this.CancionesFiltradasYear=
                Canciones.stream().filter(cancion -> cancion.getFecha().getYear()==year).collect(Collectors.toList());

    }


    public List<Cancion> getCancionesFiltradasGene() {
        return CancionesFiltradasGene;
    }

    public List<Cancion> getCancionesFiltradasYear() {
        return CancionesFiltradasYear;
    }

    public int getYear() {
        return year;
    }

    public String getGenero() {
        return genero;
    }
}
