package AEA3.entregas.FIGURA_MEJORADO;

import CROSS.cross;

public class Rectangle extends Figura {
    private int base;
    private int altura;

    public Rectangle() {
        super("Rectangle", 03);
    }

    public Rectangle(int base, int altura) {
        super("Rectangle", 03);
        this.base=base;
        this.altura=altura;
    }

    //getter
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    //setter

    public void setBase(int nouBase) {
        base = nouBase;
    }

    public void setAltura(int nouAltura) {
        altura = nouAltura;
    }

    //funciones específicas
    public double calcularArea() {
        double area=base*altura;
        return area;
    }

    public void lectorRectangle() {
        base=cross.integerVerificacion("Introduce la base del rectángulo: ");
        altura=cross.integerVerificacion("Introduce la altura del rectángulo: ");
    }

}
