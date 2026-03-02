package AEA3.entregas.FIGURA_MEJORADO;

import CROSS.cross;

public class Quadrat extends Figura {
    private int costat;

    public Quadrat () {
        super("Quadrat", 02);
    }

    public Quadrat (int costat) {
        super("Quadrat", 02);
        this.costat=costat;
    }

    //getters
    public int getCostat() {
        return costat;
    }

    //setters
    public void setCostat(int nouCostat) {
        costat = nouCostat;
    }

    //función específica 

    public double calcularArea() {
        double area = costat*costat;
        return area;
    }

    public void lectorQuadrat() {
        costat = cross.integerVerificacion("Introduce el lado del cuadrado: ");
    }
}
