import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Libro implements Serializable {
    private String isbn;
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = LocalDate.parse(fechaPublicacion);
    }

    public Libro(String isbn, String titulo, String autor, String fechaPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;

        this.fechaPublicacion = LocalDate.parse(fechaPublicacion, DateTimeFormatter.ofPattern("dd/MM/yyyy"));


    }

    public String toString() {
        return "Libro - " +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                '.';
    }
}


