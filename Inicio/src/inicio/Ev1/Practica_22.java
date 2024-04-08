package Ev1;

import java.util.Scanner;

public class Practica_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String psw = "";
        int intentos = 3;

        while (!psw.equals("password") && intentos != 0) {
            System.out.println("Introduzca la contraseña");
            psw = input.nextLine();

            if (psw.equals("password")) {
                System.out.println("Contraseña correcta");
            } else {
                intentos--;
                System.out.println("Contraseña incorrecta, te queda(n) " + intentos + " intento(s)");
            }

            if (intentos == 0) {
                System.out.println("Demasiados intentos fallidos");
            }
        }
        input.close();
    }
}
