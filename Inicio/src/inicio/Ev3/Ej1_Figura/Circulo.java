package Ev3.Ej1_Figura;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double calcularPerimetro(){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
