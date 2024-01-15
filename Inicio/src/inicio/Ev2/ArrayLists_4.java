package Ev2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayLists_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Moto> listaMotos = new ArrayList<>(5);
        Moto moto1 = new Moto("Honda", 2021, "Rojo");
        listaMotos.add(moto1);
        Moto moto2 = new Moto("Yamaha", 2020, "Negro");
        listaMotos.add(moto2);
        Moto moto3 = new Moto("Suzuki", 2019, "Azul");
        listaMotos.add(moto3);
        Moto moto4 = new Moto("Kawasaki", 2018, "Verde");
        listaMotos.add(moto4);
        Moto moto5 = new Moto("Ducati", 2017, "Blanco");
        listaMotos.add(moto5);

        System.out.println("Lista:");
        for (Moto moto : listaMotos) {
            moto.imprimirMoto();
        }
        
        System.out.println("Lista por marca:");
        Collections.sort(listaMotos, Comparator.comparing(Moto::getMarca));
        for (Moto moto : listaMotos) {
            moto.imprimirMoto();
        }

        System.out.println("Lista por año:");
        Collections.sort(listaMotos, Comparator.comparingInt(Moto::getAño).reversed());
        for (Moto moto : listaMotos) {
            moto.imprimirMoto();
        }

        System.out.println("Escribe un color");
        String colorBuscado = input.nextLine();
        boolean encontrada = false;
        for (Moto moto : listaMotos) {
            if (moto.getColor().equalsIgnoreCase(colorBuscado)) {
                encontrada = true;
                moto.imprimirMoto();
            }
        }

        if (!encontrada) {
            System.out.println("Moto de ese color no encontrada.");
        }

        input.close();
    }
}
