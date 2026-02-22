package AEA3.entregas.FIGURA;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Figura(null, 0);
        figura1.imprimirDades();

        Triangle triangulo1 = new Triangle(3,6);
        triangulo1.imprimirDades();

        Quadrat quadrat1 = new Quadrat(7);
        quadrat1.imprimirDades();

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setAltura(2);
        rectangle1.setBase(8);
        rectangle1.imprimirDades();

        Trapezi trapezi1 = new Trapezi(6,4,10);
        trapezi1.imprimirDades();

        Rombe rombe1 = new Rombe(5,1);
        rombe1.imprimirDades();

        Paralelogramo paralelogramo1 = new Paralelogramo(2,7);
        paralelogramo1.imprimirDades();

        Circulo cercle1  =new Circulo(5.2);
        cercle1.imprimirDades();

    }
}
