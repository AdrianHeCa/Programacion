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
public class Practica_5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el radio de un círculo:");
        double radio = Double.parseDouble(input.nextLine());
        double longitud = Math.PI * radio;
        double area = radio * Math.pow(Math.PI, 2);

        System.out.println("Su longitud es: " + longitud + " y su área " + area);
        input.close();
    }
}
