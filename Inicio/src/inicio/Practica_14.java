import java.util.Scanner;

public class Practica_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el primer carácter:");
        Character c1 = input.nextLine().charAt(0);
        System.out.println("Introduzca el segundo carácter:");
        Character c2 = input.nextLine().charAt(0);

        if(c1.equals(c2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        input.close();
    }
}
