package models;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public int compareTo(Book otro) {
        int cmp = otro.titulo.compareTo(this.titulo);
        if (cmp != 0)
            return cmp;
        return Integer.compare(this.anio, otro.anio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return this.anio == other.anio &&
               Objects.equals(this.titulo, other.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, anio);
    }

    @Override
    public String toString() {
        return "Book [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + "]";
    }
}
