package Ev2.HeroSlay;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Ev2.HeroSlay.Carta.TipoCarta;

public class Battalla {
    public static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);
    public static List<Carta> mazo = new ArrayList<>();
    public static Boolean jugadorInicial = random.nextBoolean();

    public static void main(String[] args) {

        Carta bofetada = new Carta("Bofetada", TipoCarta.ATAQUE, 2, 1);
        Carta hostiaGorda = new Carta("Hostia Gorda", TipoCarta.ATAQUE, 4, 3);
        Carta curita = new Carta("Curita", TipoCarta.CURA, 2, 2);
        Carta vendas = new Carta("Vendas", TipoCarta.CURA, 5, 4);
        Carta pedroloALaCabeza = new Carta("Pedrolo a la cabeza", TipoCarta.ATURDIR, 1, 4);

        mazo.add(bofetada);
        mazo.add(hostiaGorda);
        mazo.add(curita);
        mazo.add(vendas);
        mazo.add(pedroloALaCabeza);
        
        Personaje heroe = new Personaje("Héroe", 10, 3, mazo);
        Personaje villano = new Personaje("Villano", 10, 3, mazo);
        
        while (heroe.getVida() > 0 && villano.getVida() > 0) {
            iniciarRonda(heroe, villano);
        }

        if (villano.getVida() == 0) {
            System.out.println("\nHeroe ha ganado la battalla");
        } else {
            System.out.println("\nVillano ha ganado la battalla");
        }
    }

    private static void iniciarRonda(Personaje heroe, Personaje villano) {
        System.out.println("---------------------");
        System.out.println("Inicio de Ronda");
        System.out.println("---------------------\n");
        heroe.mostrarInfo();
        villano.mostrarInfo();

        if (jugadorInicial && !heroe.getAturdido()) {
            System.out.println("\n---------------------");
            System.out.println("Turno del Héroe");
            System.out.println("---------------------");

            if (heroe.getMano().isEmpty()) {
                heroe.sacarCartaDelMazo();
                heroe.sacarCartaDelMazo();
            } else if (heroe.getMano().size() == 1) {
                heroe.sacarCartaDelMazo();
            }

            heroe.mostrarMano();

            System.out.println("Tienes " + heroe.getEnergia() + " de Energía");
            System.out.println("Elige una carta de la mano (1,2):");
            Carta cartaElegida = heroe.getMano().get(Integer.valueOf(sc.nextLine()) - 1);
            System.out.println("\n");
            villano.desaturdir();
            heroe.usarCarta(cartaElegida, villano);
            heroe.recuperarEnergia();
            System.out.println("\n");
        } else if (!jugadorInicial && !villano.getAturdido()) {
            System.out.println("\n---------------------");
            System.out.println("Turno del Villano");
            System.out.println("---------------------");
        
            if (villano.getMano().isEmpty()) {
                villano.sacarCartaDelMazo();
                villano.sacarCartaDelMazo();
            } else if (villano.getMano().size() == 1) {
                villano.sacarCartaDelMazo();
            }

            Carta cartaElegida = villano.getMano().get(random.nextInt(0,1));
            System.out.println("\n");
            heroe.desaturdir();
            villano.usarCarta(cartaElegida, heroe);
            villano.recuperarEnergia();
            System.out.println("\n");
        } else {
            System.out.println("\nSe salta la ronda\n");
        }

        jugadorInicial = !jugadorInicial;
    }
}
