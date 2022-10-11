import java.util.Comparator;

/**
 * OrdenarPorDuracion
 */
public class OrdenarPorDuracion implements Comparator<Cancion>{
    public int compare(Cancion a, Cancion b) {
        return a.getDuracion() - b.getDuracion();
    }
    
}