package Ev3.Battleship;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Battleship {
    public static int intentos;
    public static int barcos;
    public static Random random = new Random();
    public static Dimension pantalla = Toolkit. getDefaultToolkit(). getScreenSize();
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Battleship");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setBounds((int)pantalla.getWidth()/2 - 250, (int)pantalla.getHeight()/2 - 250, 500, 250);
        JPanel panel = new JPanel(new GridLayout(2,1,5,5));
        ventana.add(panel);
        JLabel texto = new JLabel("Battleship", SwingConstants.CENTER);
        panel.add(texto);
        JButton boton = new JButton("Iniciar Juego");
        panel.add(boton);
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iniciarJuego();
            }
        });
        ventana.setVisible(true);
    }

    public static void iniciarJuego() {
        intentos = 20;
        barcos = 5;
        JFrame ventana = new JFrame("Battleship");
        ventana.setBounds((int)pantalla.getWidth()/2 - 250, (int)pantalla.getHeight()/2 - 250, 500, 500);
        JPanel panelSuperior = new JPanel(new GridLayout(1,2,5,5));
        JLabel textoIntentos = new JLabel();
        actualizarTextoIntentos(textoIntentos);
        panelSuperior.add(textoIntentos);
        JLabel textoBarcos = new JLabel();
        actualizarTextoBarcos(textoBarcos);
        panelSuperior.add(textoBarcos);
        ventana.add(panelSuperior, BorderLayout.NORTH);
        JPanel panelInferior = new JPanel(new GridLayout(5,5,5,5));
        panelInferior.setBackground(new Color(0, 0, 0));
        ventana.add(panelInferior, BorderLayout.CENTER);

        ArrayList<Casilla> casillas = new ArrayList<Casilla>();
        for (int i = 1; i < 26; i++) {
            Casilla boton = new Casilla();
            boton.setBackground(new Color(20, 20, 20));
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (boton.getHayBarco()) {
                        boton.setBackground(new Color(255, 0, 69));
                        barcos--;
                        actualizarTextoBarcos(textoBarcos);
                    } else {
                        boton.setBackground(new Color(0, 255, 169));
                    }
                    intentos--;
                    actualizarTextoIntentos(textoIntentos);
                    boton.setEnabled(false);
                    if (barcos == 0) {
                        JOptionPane.showMessageDialog(null, "Has ganado! \n Que no es lo mismo que haz ganado.");
                        ventana.setVisible(false);
                    } else if (intentos == 0){
                        JOptionPane.showMessageDialog(null, "Has perdido");
                        ventana.setVisible(false);
                    }
                }
            });
            panelInferior.add(boton);
            casillas.add(boton);
        }

        for (int i = 0; i < 5; i++) {
            int numCasilla = random.nextInt(25);
            Casilla casilla = casillas.get(numCasilla);
            if (!casilla.getHayBarco()) {
                casilla.setHayBarco(true);
            } else {
                i--;
            }
        }

        ventana.setVisible(true);
    }

    public static void actualizarTextoIntentos(JLabel textoIntentos) {
        textoIntentos.setText("Intentos: " + String.valueOf(intentos));
    }

    public static void actualizarTextoBarcos(JLabel textoBarcos) {
        textoBarcos.setText("Barcos: " + String.valueOf(barcos));
    }
}
