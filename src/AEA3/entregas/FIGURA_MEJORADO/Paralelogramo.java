package AEA3.entregas.FIGURA_MEJORADO;

import CROSS.cross;

public class Paralelogramo extends Figura {
    private int base;
    private int h;

    public Paralelogramo(){
        super("Paral·lelogram", 06);
    }

    public Paralelogramo(int base, int h){
        super("Paral·lelogram", 06);
        this.base=base;
        this.h=h;
    }

    //getter
    public int getBase() {
        return base;
    }

    public int getH() {
        return h;
    }

    //setter
    public void setBase(int nouBase) {
        base = nouBase;
    }

    public void setH(int nouH) {
        h = nouH;
    }

    //funciones específicas
    public double calcularArea() {
        double area=base*h;
        return area;
    }

    public void lectorParalelogramo() {
        base = cross.integerVerificacion("Introduce la base del paralelogramo: ");
        h = cross.integerVerificacion("Introduce la altura del paralelogramo: ");

    }

}
