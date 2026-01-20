package AEA3.entregas.FIGURAS_ARITMETICAS;
import java.util.Scanner;

public class lectorFiguras {
    public static final Scanner s = new Scanner(System.in);
    public static double base, altura, radio, baseMayor, baseMenor; // al ponerlo static no hará falta crear una instancia para acceder a elles

    public void lectorTriangulo() {
        System.out.println("Introduce la base del tringualo: ");
        base = s.nextDouble(); 
        System.out.println("Introduce la altura del triangulo ");
        altura = s.nextDouble(); 
    }

    public void lectorRectangulo() {
        System.out.println("Introduce la base del rectangulo: ");
        base = s.nextDouble(); 
        System.out.println("Introduce la altura del rectangulo ");
        altura = s.nextDouble(); 
    }

    public void lectorCirculo() {
        System.out.println("Introduce el radio: ");
		radio = s.nextDouble();
    }

    public void lectorTrapezio() {
        System.out.println("Introduce la base mayor: ");
        baseMayor = s.nextDouble();

        System.out.println("Introduce la base menor: ");
        baseMenor = s.nextDouble();

        System.out.println("Introduce la altura: ");
        altura = s.nextDouble();

    }

    public void lectorParalelogramo() {
        System.out.println("Introduce la base: ");
        base = s.nextDouble();

        System.out.println("Introduce la altura: ");
        altura = s.nextDouble();
    }

}
