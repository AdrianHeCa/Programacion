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
public class Practica_7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce €:");
        double € = Double.parseDouble(input.nextLine());
        double pts = € * 166.386;
        System.out.println(€ + "€ en Pts es " + pts + "Pts");
        input.close();
    }
}
