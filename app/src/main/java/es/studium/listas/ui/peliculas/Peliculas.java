package es.studium.listas.ui.peliculas;

class Peliculas {
    private final int imagenPelicula;
    private final String nombrePelicula;
    private final String directorPelicula;
    private String repartoPelicula;
    private float clasificacionPelicula;
    private String sinopsisPelicula;


    public Peliculas (int imagenPelicula, String nombrePelicula, String directorPelicula, String repartoPelicula, float clasificacionPelicula,String sinopsisPelicula){
        this.imagenPelicula=imagenPelicula;
        this.nombrePelicula=nombrePelicula;
        this.directorPelicula=directorPelicula;
        this.repartoPelicula=repartoPelicula;
        this.clasificacionPelicula=clasificacionPelicula;
        this.sinopsisPelicula=sinopsisPelicula;
    }

    public int getImagenPelicula() {
        return imagenPelicula;
    }
    public String getNombrePelicula() {
        return nombrePelicula;
    }
    public String getDirectorPelicula() {
        return directorPelicula;
    }
    public String getRepartoPelicula() {
        return repartoPelicula;
    }
    public float getClasificacionPelicula() {
        return clasificacionPelicula;
    }
    public String getSinopsisPelicula() {
        return sinopsisPelicula;
    }

}
