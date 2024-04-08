package Ev3.Battleship;

import javax.swing.*;

public class Casilla extends JButton {
    private boolean hayBarco = false;

    public Casilla() {
    }

    public boolean getHayBarco() {
        return hayBarco;
    }

    public void setHayBarco(boolean hayBarco) {
        this.hayBarco = hayBarco;
    }
}
