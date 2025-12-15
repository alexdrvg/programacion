package AEA3;
import java.util.Scanner; 

public class prueba {
    public static final Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Escoge la figura para saber calcular su area (triangulo, rectangulo o circulo): ");
        String figuraEscogida = s.nextLine();
        
        if (figuraEscogida.equalsIgnoreCase("triangulo")) {
            calcularTriangulo();
        } else if (figuraEscogida.equalsIgnoreCase("rectangulo")) {
            calcularRectangulo();
        } else if (figuraEscogida.equalsIgnoreCase("circulo")) {
            calcularCirculo();
        }
    }

    public static void calcularTriangulo() {
        System.out.println("Introduce la base del tringualo: ");
        double baseTriangulo = s.nextDouble(); 
        System.out.println("Introduce la altura del triangulo ");
        double alturaTriangulo = s.nextDouble(); 
        double areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
        System.out.println("El area del triangulo es: "+areaTriangulo);
    }

    public static void calcularRectangulo() {
        System.out.println("Introduce la base del rectangulo: ");
        double baseRec = s.nextDouble(); 
        System.out.println("Introduce la altura del rectangulo ");
        double alturaRec = s.nextDouble(); 
        double areaRec = baseRec*alturaRec;
        System.out.println("El area del rectangulo es: "+areaRec);
    }

    public static void calcularCirculo() {
        System.out.println("Introduce el radio: ");
		double radio = s.nextDouble();
		double numeroPi = 3.1416;
	    double areaCirculo = numeroPi*(radio*radio);
		System.out.println("Area del círculo: " + areaCirculo);
    }
}

