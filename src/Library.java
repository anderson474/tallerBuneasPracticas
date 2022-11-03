import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * [Esta clase permite crear una biblioteca,
 * adicionarle una cancion, filtrar las canciones
 * por año o por genero, permite imprimir las canciones actuales
 * de la biblioteca ver que canciones se encontraron con el filtro de
 * busqueda
 *  ej:
 *  Library bib=new Library();
 *         bib.AddCancion(c1);
 *Nota: como esta es la clase padre de la creación de las playlist puede utilizar los mismos
 * metodos, como por ejemplo agregar una canción.
 * ]
 *
 * @version [1.0.0]
 *
 * @author [Jhon Anderson Galeano Santillana -jhon.galeano201@tau.usbmed.edu.co
 *          Juan Guillermo Morales  -juanguillermo93@gmail.com]
 *
 * @since [1.0.0]
 *
 */
public class Library {
    /**
     * La lista donde se van a almacenar las variables de tipo objeto
     * de tipo Cancion donde van a ir las canciones.
     */
    protected List<Song> songs =   new ArrayList<>();
    //protected static int cont;
    /**
     * La varaible donde se va a almacenar las canciones que se filtraron
     * por genero.
     */
    protected List<Song> songsFilteredGenre;
    /**
     * La varaible donde se va a almacenar las canciones que se filtraron
     * por año.
     */
    protected List<Song> songsFilteredYear = new ArrayList<>();
    /**
     * La varaible donde se va a almacenar las canciones que se filtraron
     * por Id.
     */
    protected Song SongsFilteredId;
    /**
     * El año que se va mandar a buscar.
     */
    protected int year;
    /**
     * el genero que se desea buscar.
     */
    protected String genre;


    /**
     * Seccion de los getters.
     */
    public List<Song> getSongs() {return songs;}
    public List<Song> getSongsFilteredGenre() {
        return this.songsFilteredGenre;
    }
    public List<Song> getSongsFilteredYear() {
        return this.songsFilteredYear;
    }
    public int getYear() {
        return year;
    }
    public Song getCancionesFiltradasId() {
        return SongsFilteredId;
    }
    public String getGenre() {return genre;}

    public Song getSongsFilteredId() {return SongsFilteredId;}

    /**
     * Metodo que agrega la cancion a la lista
     * de la playlist
     *
     * @param song el objeto canción que se pasa su referencia
     *             como parametro y lo ubicamos en una lista.
     * @throws IllegalArgumentException si se quiere tener más de doce o doce
     * canciones la consola arrojará un error.
     */
    public void addSong(Song song){
        songs.add(song);
        if(songs.size()>=12){
            throw new IllegalArgumentException();
        }
    }



    public void print(List<Song> canciones) {
        for(int i = 0; i< canciones.size(); i++) {
            System.out.println(canciones.get(i));
        }

    }
    /**
     * Este método guarda en la variable CancionesFiltradasGene
     * las canciones que se encuentren en el arreglo con la coincidencia
     * del genre que se manda como parametro
     * ej:
     * bib.FiltrarGenero("regeton");
     *         System.out.println("Las canciones filtradas por el genre "+bib.getGenero()+ " :");
     *         bib.imprimir(bib.getCancionesFiltradasGene());
     *Nota: usando el mismo objeto bib del ejemplo de clase.
     *
     * @param genre el genero que se desea buscar
     */
    public void filterGenre(String genre){
        this.genre =genre;
        this.songsFilteredGenre = songs.stream().filter(song ->
                this.genre.equalsIgnoreCase(song.getGenre())).collect(Collectors.toList());
        boolean ans = songsFilteredGenre.isEmpty();
        if(ans==true){
            throw new NullPointerException();

        }
    }

    /**
     * Este método guarda en la variable CancionesFiltradasYear
     * las canciones que se encuentren en el arreglo con la coincidencia
     * del año que se manda como parametro.
     * ej:
     * bib.FiltrarPorAño(2022);
     *         System.out.println("Las canciones filtradas por el year "+bib.getYear()+ " :");
     *         bib.imprimir(bib.getCancionesFiltradasYear());
     *
     * @param year el año que se desea buscar
     */
    public void filterByYear(int year){
        this.year=year;
        this.songsFilteredYear =
                songs.stream().filter(song -> song.getDate().getYear()==year).collect(Collectors.toList());
        boolean ans = songsFilteredYear.isEmpty();
        if(ans==true){
            throw new NullPointerException();

        }

    }
    /**
     * Este método sirve para buscar una canción por id, y además
     * se utilizó para guardar canciones en una playlist buscando por id
     * ej:CreatePlaylist playlist =new CreatePlaylist(name);
     *                         playlist.addSong(bib.filterId(id));
     *Nota: id es un entero identificador de la canción.
     *
     * @param id el id de la canción que se desea buscar.
     */
    public Song filterId(int id){
        //this.CancionesFiltradasId=
                 //Canciones.stream().filter(cancion -> cancion.getId()== id).collect(Collectors.toList());
        for(int i = 0; i< songs.size(); i++){
            if(songs.get(i).getId()==id){
                this.SongsFilteredId =  songs.get(i);
            }
        }

        return SongsFilteredId;
    }




}
