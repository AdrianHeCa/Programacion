package Ev2;

public class Factura {
    private int codigo;
    private double coste;

    public Factura(int codigo, double coste) {
        this.codigo = codigo;
        this.coste = coste;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public void imprimir() {
        double costeIVA = coste + coste * 0.21;
        System.out.println("Factura: " + codigo);
        System.out.println("Coste: $" + costeIVA);
    }

    // Método para probar la clase Factura
    public static void main(String[] args) {
        Factura factura = new Factura(1, 100.01);

        factura.imprimir();

        factura.setCoste(200.02);

        factura.imprimir();

        factura.setCodigo(2);

        factura.imprimir();
    }
}
