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
        Carta hostiaGorda = new Carta("Ostia Gorda", TipoCarta.ATAQUE, 4, 3);
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
            turno(heroe, villano);
        } else if (!jugadorInicial && !villano.getAturdido()) {
            turno(villano, heroe);
        } else {
            System.out.println("\nSe salta la ronda\n");
        }

        jugadorInicial = !jugadorInicial;
    }

    private static void turno(Personaje personaje, Personaje enemigo) {
        System.out.println("\n---------------------");
        System.out.println("Turno del " + personaje.getNombre());
        System.out.println("---------------------");

        if (personaje.getMano().isEmpty()) {
            personaje.sacarCartaDelMazo();
            personaje.sacarCartaDelMazo();
        } else if (personaje.getMano().size() == 1) {
            personaje.sacarCartaDelMazo();
        }

        personaje.mostrarMano();
        
        Carta cartaElegida;
        if (personaje.getNombre().equals("Héroe")) {
            System.out.println("Tienes " + personaje.getEnergia() + " de Energía");
            System.out.println("Elige una carta de la mano (1,2):");
            cartaElegida = personaje.getMano().get(Integer.valueOf(sc.nextLine()) - 1);
        } else {
            cartaElegida = personaje.getMano().get(random.nextInt(0,1));
        }

        System.out.println("\n");
        enemigo.desaturdir();
        personaje.usarCarta(cartaElegida, enemigo);
        personaje.recuperarEnergia();
        System.out.println("\n");
    }
}
