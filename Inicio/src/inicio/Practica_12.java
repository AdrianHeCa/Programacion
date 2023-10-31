package inicio;

import java.util.Scanner;

public class Practica_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un carácter:");
        char caracter = input.nextLine().charAt(0);

        if (Character.isUpperCase(caracter)) {
            System.out.println("Está en mayúscula");
        } else {
            System.out.println("No está en mayúscula");
        }
        input.close();
    }
}
