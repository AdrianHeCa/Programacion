package Ev1;

import java.util.Scanner;

public class Practica_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qué quieres hacer?:");
        System.out.println("1 - sumar");
        System.out.println("2 - restar");
        System.out.println("3 - multiplicar");
        System.out.println("4 - dividir");
        int opt = Integer.parseInt(input.nextLine());

        System.out.println("Inserte el primer número:");
        double num1 = Double.parseDouble(input.nextLine());
        System.out.println("Inserte el segundo número:");
        double num2 = Double.parseDouble(input.nextLine());
        
        if (opt == 1) {
            double resultado = num1 + num2;
            System.out.println("El resultado es: " + resultado);
        }else if (opt == 2) {
            double resultado = num1 - num2;
            System.out.println("El resultado es: " + resultado);
        }else if (opt == 3) {
            double resultado = num1 * num2;
            System.out.println("El resultado es: " + resultado);
        }else if(opt == 4) {
            double resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        }else {
            System.out.println("Inserte un número válido.");
        }
        input.close();
    }
}
