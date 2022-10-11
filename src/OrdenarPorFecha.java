import java.util.Comparator;

public class OrdenarPorFecha implements Comparator<Cancion>{
        public int compare(Cancion a, Cancion b) {
            
            return a.getFecha().compareTo(b.getFecha());
        }
} 