package Ev2.HeroSlay;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Ev2.HeroSlay.Carta.TipoCarta;

public class Personaje {
    private String nombre;
    private Integer vida;
    private Integer maxVida;
    private Integer energia;
    private Boolean aturdido;
    private List<Carta> mazo;
    private List<Carta> mano; // Hago la mano una propiedad de Personaje para que te puedas quedar con la carta que no utilizaste

    public Personaje(String nombre, Integer vida, Integer energia, List<Carta> mazo) {
        this.nombre = nombre;
        this.vida = vida;
        this.maxVida = vida;
        this.energia = energia;
        this.aturdido = false;
        this.mazo = mazo;
        this.mano = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getVida() {
        return vida;
    }

    public Integer getEnergia() {
        return energia;
    }

    public Boolean getAturdido() {
        return aturdido;
    }

    public List<Carta> getMano() {
        return mano;
    }

    public void recuperarEnergia() {
        energia += 2;
    }

    public void sacarCartaDelMazo() {
        Random random = new Random();
        Carta cartaSacada = mazo.get(random.nextInt(mazo.size()));
        mano.add(cartaSacada);
    }

    public void mostrarMano() {
        System.out.println("Mano actual");
        mano.forEach((carta) -> carta.mostrarInfo());
    }

    public void usarCarta(Carta carta, Personaje contrincante) {
        if (energia - carta.getCoste() >= 0) {
            System.out.println(nombre + " ha usado " + carta.getNombre());
            if (carta.getTipo().equals(TipoCarta.ATAQUE)) {
                contrincante.recibirDaño(carta.getEfecto());
                energia -= carta.getCoste();
                mano.remove(carta);
            } else if (carta.getTipo().equals(TipoCarta.CURA)) {
                boolean seHaCurado = curarse(carta.getEfecto());
                if (seHaCurado) {
                    energia -= carta.getCoste();
                    mano.remove(carta);
                }
            } else if (carta.getTipo().equals(TipoCarta.ATURDIR)) {
                contrincante.aturdir(carta.getEfecto());
                energia -= carta.getCoste();
                mano.remove(carta);
            }
        } else {
            System.out.println(nombre + " ha intentado usar la carta " + carta.getNombre() + " pero no tiene suficiente energía");
        }
    }

    public void recibirDaño(int daño) {
        vida -= daño;
        if (vida < 0) {
            vida = 0;
        }
        if (vida > 0) {
            System.out.println(nombre + " ha recibido " + daño + " de daño");
            System.out.println("Le queda " + vida + " de vida");
        } else {
            System.out.println(nombre + " ha recibido " + daño + " de daño");
            System.out.println("El ataque ha sido fatal");
        }
    }

    public boolean curarse(int cura) {
        boolean seHaCurado;
        if (vida < maxVida) {
            vida += cura;
            if (vida > maxVida) {
                vida = maxVida;
            }
            System.out.println(nombre + " se ha curado " + cura + " de vida");
            System.out.println("Tiene " + vida + " de vida");
            seHaCurado = true;
            return seHaCurado;
        } else {
            System.out.println(nombre + " ha intentado curarse " + cura + " de vida pero ya la tenía al máximo");
            seHaCurado = false;
            return seHaCurado;
        }
    }

    public void aturdir(int daño) {
        aturdido = true;
        vida -= daño;
        System.out.println(nombre + " ha sido aturdido");
    }

    public void desaturdir() {
        if (aturdido == true) {
            aturdido = false;
            System.out.println(nombre + " se ha recuperado del aturdimiento");
        }
    }

    public void mostrarInfo() {
        System.out.println("---------------------");
        System.out.println(nombre);
        System.out.println("\nVida: " + vida);
        System.out.println("\nEnergía: " + energia);
        System.out.println("---------------------");
    }
}
