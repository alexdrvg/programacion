package AEA3.entregas;
import java.util.Scanner;

public class calculoFiguras {
    public final Scanner s = new Scanner(System.in);
    public boolean fin = false; // si SOLO es STATIC el main + haciendo la instancia, no hace falta hacer static las variables globales
    public double area, base, altura, radio, baseMayor, baseMenor; // pero si TOT es STATIC entonces hay que poner static tmb en las variables

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
        System.out.println("[4] Trapezio");
        System.out.println("[5] Paralelogramo");        
        System.out.println("[6] Salir del programa");
        System.out.print("Elige una opción (1-6): ");
    }

    public void tratarOpcion() {
        
        int figuraEscogida = s.nextInt();
        
        if (figuraEscogida == 1) {
            lectorTriangulo();
            calcularTriangulo();
        } else if (figuraEscogida == 2) {
            lectorRectangulo();
            calcularRectangulo();
        } else if (figuraEscogida == 3) {
            lectorCirculo();
            calcularCirculo();
        } else if (figuraEscogida == 4) {
            lectorTrapezio();
            calcularTrapezio();
        } else if(figuraEscogida == 5) {
            lectorParalelogramo();
            calcularParalelogramo();
        } else if(figuraEscogida == 6) {
            salirDelPrograma();
        } else {
            System.out.println("Opción no válida. Vuelve a intentarlo. ");
        }

        if (figuraEscogida>=1 && figuraEscogida<=5) {
            System.out.println("El area de la figura es: "+area); 
        }

    }

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

    public double calcularTriangulo() {
        area = (base*altura)/2;
        return area;
    }

    public double calcularRectangulo() {
        area = base*altura;
        return area;
    }

    public double calcularCirculo() {
        double numeroPi = 3.1416;

	    area = numeroPi*(radio*radio);

        return area;
    }  

    public double calcularTrapezio() {
        area = ((baseMayor+baseMenor)*altura)/2;
        return area;
    }

    public double calcularParalelogramo() {
        area = base*altura;

        return area;
    }

    public void salirDelPrograma() {
        System.out.println("Hasta la próxima :D");
        fin = true;
    }
}

