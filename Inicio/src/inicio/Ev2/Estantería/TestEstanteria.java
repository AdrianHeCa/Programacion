package Ev2.Estantería;

public class TestEstanteria {
    public static void main(String[] args) {
        // Crear una Estantería vacía
        Estanteria e = new Estanteria();

        // Crear dos libros L1 y L2
        Libro L1 = new Libro("Libro1", "Autor1", 4);
        Libro L2 = new Libro("Libro2", "Autor2", 2);

        // Añadir los libros L1 y L2
        e.añadirLibro(L1);
        e.añadirLibro(L2);

        // Crear 3 libros más L3, L4 y L5 y añadirlos a e
        Libro L3 = new Libro("Libro3", "Autor3", 1);
        Libro L4 = new Libro("Libro4", "Autor4", 3);
        Libro L5 = new Libro("Libro5", "Autor5", 5);

        e.añadirLibro(L3);
        e.añadirLibro(L4);
        e.añadirLibro(L5);

        // Mostrar el Top10 de libros
        e.top10Libros();

        // Eliminar el Libro L3 por el criterio Autor
        e.quitarLibro("Autor3");

        // Mostrar toda la Estantería e
        System.out.println("\nEstantería después de eliminar L3:");
        e.mostrarLibros();
    }
}
