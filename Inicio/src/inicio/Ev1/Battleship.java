package Ev1;

import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[][] tablero = 
            {
                {true,false,false,false,false},
                {false,false,true,false,true},
                {false,true,false,false,false},
                {true,false,false,false,false},
                {false,false,true,true,false}
            };
        int intentos = 5;
        int barcosHundidos = 0;
        int y;
        int x;
        
        while (intentos > 0 && barcosHundidos < 7) {
            do {
                System.out.println("Escribe la cordenada y(1-5):");
                y = Integer.parseInt(input.nextLine()) - 1;
                if (y > 4) {
                    System.out.println("Escribe un número válido:");
                }
            } while (y > 4);
            do {
                System.out.println("Escribe la cordenada x(1-5):");
                x = Integer.parseInt(input.nextLine()) - 1;
                if (x > 4) {
                    System.out.println("Escribe un número válido:");
                }
            } while (x > 4);
            
            if (tablero[y][x] == true) {
                System.out.println("Acertaste");
                barcosHundidos++;
                tablero[y][x] = false;
            } else {
                intentos--;
                System.out.println("Fallaste, te quedan " + intentos + " intento(s).");
            }
        }

        if (barcosHundidos == 7) {
            System.out.println("Felicidades, has ganado!");
        } else {
            System.out.println("Perdiste.");
        }
        input.close();
    }
}