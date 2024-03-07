package Ev3.Ej1_Figura;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        double area = (base * altura) / 2;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro = base + altura + Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
        return perimetro;
    }
}
