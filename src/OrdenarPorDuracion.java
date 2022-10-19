import java.util.Comparator;

public class OrdenarPorDuracion implements Comparator<Song> {
    public int compare(Song a, Song b) {
        return a.getDuration() - b.getDuration();
    }
}
