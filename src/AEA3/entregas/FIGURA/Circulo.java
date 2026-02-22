package AEA3.entregas.FIGURA;

public class Circulo extends Figura {
    private double radio;
    private double numeroPi=3.14159;

    public Circulo(){
        super("Cercle", 07);
    }
    
    public Circulo(double radio){
        super("Cercle", 07);
        this.radio=radio;
    }

    //getter
    public double getRadio() {
        return radio;
    }

    //setter
    public void setRadio(double nouRadio) {
        radio = nouRadio;
    }

    //funciones específicas
    public double calcularArea(){
        double area=numeroPi*(radio*radio);
        return area;
    }

}
