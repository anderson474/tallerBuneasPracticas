import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * [En esta clase se realiza tanto el filtrar por genero
 * como por año, se debe instanciar esta clase, pasandole como
 * parametro un objeto ya sea de tipo biblioteca o de tipo createPlaylist
 * Luego para cualquiera de los dos puede utiizar tanto los metodos
 * como para filtrar por genero como por año, recuerde que si utiliza
 * un filtro de año debe utilizar el metodo imprimir por año.
 *
 *
 * ej:
 * Biblioteca bib=new Biblioteca();
 * Filtrar filtrobib = new Filtrar(bib);
 *         filtrobib.FiltrarGenero("regeton");
 *         filtrobib.imprimirGe();
 *         filtrobib.FiltrarGenero("urbano");
 *         filtrobib.imprimirGe();
 *
 *ej:
 * createPlaylist playlist3= new createPlaylist("todas las canciones");
 * Filtrar filtroplay3 = new Filtrar(playlist3);
 *         filtroplay3.FiltrarGenero("urbano");
 *         filtroplay3.imprimirGe();
 *         filtroplay3.FiltrarPorAño(2022);
 *         filtroplay3.imprimirYear();
 *     Nota: Recuerde que la playlist debe contener canciones para poder realizar el filtro
 *
 * ]
 *
 * @version [1.0.0]
 *
 * @author [Jhon Anderson Galeano santillana - jhon.galeano201@tau.usbmed.edu.co
 *          Juan Guillermo Morales - ]
 *
 * @since [1.0.0]
 *
 */

public class Filtrar{
    protected Biblioteca bib;
    protected createPlaylist playlist;
    /**
     * El arreglo donde se van a guardar las canciones
     * que estan dentro ya sea de la biblioteca o de la playlist.
     */
    protected final ArrayList<Cancion> Cancion;
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
     * La variable que me detecta si se construyo la
     * clase con un objeto de tipo biblioteca o de createPlaylist.
     */
    private boolean turn;


    /**
     * Este constructor es por si se ingresa
     * un objeto de tipo biblioteca.
     *
     * @param bib el objeto biblioteca.
     */
    public Filtrar(Biblioteca bib) {
        this.bib=bib;
        this.turn=true;
        this.Cancion= this.bib.getCanciones();
    }

    /**
     * Este constructor es por si se ingresa
     * un objeto de tipo createPlaylist.
     *
     * @param playlist el objeto playlist
     */
    public Filtrar(createPlaylist playlist){
        this.playlist=playlist;
        this.turn=false;
        this.Cancion= this.playlist.getCanciones();
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
                Cancion.stream().filter(cancion -> cancion.getGenero() == genero).collect(Collectors.toList());
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
                Cancion.stream().filter(cancion -> cancion.getFecha().getYear()==year).collect(Collectors.toList());

    }

    public String getGenero() {
        return genero;
    }

    public int getYear() {
        return year;
    }


    public void imprimirGe(){
        if(turn){
            System.out.println("Las canciones que se filtraron de tu biblioteca por el genero: "
                    + getGenero()+":");
        }else{
            System.out.println("Las canciones que se filtraron de tu playlist " + this.playlist.getName() +
                    " por el genero: "+ getGenero()+":");
        }

        for(int i = 0; i< CancionesFiltradasGene.size(); i++){
            System.out.println(CancionesFiltradasGene.get(i));
        }
    }

    public void imprimirYear(){
        if(turn){
            System.out.println("Las canciones que se filtraron de tu biblioteca por el año: "
                    + getYear()+":");
        }else{
            System.out.println("Las canciones que se filtraron de tu playlist " + this.playlist.getName() +
                    " por el año: "+ getYear()+":");
        }

        for(int i = 0; i< CancionesFiltradasGene.size(); i++){
            System.out.println(CancionesFiltradasYear.get(i));
        }

    }

}
