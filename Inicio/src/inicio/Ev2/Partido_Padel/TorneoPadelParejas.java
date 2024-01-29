package Ev2.Partido_Padel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TorneoPadelParejas {
    public static List<Pareja> parejasTorneo;
    public static Integer maxIdParejas = 1;

    public static List<Partido> partidosTorneo;
    public static Integer maxIdPartidos = 1;
    public static Integer rondaActual = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println("Nuevo torneo de padel");
        System.out.println("---------------------");

        parejasTorneo = new ArrayList<>();
        partidosTorneo = new ArrayList<>();

        System.out.println("---------------------");
        System.out.println("¿Qué deseas hacer?");
        System.out.println("0 - Cerrar aplicación");
        System.out.println("1 - Crear pareja");
        System.out.println("2 - Eliminar pareja");
        System.out.println("3 - Mostrar parejas");
        System.out.println("4 - Generar rondaActual");
        System.out.println("5 - Mostrar partidos");
        System.out.println("---------------------");

        System.out.println(">>");
        Integer funcion = Integer.valueOf(sc.nextLine());

        while (funcion != 0) {
            switch (funcion) {
                case 1 -> inscribirPareja(sc);
                case 2 -> eliminarPareja(sc);
                case 3 -> pintarParejas();
                case 4 -> generarRonda();
                case 5 -> pintarPartidos();
            }
            System.out.println("---------------------");
            System.out.println("¿Qué quieres hacer?");
            System.out.println(">>");
            funcion = Integer.valueOf(sc.nextLine());
        }
    }

    private static void inscribirPareja(Scanner sc) {
        Integer id = maxIdParejas;
        System.out.println("Nombre del jugador 1:");
        String persona1 = sc.nextLine();
        System.out.println("Nombre del jugador 2:");
        String persona2 = sc.nextLine();
        System.out.println("Telefono de contacto:");
        Integer telefono = Integer.valueOf(sc.nextLine());

        Pareja p = new Pareja(id, persona1, persona2, telefono);

        parejasTorneo.add(p);

        maxIdParejas++;
    }

    private static void eliminarPareja(Scanner sc) {
        System.out.println("Id de la pareja a eliminar:");
        Integer id = Integer.valueOf(sc.nextLine());

        try {
            parejasTorneo.removeIf(pareja -> id.equals(pareja.getId()));
            System.out.println("Pareja eliminada.");
        } catch (Exception e) {
            System.out.println("No se pudo eliminar la pareja.");
        }
    }

    private static void pintarParejas() {
        for (Pareja pareja : parejasTorneo) {
            pareja.pintarPareja();
        }

        if (parejasTorneo.isEmpty()) {
            System.out.println("No hay parejas en el torneo.");
        }
    }

    private static void generarRonda() {
        // List<Pareja> parejasDisponibles = new ArrayList<>(parejasTorneo);
        Partido partido;

        int i = 0;
        while (i < parejasTorneo.size()) {
            Pareja p1;
            Pareja p2;
            if (parejasTorneo.size() % 2 == 0) {
                p1 = parejasTorneo.get(i);
                p2 = parejasTorneo.get(i++);
            } else {
                p1 = parejasTorneo.get(i);
                p2 = null;
            }

            partido = new Partido(  maxIdPartidos, 
                                    p1, 
                                    p2, 
                                    null, 
                                    null, 
                                    rondaActual);

            partidosTorneo.add(partido);
            i += 2;
            maxIdPartidos++;
        }
        rondaActual++;
    }

    private static void pintarPartidos() {
        for (Partido partido : partidosTorneo) {
            if (partido.getRonda() == rondaActual - 1) {
                partido.pintarPartido();
            }
        }

        if (partidosTorneo.isEmpty()) {
            System.out.println("No hay partidos en el torneo.");
        }
    }
}
