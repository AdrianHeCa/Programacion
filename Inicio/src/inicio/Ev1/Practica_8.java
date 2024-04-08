package Ev1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Practica_8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quieres calcular el area de un:");
        System.out.println("1 - Triangulo");
        System.out.println("2 - Cuadrado");
        System.out.println("3 - Pentágono");
        int opt = Integer.parseInt(input.nextLine());
        
        if (opt == 1) {
            System.out.println("Inserte la longitud de los lados:");
            double lado = Double.parseDouble(input.nextLine());
            
            double area = (Math.sqrt(3)/4) * Math.pow(lado, 2);
            System.out.println("El area es: " + area);
        }else if (opt == 2) {
            System.out.println("Inserte la longitud de los lados:");
            double lado = Double.parseDouble(input.nextLine());
            
            double area = Math.pow(lado, 2);
            System.out.println("El area es: " + area);
        }else if (opt == 3) {
            System.out.println("Inserte el perímetro:");
            double perimetro = Double.parseDouble(input.nextLine());
            System.out.println("Inserte el apotema:");
            double apotema = Double.parseDouble(input.nextLine());
            
            double area = (perimetro * apotema) / 2;
            System.out.println("El area es: " + area);
        }else {
            System.out.println("Inserte un número válido.");
        }
        input.close();
    }
}
