package Ev2.HeroSlay;

public class Carta {
    public enum TipoCarta
    {
        ATAQUE, CURA, ATURDIR
    }

    private String nombre;
    private TipoCarta tipo;
    private Integer efecto;
    private Integer coste;

    public Carta(String nombre, TipoCarta tipo, Integer efecto, Integer coste) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.efecto = efecto;
        this.coste = coste;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoCarta getTipo() {
        return tipo;
    }

    public Integer getEfecto() {
        return efecto;
    }

    public Integer getCoste() {
        return coste;
    }

    public void mostrarInfo() {
        System.out.println("---------------------");
        System.out.println(nombre);
        System.out.println("\nTipo: " + tipo);
        System.out.println("\nEfecto: " + efecto + " Coste: " + coste);
        System.out.println("---------------------");
    }
}
