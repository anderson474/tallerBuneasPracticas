import java.util.Comparator;

public class OrdenarPorFecha implements Comparator<Song>{
        public int compare(Song a, Song b) {
            
            return a.getDate().compareTo(b.getDate());
        }
} 