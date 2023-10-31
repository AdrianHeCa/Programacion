/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicio;

import java.util.Scanner;
/**
 *
 * @author adria
 */
public class Practica_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número a:");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("Introduce el número b:");
        int b = Integer.parseInt(input.nextLine());

        System.out.println("Su suma es: " + (a + b));
        input.close();
    }
}
