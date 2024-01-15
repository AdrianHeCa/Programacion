package Ev2.Estantería;

public class Libro {
    private String titulo;
    private String autor;
    private Integer calificacion;

    public Libro(String titulo, String autor, Integer calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }
}
