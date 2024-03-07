package Ev3.Ej1_Figura;

public class test {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(13);
        Cuadrado cuadrado = new Cuadrado(13);
        Rectangulo rectangulo = new Rectangulo(13, 13);

        System.out.println("Círculo:");
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

        System.out.println("Cuadrado:");
        System.out.println(cuadrado.calcularArea());
        System.out.println(cuadrado.calcularPerimetro());

        System.out.println("Rectángulo:");
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());
    }
}
