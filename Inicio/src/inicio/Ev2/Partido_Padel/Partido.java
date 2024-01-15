package Ev2.Partido_Padel;

public class Partido {
    private Integer id;
    private Pareja pareja1;
    private Pareja pareja2;
    private String resultado;
    private Pareja ganadores;
    private Integer ronda;

    public Partido(Integer id, Pareja pareja1, Pareja pareja2, String resultado, Pareja ganadores, Integer ronda) {
        this.id = id;
        this.pareja1 = pareja1;
        this.pareja2 = pareja2;
        this.resultado = resultado;
        this.ganadores = ganadores;
        this.ronda = ronda;
    }

    public Integer getRonda() {
        return ronda;
    }
    
    public void pintarPartido() {
        System.out.println("---------------------");
        System.out.println("Id: " + id);
        System.out.println("Pareja 1: " + pareja1.getId());
        if (pareja2.getId() != null) {
            System.out.println("Pareja 2: " + pareja2.getId());
        } else {
            System.out.println("Pareja 2: null");
        }
        System.out.println("Resultado: " + resultado);
        System.out.println("Ganadores: " + ganadores);
        System.out.println("Ronda: " + ronda);
    }
}
