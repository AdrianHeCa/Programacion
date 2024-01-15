package Ev2.Estantería;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Estanteria {
    private List<Libro> libros = new ArrayList<>();

    public void añadirLibro(Libro libro) {
        if (libros.size() <= 10 && !libros.contains(libro)) {
            libros.add(libro);
        } else {
            System.out.println("Error: No se pudo añadir el libro.");
        }
    }

    public void quitarLibro(String string) {
        try {
            Iterator<Libro> iterator = libros.iterator();
            while (iterator.hasNext()) {
                Libro libro = iterator.next();
                if (libro.getTitulo().equals(string) || libro.getAutor().equals(string)) {
                    iterator.remove();
                }
            }
        } catch (Exception e) {
            System.out.println("Error: No se pudo quitar el libro.");
        }
    }

    public void top10Libros() {
        try {
            List<Libro> librosTop10 = libros.stream().sorted(Comparator.comparingInt(Libro::getCalificacion).reversed()).collect(Collectors.toList());
            
            System.out.println("Top 10 de libros:");
            for (Libro libro : librosTop10) {
                int top = librosTop10.indexOf(libro) + 1;
                System.out.println("------------------");
                System.out.println("Top " + top);
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Calificación: " + libro.getCalificacion());
            }
        } catch (Exception e) {
            System.out.println("Error: No se pudo mostrar el Top 10.");
        }
    }

    public void mostrarLibros() {
        try {
            for (Libro libro : libros) {
                System.out.println("------------------");
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Calificación: " + libro.getCalificacion());
            }
        } catch (Exception e) {
            System.out.println("Error: No se pudieron mostrar los libros.");
        }
    }
}
