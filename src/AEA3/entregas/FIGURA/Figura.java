package AEA3.entregas.FIGURA;

public class Figura {
    private String figura;
    private int id;

    public Figura (String figura, int id) {
        this.figura=figura;
        this.id=id;
    }

    //getters

    public String getFigura() {
        return figura;
    }

    public int getId() {
        return id;
    }

    //setters

    public void setFigura(String nouFigura) {
        figura = nouFigura;
    }

    public void setId(int nouId) {
        id = nouId;
    }

    //funciones específicas 

    public void imprimirDades() {
        System.out.println();
        System.out.println("La figura amb ID "+id+" és un "+figura);
        System.out.println("L'àrea del "+figura+" és: "+calcularArea()); //????????
        System.out.println("_____________________________________________");
    }

    public double calcularArea() { 
        System.out.println("No hi ha cap àrea que calcular. ");
        return 0.0;
    }
    
}
