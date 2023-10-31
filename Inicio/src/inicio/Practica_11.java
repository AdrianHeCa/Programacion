package inicio;

import java.util.Scanner;

public class Practica_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int num = Integer.parseInt(input.nextLine());

        if (num % 2 == 0) {
            System.out.println("Es un número par");
        } else {
            System.out.println("No es un número par");
        }
        input.close();
    }
}
