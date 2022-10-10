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


    public Filtrar(Biblioteca bib) {
        this.bib=bib;


    }
    //public Filtrar(createPlaylist playlist,String filtro) {
        //this.playlist=playlist;

    //}

    public void FiltrarGenero(String genero){
        this.genero=genero;
        this.cont=0;
        genero=new String(genero);
        if("urbano".equalsIgnoreCase(genero)){
            var listaCanciones= bib.getCanciones();
            var cantidadCanciones=bib.getCont();
            for(int i=0; i<cantidadCanciones; i++){
                if(listaCanciones[i].getGenero()=="urbano"){
                    CancionesFiltradas[this.cont]=listaCanciones[i];
                    this.cont++;
                }
            }
        }
    }

    public String getGenero() {
        return genero;
    }

    public void imprimir(){
        System.out.println("Las canciones que se filtraron por el genero: "+ getGenero());
        for(int i=0; i<cont; i++){
            System.out.println(CancionesFiltradas[i]);
        }
    }


}
