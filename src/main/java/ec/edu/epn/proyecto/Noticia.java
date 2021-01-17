package ec.edu.epn.proyecto;

public class Noticia {

    private String titulo;
    private String enlace;
    private String fecha;
    private String fuente;

    public Noticia (String titulo,String fuente,String enlace,String fecha){
        this.titulo = titulo;
        this.enlace = enlace;
        this.fecha = fecha;
        this.fuente = fuente;
    }

    public String getTítulo() {
        return titulo;
    }

    public String getEnlace() {
        return enlace;
    }

    public String getFecha() {
        return fecha;
    }

    public String getFuente() {
        return fuente;
    }

    public void setTítulo(String título) {
        this.titulo = título;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
}
