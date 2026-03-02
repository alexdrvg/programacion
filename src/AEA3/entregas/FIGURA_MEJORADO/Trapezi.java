package AEA3.entregas.FIGURA_MEJORADO;

import CROSS.cross;

public class Trapezi extends Figura {
    private int a; // base mayor 
    private int b; //base menor
    private int h; //altura

    public Trapezi() {
        super("Trapezi", 04);
    }

    public Trapezi(int a, int b, int h){
        super("Trapezi", 04);
        this.a=a;
        this.b=b;
        this.h=h;
    }

    //getter
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    //setter

    public void setA(int nouA) {
        a = nouA;
    }

    public void setB(int nouB) {
        b = nouB;
    }

    public void setH(int nouH) {
        h = nouH;
    }

    //funciones específicas
    public double calcularArea(){
        double area=(a+b)*h/2;
        return area;
    }

    public void lectorTrapezi() {
        a=cross.integerVerificacion("Introduce la base mayor del trapezio: ");
        b=cross.integerVerificacion("Introduce la base menor del trapezio: ");
        h=cross.integerVerificacion("Introduce la altura del trapezio: ");
    }


}
