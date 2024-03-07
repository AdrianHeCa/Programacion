package Ev3.Ej1_Figura;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea(){
        double area = Math.pow(lado, 2);
        return area;
    }

    public double calcularPerimetro(){
        double perimetro = lado * 4;
        return perimetro;
    }
}
