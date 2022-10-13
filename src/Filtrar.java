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
    protected List<Cancion> CancionesFiltradas= new ArrayList<>();


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
        this.CancionesFiltradas =
                Cancion.stream().filter(cancion -> cancion.getGenero() == genero).collect(Collectors.toList());
    }

    public String getGenero() {
        return genero;
    }

    public void imprimir(){
        if(turn){
            System.out.println("Las canciones que se filtraron de tu biblioteca por el genero: "
                    + this.genero+":");
        }else{
            System.out.println("Las canciones que se filtraron de tu playlist " + this.playlist.getName() +
                    " por el genero: "+ this.genero+":");
        }

        for(int i=0; i< CancionesFiltradas.size(); i++){
            System.out.println(CancionesFiltradas.get(i));
        }
        //CancionesFiltradas.clear();
    }

}
