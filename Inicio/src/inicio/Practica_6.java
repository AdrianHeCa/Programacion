/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Practica_6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce km/h:");
        double kmh = Double.parseDouble(input.nextLine());
        double ms = kmh / 3.6;
        System.out.println(kmh + "km/h en m/s es " + ms + "m/s");
        input.close();
    }
}
