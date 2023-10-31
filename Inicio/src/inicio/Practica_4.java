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
public class Practica_4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce grados Celsius:");
        double celsius = Double.parseDouble(input.nextLine());
        double farenheit = celsius * 1.8 + 32;
        System.out.println(celsius + "ºC en Farenheit es " + farenheit + "ºF");
        input.close();
    }
}
