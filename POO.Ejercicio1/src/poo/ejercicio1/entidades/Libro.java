package poo.ejercicio1.entidades;

import java.util.Scanner;

public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int nroPag;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int nroPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPag = nroPag;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
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

    public int getNroPag() {
        return nroPag;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", nroPag=" + nroPag + '}';
    }

    public Libro crearLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el ISBN");
        int ISBN = leer.nextInt();
        System.out.println("Ingresa el Titulo");
        String titulo = leer.next();
        System.out.println("Ingresa el Autor");
        String autor = leer.next();
        System.out.println("Ingresa el Numero de Paginas");
        int numpag = leer.nextInt();

        return new Libro(ISBN, titulo, autor, numpag);
    }

}
