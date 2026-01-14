package AEA3.entregas;
import java.util.Scanner;

public class calculoFiguras {
    public static final Scanner s = new Scanner(System.in);
    public static boolean fin = false; 
    public static double area; 

    public static void main(String[] args) {
        calculoFiguras programa = new calculoFiguras(); // calculoFiguras como instancia?
        programa.inicio(); // y se guarda en la variable programa
    }

    public void inicio() {
        System.out.println("Bienvenido a este programa para calcular areas"); // así solo manda una vez el mensaje, solo cuando inicia el programa
        while (!fin) {
            mostrarMenu();
            tratarOpcion();
        }
    }

    public void mostrarMenu() {
        System.out.println("__________________________________________\n");
        System.out.println("Escoge la figura a calcular: ");
        System.out.println("[1] Triangulo");
        System.out.println("[2] Rectangulo");
        System.out.println("[3] Circulo");
        System.out.println("[4] Salir del programa");
        System.out.print("Elige una opción (1-4): ");
    }

    public void tratarOpcion() {
        
        int figuraEscogida = s.nextInt();
        
        if (figuraEscogida == 1) {
            calcularTriangulo();
        } else if (figuraEscogida == 2) {
            calcularRectangulo();
        } else if (figuraEscogida == 3) {
            calcularCirculo();
        } else if (figuraEscogida == 4) {
            salirDelPrograma(); 
        } else {
            System.out.println("Opción no válida. Vuelve a intentarlo. ");
        }

        if (figuraEscogida>=1 && figuraEscogida<=3) {
            System.out.println("La area es: "+area); 
        }

    }

    public void calcularTriangulo() {
        System.out.println("Introduce la base del tringualo: ");
        double baseTriangulo = s.nextDouble(); 
        System.out.println("Introduce la altura del triangulo ");
        double alturaTriangulo = s.nextDouble(); 
        area = (baseTriangulo*alturaTriangulo)/2;
    }

    public void calcularRectangulo() {
        System.out.println("Introduce la base del rectangulo: ");
        double baseRec = s.nextDouble(); 
        System.out.println("Introduce la altura del rectangulo ");
        double alturaRec = s.nextDouble(); 
        area = baseRec*alturaRec;
    }

    public void calcularCirculo() {
        System.out.println("Introduce el radio: ");
		double radio = s.nextDouble();
		double numeroPi = 3.1416;
	    area = numeroPi*(radio*radio);
    }

    public void salirDelPrograma() {
        System.out.println("Hasta la próxima :D");
        fin = true;
    }
}

