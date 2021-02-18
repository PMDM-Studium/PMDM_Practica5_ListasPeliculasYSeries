package es.studium.listas.ui.series;

class Series {
    private final int imagenSerie;
    private final String nombreSerie;
    private String directorSerie;
    private String repartoSerie;
    private float clasificacionSerie;
    private String temporadasSerie;
    private String sinopsisSerie;

    public Series (int imagenSerie, String nombreSerie, String directorSerie, String repartoSerie, float clasificacionSerie,  String temporadasSerie,  String sinopsisSerie){
        this.imagenSerie=imagenSerie;
        this.nombreSerie=nombreSerie;
        this.directorSerie=directorSerie;
        this.repartoSerie=repartoSerie;
        this.clasificacionSerie=clasificacionSerie;
        this.temporadasSerie=temporadasSerie;
        this.sinopsisSerie=sinopsisSerie;
    }

    public int getImagenSerie() {
        return imagenSerie;
    }
    public String getNombreSerie() {
        return nombreSerie;
    }

    public String getDirectorSerie() {
        return directorSerie;
    }
    public String getRepartoSerie() {
        return repartoSerie;
    }
    public float getClasificacionSerie() {
        return clasificacionSerie;
    }
    public String getTemporadasSerie() {
        return temporadasSerie;
    }
    public String getSinopsisSerie() {
        return sinopsisSerie;
    }
}
