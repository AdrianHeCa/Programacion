import java.util.Scanner;
import java.util.Random;

public class MonkeyIsland {
    public static void main(String[] args) {
        Random random = new Random();

        String[] insultos = {   "¡Luchas como un ganadero!",
                                "Eres tan feo como un mono.",
                                "Tienes la lengua más larga que un par de serpientes enamoradas.",
                                "No tienes gracia, pareces un payaso triste.",
                                "¡He hablado con orangutanes más educados que tu!",
                                "¡No hay palabras para describir lo feo que eres!",
                                "Si la estupidez fuera un superpoder, ¡Serías invencible!",
                                "Eres más desordenado que un código sin comentar."
                                };

        String[] respuestas = { "¡Qué apropiado! Tú peleas como una vaca.",
                                "Me parece que te has visto en un espejo.",
                                "Para largo tengo el cortex frontal!",
                                "Al menos me puedo acercar a niños sin romper la ley.",
                                "Me alegra que asistas a tus reuniones familiares.",
                                "Sí que las hay, sólo que nunca las has aprendido.",
                                "Qué ingenioso. Pero, ¿quién necesita superpoderes cuando puedo derrotarte con pura astucia y estilo?",
                                "Al menos mi vida no necesita un \"debugger\" para entenderse."
                                };

        int asaltosGanadosJugador = 0;
        int asaltosGanadosOrdenador = 0;

        boolean jugadorInicia = random.nextBoolean();

        while (asaltosGanadosJugador < 3 && asaltosGanadosOrdenador < 3) {
            String insulto;
            String respuesta;
            System.out.println("\n-----Comienzo de ronda-----");
            
            if (jugadorInicia) {
                int eleccion = elegirFrase(insultos, "\nElíge un insulto:");
                // Para ayudar al ordenador a tener una oporunidad de ganar, pongo una probabilidad de acertar de 33%.
                int probabilidadAcertarOrdenador = random.nextInt(2);
                
                if (probabilidadAcertarOrdenador == 0) {
                    respuesta = respuestas[eleccion];
                    System.out.println("\n" + "Ordenador: " + respuesta + "\n");
                    System.out.println("\nPerdiste esta ronda.");
                    asaltosGanadosOrdenador++;
                }else {
                    int respuestaOrdenador = random.nextInt(respuestas.length);
                    respuesta = respuestas[respuestaOrdenador];
                    System.out.println("\n" + "Ordenador: " + respuesta + "\n");

                    if (eleccion != respuestaOrdenador) {
                        System.out.println("\n¡Ganaste la ronda!");
                        asaltosGanadosJugador++;
                    } else {
                        System.out.println("\nPerdiste esta ronda.");
                        asaltosGanadosOrdenador++;
                    }
                }

            } else {
                int insultoOrdenador = random.nextInt(insultos.length);
                insulto = insultos[insultoOrdenador];
                System.out.println("\n" + "Ordenador: " + insulto + "\n");
                int eleccion = elegirFrase(respuestas, "Elíge una respuesta:");
                if (insultoOrdenador == eleccion) {
                    System.out.println("\n¡Ganaste la ronda!");
                    asaltosGanadosJugador++;
                } else {
                    System.out.println("\nPerdiste esta ronda.");
                    asaltosGanadosOrdenador++;
                }
            }

            System.out.println("Jugador " + asaltosGanadosJugador + " / " + "Ordenador " + asaltosGanadosOrdenador);
            
            if (asaltosGanadosJugador == 3) {
                System.out.println("\n-----¡¡¡Has ganado el duelo!!!-----\n");
            }

            if (asaltosGanadosOrdenador == 3) {
                System.out.println("\n-----Has perdido el duelo.-----\n");
            }

            jugadorInicia = !jugadorInicia;
        }
        
    }
    
    private static int elegirFrase(String[] frases, String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        for (int i = 0; i < frases.length; i++) {
            System.out.println((i + 1) + ". " + frases[i]);
        }
        int eleccion = input.nextInt();
        return eleccion - 1;
    }
}