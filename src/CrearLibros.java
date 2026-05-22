/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class CrearLibros {
    public static void main(String[] args) {
        Libro l = new Libro("Harry Popotes", "Moreno de fuego", 10.0, 100);
        AccesoArchivo.appendArchivo("libros.txt", l);
        l = new Libro("El principon", "Puchis", 15.0, 3);
        AccesoArchivo.appendArchivo("libros.txt", l);
        l = new Libro("La biblia", "!Piripi", 5000000.0, 1);
        AccesoArchivo.appendArchivo("libros.txt", l);
        l = new Libro("Chucho preguntas: El libro", "Puchis", 0.1, 1560);
        AccesoArchivo.appendArchivo("libros.txt", l);
    }
}