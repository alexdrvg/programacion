package AEA3.entregas.FIGURA;

public class Rectangle extends Figura {
    private int base;
    private int altura;

    public Rectangle() {
        super("Rectangle", 03);
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

}
