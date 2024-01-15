package Ev2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EjercicioInicioListas {
    public static void main(String[] args) {
        List<String> listaDias = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domigo"));
        listaDias.add(4, "Juernes");
        List<String> listaDos = new ArrayList<>(listaDias);
        listaDias.addAll(listaDias);
        System.out.println(listaDias.get(3));
        System.out.println(listaDias.get(4));
        System.out.println(listaDias.get(0));
        System.out.println(listaDias.get(listaDias.size() - 1));
        System.out.println(listaDos);
        listaDos.remove(listaDos.get(4));
        System.out.println(listaDos + "Juernes borrado");
        for (int i = 0; i < listaDias.size(); i++) {
            System.out.println(listaDias.get(i));
        }
        if (listaDos.contains("Lunes")) {
            System.out.println("Yep");
        } else {
            System.out.println("Nop");
        }
        boolean contieneLunes = listaDias.stream().anyMatch(str -> str.equalsIgnoreCase("lunes"));
        if (contieneLunes) {
            System.out.println("Yep");
        } else {
            System.out.println("Nop");
        }
        Collections.reverse(listaDos);
        System.out.println(listaDos);
        Collections.sort(listaDos);
        System.out.println(listaDos);
        listaDias.removeAll(listaDias);
        System.out.println(listaDias);
        listaDos.removeAll(listaDos);
        System.out.println(listaDos);
    }
}
