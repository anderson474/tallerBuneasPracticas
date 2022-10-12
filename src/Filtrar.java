import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Filtrar canciones del mismo genero
 * Filtrar canciones en el mismo año
 */

public class Filtrar {
    protected Biblioteca bib;
    protected createPlaylist playlist;

    protected ArrayList<Cancion> CancionesFiltradas= new ArrayList<Cancion>();
    protected final ArrayList<Cancion> Cancion= Biblioteca.getCanciones();

    protected String genero;
    private int cont;
    private boolean turn;


    public Filtrar(Biblioteca bib) {
        this.bib=bib;
        this.turn=true;
    }
    public Filtrar(createPlaylist playlist){
        this.playlist=playlist;
        this.turn=false;
    }


    public void FiltrarGenero(String genero){

        List<Cancion> cancionesFiltradas =
                this.Cancion.stream().filter(Cancion -> Cancion.getGenero() == genero).collect(Collectors.toList());




    }

    public String getGenero() {
        return genero;
    }

    public void imprimir(){
        if(turn){
            System.out.println("Las canciones que se filtraron de tu biblioteca por el genero: "
                    + getGenero()+":");
        }else{
            System.out.println("Las canciones que se filtraron de tu playlist " + this.playlist.getName() +
                    " por el genero: "+ getGenero()+":");
        }

        for(int i=0; i< CancionesFiltradas.size(); i++){
            System.out.println(CancionesFiltradas.get(i));
        }
    }

}
