package Ev2.Examen_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe representa la lista de Artistas.
 * Debereis programar cada uno de los métodos con su funcionalidad.
 * Debereis crear el enum EstiloMusical y la classe Artista según el enuncuado.
 * Autor: Adrián Herrera Camino
 */
public class ColeccionArtistas {
    
    List<Artista> artistas = new ArrayList<>();
    
    /* No modificar */
    public ColeccionArtistas(List<Artista> artistas){
        this.artistas = artistas;
    }
    
    /* No modificar */
    public ColeccionArtistas(){
        this.artistas = new ArrayList<>();
    }
    
    //Debeis implementar los siguientes métodos:
    
    /**
     * Añade un nuevo artista a la colección.
     * El nuevo artista vendrá dado por parámetros.
     */
    public void añadirArtista(Artista artista){
        if (artista != null) {
            artistas.add(artista);
        } else {
            System.out.println("No se ha proporcionado un artista.");
        }
    }
    
    /**
     * Pinta la información de todos los artistas de tu colección.
     * Pista: Utilizar artisa.pintarInformacion()
     */
    public void pintarColeccion(){
        if (artistas.size() > 0) {
            artistas.forEach(artista -> artista.pintarInformacion());
        } else {
            System.out.println("No hay artistas que pintar");
        }
    }
    
    /**
     * Pinta por consola la información de un artista a partir de su nombre.
     * Se supone que no habrá varios artistas con el mismo nombre.
     */
    public void pintarArtistaPorNombre(String nombre){
        boolean artistaEncontrado = false;
        for (Artista artista : artistas) {
            if (artista.getNombre().equals(nombre)) {
                artistaEncontrado = true;
                artista.pintarInformacion();
            }
        }
        if (!artistaEncontrado) {
            System.out.println("No se ha encontrado nungún artista.");
        }
    }
    
    /**
     * Encuentra y devuelve el Artista de tu colección,
     * a partir del nombre de su canción más destacada.
     * Si no encuentra la canción, debe devolver null.
     */
    public Artista artistaPorCancion(String cancion){
        for (Artista artista : artistas) {
            if (artista.getCancion().equals(cancion)) {
                return artista;
            }
        }
        return null;
    }
    
    /**
     * Devuelve todos los artistas de tu colección, 
     * que coincidan con el estilo musical pasado por parámetros.
     * Si no encuentra ningún artista, debe devolver una lista vacia.
     */
    public List<Artista> artistasPorEstilo(EstiloMusical estilo){
        List<Artista> artistasPorEstilo = new ArrayList<>();
        for (Artista artista : artistas) {
            if (artista.getEstilo().equals(estilo)) {
                artistasPorEstilo.add(artista);
            }
        }
        if (artistasPorEstilo.size() > 0) {
            return artistasPorEstilo;
        }
        return new ArrayList<>();
    }
    
    /**
     * Devuelve el artista mas escuchado de tu colección.
     * Si no encuentra ningún artista, devolver null.
     */
    public Artista artistaMasEscuchado(){
        int maxOyentes = 0;
        Artista artistaMasEscuchado = null;
        for (Artista artista : artistas) {
            if (artista.getOyentes() > maxOyentes) {
                maxOyentes = artista.getOyentes();
                artistaMasEscuchado = artista;
            }
        }
        if (maxOyentes > 0) {
            return artistaMasEscuchado;
        }
        return null;
    }
    
    /**
     * Imprime por pantalla todos los tipos de estilos musicales de la colección.
     * Importante: No deben aparecer repetidos.
     */
    public void pintarEstilosMusicales(){
        List<EstiloMusical> estilosMusicales = new ArrayList<>();
        for (Artista artista : artistas) {
            if (!estilosMusicales.contains(artista.getEstilo())) {
                estilosMusicales.add(artista.getEstilo());
            }
        }
        if (estilosMusicales.size() > 0) {
            estilosMusicales.forEach(estilo -> System.out.println(estilo));
        } else {
            System.out.println("No se han encontrado estilos musicáles.");
        }
    }
}
