package Ev2;

public class Moto {
    private String marca;
    private int año;
    private String color;

    public Moto(String marca, int año, String color) {
        this.marca = marca;
        this.año = año;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }

    public void imprimirMoto() {
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
        System.out.println("--------------------------");
    }
}
