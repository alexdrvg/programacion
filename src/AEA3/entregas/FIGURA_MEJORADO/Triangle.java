package AEA3.entregas.FIGURA_MEJORADO;

import CROSS.cross;

public class Triangle extends Figura {
    private int base;
    private int h;

    public Triangle () {
        super("Triangle", 01);
    }

    public Triangle (int base, int h) {
        super("Triangle", 01);
        this.base=base;
        this.h=h;
    }

    //getters
    public int getBase() {
        return base;
    }

    public int getH() {
        return h;
    }

    //setters

    public void setBase(int nouBase) {
        base = nouBase;
    }

    public void setId(int nouH) {
        h = nouH;
    }

    //funciones específicas

    public double calcularArea() {
        double area = (base*h)/2;
        return area;
    }

    public void lectorTriangle() {
        base =cross.integerVerificacion("Introduce la base del triángulo: ");
        h = cross.integerVerificacion("Introduce la altura del triángulo: ");
    }

}
