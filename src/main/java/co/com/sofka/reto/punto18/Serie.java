package co.com.sofka.reto.punto18;

public class Serie implements Entregable{

    private final static int numeroTemporadasDefecto = 3;
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;


    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = numeroTemporadasDefecto;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadasDefecto;
        this.entregado = false;
        this.genero = "";
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public static int getNumeroTemporadasDefecto() {
        return numeroTemporadasDefecto;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
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
        Serie serie = (Serie) str;
        if (numeroTemporadas>serie.getNumeroTemporadas()){
            estado=1;
        }else if(numeroTemporadas==serie.getNumeroTemporadas()){
            estado=0;
        }
        return estado;
    }
}
