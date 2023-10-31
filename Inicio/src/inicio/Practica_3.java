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
public class Practica_3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int a = Integer.parseInt(input.nextLine());

        System.out.println("Su doble es " + (a * 2) + " y su triple " + (a * 3));
        input.close();
    }
}
