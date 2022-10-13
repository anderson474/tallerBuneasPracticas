import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Filtrar canciones del mismo genero
 * Filtrar canciones en el mismo año
 */

public class Filtrar{
    protected Biblioteca bib;
    protected createPlaylist playlist;
    protected final ArrayList<Cancion> Cancion;
    protected List<Cancion> CancionesFiltradasGene = new ArrayList<>();
    protected List<Cancion> CancionesFiltradasYear = new ArrayList<>();
    protected int year;


    protected String genero;
    private int cont;
    private boolean turn;


    public Filtrar(Biblioteca bib) {
        this.bib=bib;
        this.turn=true;
        this.Cancion= this.bib.getCanciones();
    }
    public Filtrar(createPlaylist playlist){
        this.playlist=playlist;
        this.turn=false;
        this.Cancion= this.playlist.getCanciones();
    }


    public void FiltrarGenero(String genero){
        this.genero=genero;
        this.CancionesFiltradasGene =
                Cancion.stream().filter(cancion -> cancion.getGenero() == genero).collect(Collectors.toList());
    }

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
