package co.com.sofka.reto.punto18;

public class VideoJuego implements Entregable{

    private final static int horasEstimadasDefecto = 10;
    private final static boolean entregadDefecto = false;

    private  String titulo;
    private double horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    public VideoJuego() {
        this.titulo = "";
        this.horasEstimadas = horasEstimadasDefecto;
        this.entregado = entregadDefecto;
        this.genero = "";
        this.compañia = "";
    }

    public VideoJuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregadDefecto;
        this.genero = "";
        this.compañia = "";
    }

    public VideoJuego(String titulo, double horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
        this.entregado = entregadDefecto;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public void entregar() {
        entregado=true;
    }

    @Override
    public void devolver() {
        entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object str) {
        int estado = -1;
        VideoJuego videoJuego = (VideoJuego) str;
        if (horasEstimadas>videoJuego.getHorasEstimadas()){
            estado=1;
        }else if(horasEstimadas==videoJuego.getHorasEstimadas()){
            estado=0;
        }

        return estado;
    }
}
