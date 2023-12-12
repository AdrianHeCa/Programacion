package Ev2;

public class Bombilla {
    private boolean estado;
    private int potencia;
    private String color;
    private double horas;

    public Bombilla(int potencia, String color) {
        this.estado = false;
        this.potencia = potencia;
        this.color = color;
        this.horas = 10.0;
    }

    public void encender(double tiempoEncendida) {
        if (horas > 0) {
            horas -= tiempoEncendida;
            estado = true;
        } else {
            System.out.println("No hay horas disponibles para encender la bombilla.");
        }
    }

    public void apagar() {
        estado = false;
    }

    public String getEstado() {
        if (estado) {
            return "Encendida";
        }else {
            return "Apagada";
        }
    }

    public void setPotencia(int nuevaPotencia) {
        this.potencia = nuevaPotencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setColor(String nuevoColor) {
        if (estado) {
            apagar();
        }
        this.color = nuevoColor;
    }

    public void visualizarColor() {
        System.out.println("El color de la bombilla es: " + color);
    }

    public void recargar(double horasRecarga) {
        this.horas += horasRecarga;
        System.out.println("Se han recargado " + horasRecarga + " horas.");
    }

    public static void main(String[] args) {
        Bombilla salon = new Bombilla(60, "Blanco");
        Bombilla cocina = new Bombilla(40, "Amarillo");
        Bombilla habitacion = new Bombilla(75, "Azul");

        salon.encender(5.0);
        salon.visualizarColor();
        salon.recargar(5.0);
        cocina.setColor("Rojo");
        habitacion.setPotencia(100);
        habitacion.encender(2.5);
        System.out.println("Estado de la bombilla del salón: " + salon.getEstado());
        System.out.println("Estado de la bombilla de la cocina: " + cocina.getEstado());
        System.out.println("Estado de la bombilla de la habitación: " + habitacion.getEstado());

    }
}
