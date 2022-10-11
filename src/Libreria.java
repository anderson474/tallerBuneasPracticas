import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Libreria {
    protected ArrayList<Cancion> canciones;
    
    public Libreria(){
    canciones = new ArrayList<Cancion>();
    }

    public List<Cancion> filtrarPorGenero(String genero){
        List<Cancion> cancionesFiltradas = this.canciones.stream().filter(
            cancion -> cancion.getGenero() == genero).collect(Collectors.toList());
        return cancionesFiltradas;
    }

    
}


