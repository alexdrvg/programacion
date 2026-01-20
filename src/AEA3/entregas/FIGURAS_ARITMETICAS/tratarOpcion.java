package AEA3.entregas.FIGURAS_ARITMETICAS;
import java.util.Scanner;


public class tratarOpcion {
    public static final Scanner s = new Scanner(System.in);
    private boolean fin = false; // diferencia entre hacer esto o public boolean fin = false ????
    
    public boolean getFin() {
        return fin;
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

    public void opciones() {

        int figuraEscogida = s.nextInt();
        
        lectorFiguras lector = new lectorFiguras(); // aquí se conecta con el doc de leer los datos de la figura
        
        calcularFiguras calculador = new calcularFiguras(); // y aquí para calcular
        
        if (figuraEscogida == 1) {
            lector.lectorTriangulo();   
            calculador.calcularTriangulo();
        } else if (figuraEscogida == 2) {
            lector.lectorRectangulo();
            calculador.calcularRectangulo();
        } else if (figuraEscogida == 3) {
            lector.lectorCirculo();
            calculador.calcularCirculo();
        } else if (figuraEscogida == 4) {
            lector.lectorTrapezio(); 
            calculador.calcularTrapezio();           
        } else if(figuraEscogida == 5) {
            lector.lectorParalelogramo();
            calculador.calcularParalelogramo();
        } else if(figuraEscogida == 6) {
            salirDelPrograma();
        } else {
            System.out.println("Opción no válida. Vuelve a intentarlo. ");
        }
        
        if (figuraEscogida>=1 && figuraEscogida<=5) {
            System.out.println("El area de la figura es: "+ calcularFiguras.area); 
        }
    }

    public void salirDelPrograma() {
        System.out.println("Hasta la próxima :D");
        fin = true;
    }
}
