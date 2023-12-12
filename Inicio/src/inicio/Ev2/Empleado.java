package Ev2;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado(int id, String nombre, String apeellido, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apeellido;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalarioAnual() {
        return salario * 12;
    }

    public int aumentarSalario(double porcentaje) {
        return salario = (int) (salario * (1 + (porcentaje / 100)));
    }

    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado(1, "Paco", "Jones", 1000);

        System.out.println(empleado.getId());
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getApellido());
        System.out.println(empleado.getNombreCompleto());
        System.out.println(empleado.getSalario());
        System.out.println(empleado.getSalarioAnual());
        System.out.println(empleado.aumentarSalario(21));
    }
}
