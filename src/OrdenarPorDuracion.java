import java.util.Comparator;

public class OrdenarPorDuracion implements Comparator<Cancion> {
    public int compare(Cancion a, Cancion b) {
        return a.getDuracion() - b.getDuracion();
    }
}
