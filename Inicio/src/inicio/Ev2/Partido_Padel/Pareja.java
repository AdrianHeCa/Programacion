package Ev2.Partido_Padel;

public class Pareja {
    private Integer id;
    private String persona1;
    private String persona2;
    private Integer telefono;

    public Pareja(Integer id, String persona1, String persona2, Integer telefono) {
        this.id = id;
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public String getPersona1() {
        return persona1;
    }

    public String getPersona2() {
        return persona2;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void pintarPareja() {
        System.out.println("---------------------");
        System.out.println("Id: " + id);
        System.out.println("Persona 1: " + persona1);
        System.out.println("Persona 2: " + persona2);
        System.out.println("Teléfono: " + telefono);
    }
}
