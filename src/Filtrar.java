/**
 * Filtrar canciones del mismo genero
 * Filtrar canciones en el mismo año
 */

public class Filtrar {
    protected Biblioteca bib;
    protected createPlaylist playlist;
    protected Cancion[] CancionesFiltradas=new Cancion[30];

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
        this.genero=genero;
        this.cont=0;
        Cancion[] listaCanciones;
        int cantidadCanciones;
        if(turn){
            listaCanciones= bib.getCanciones();
            cantidadCanciones=bib.getCont();
        }else{
            listaCanciones= playlist.getCanciones();
            cantidadCanciones=playlist.getCont();
        }

        //genero=new String(genero);
        if("urbano".equalsIgnoreCase(genero)){
            for(int i=0; i<cantidadCanciones; i++){
                if(listaCanciones[i].getGenero()=="urbano"){
                    CancionesFiltradas[this.cont]=listaCanciones[i];
                    this.cont++;
                }
            }
        }
        else if("regeton".equalsIgnoreCase(genero)){
            for(int i=0; i<cantidadCanciones; i++){
                if(listaCanciones[i].getGenero()=="regeton"){
                    CancionesFiltradas[this.cont]=listaCanciones[i];
                    this.cont++;
                }
            }
        }
        else if ("pop".equalsIgnoreCase(genero)){
            for(int i=0; i<cantidadCanciones; i++){
                if(listaCanciones[i].getGenero()=="pop"){
                    CancionesFiltradas[this.cont]=listaCanciones[i];
                    this.cont++;
                }
            }
        }
        else{
            System.out.println("no entiendo tu filtro, recuerda que solo existe pop" +
                    " regeton y urbano");
        }
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

        for(int i=0; i<cont; i++){
            System.out.println(CancionesFiltradas[i]);
        }
    }


}
