import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] palabras = {   "zimbabwe", "ouagadougou", 
                                "supercalifragilisticoespialidoso", 
                                "epiglotis", "esternocleidomastoideo",
                                "otorrinonaringologo", "ornitorrinco",
                                "mrbeast", "almendruco", "luminiscencia"};
        int numPalabra = random.nextInt(9);
        String palabra = palabras[numPalabra];
        char[] letrasPalabra = palabra.toCharArray();
        int intentos = 5;

        char[] slotsPalabra = new char[letrasPalabra.length];
        for (int i = 0; i < slotsPalabra.length; i++) {
            slotsPalabra[i] = '_';
        }

        while (intentos != 0 && !palabra.equals(new String(slotsPalabra))) {
            int letrasAcertadas = 0;
            System.out.println(slotsPalabra);
            System.out.println("Introduce una letra:");
            char letra = input.nextLine().charAt(0);
        
            for (int i = 0; i < slotsPalabra.length; i++) {
                if (letrasPalabra[i] == letra) {
                    slotsPalabra[i] = letra;
                    letrasAcertadas++;
                }
            }

            if (letrasAcertadas > 0) {
                System.out.println("Has acertado " + letrasAcertadas + " letra(s).\n");
            } else {
                intentos--;
                System.out.println("No se encuentra esa letra en la palabra.");
                System.out.println("Te queda(n) " + intentos + " intento(s).\n");
            }

            if (palabra.equals(new String(slotsPalabra))) {
                System.out.println("Congratulaciones, has ganado!");
            }

            if (intentos == 0) {
                System.out.println("Terrible...");
            }
        }
        input.close();
    }
}