/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package poo.ejercicio1;

import poo.ejercicio1.entidades.Libro;

public class POOEjercicio1 {

    public static void main(String[] args) {
        Libro libro1 = new Libro();

        libro1 = libro1.crearLibro();

        System.out.println(libro1);

    }

}
