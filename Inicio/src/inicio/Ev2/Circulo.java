package Ev2;

public class Circulo {
    private double radio = 1.0;
    private String color = "rojo";
    
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double getCircumferencia() {
        double circumferencia = (Math.PI * 2) * radio;
        return circumferencia;
    }

    public String toString() {
        return "Círculo["+radio+"]";
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(13.13);
        
        System.out.println(circulo.getRadio());
        System.out.println(circulo.getColor());
        System.out.println(circulo.getArea());
        System.out.println(circulo.getCircumferencia());

        circulo.setRadio(1.15);
        System.out.println(circulo.getRadio());
        circulo.setColor("Fuchsia");
        System.out.println(circulo.getColor());
    }
}
