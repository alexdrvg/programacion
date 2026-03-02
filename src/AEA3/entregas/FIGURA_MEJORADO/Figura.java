package AEA3.entregas.FIGURA_MEJORADO;
import CROSS.cross;
import java.util.Scanner;

public class Figura {
    public static Scanner s = new Scanner(System.in); //scanner compartido con figura y todas sus hijas
    private String figura;
    private int id;

    public Figura (String figura, int id) {
        this.figura=figura;
        this.id=id;
    }

    //getters

    public String getFigura() {
        return figura;
    }

    public int getId() {
        return id;
    }

    //setters

    public void setFigura(String nouFigura) {
        figura = nouFigura;
    }

    public void setId(int nouId) {
        id = nouId;
    }

    //funciones específicas 

    public void seguentFigura() {
        System.out.println("__________________________________________\n");
        System.out.println("Escoge la figura a calcular: ");
        System.out.println("[1] Triangulo");
        System.out.println("[2] Cuadrado");
        System.out.println("[3] Rectángulo");
        System.out.println("[4] Trapezio");
        System.out.println("[5] Rombo");        
        System.out.println("[6] Paralelogramo");
        System.out.println("[7] Círculo");
        System.out.println("[8] Salir del programa");
    }


    public int llegirDades() {
        
        int opcion = cross.integerVerificacion("Elige una opción (1-8): ");
    
        while (opcion < 1 || opcion > 8) {
            System.out.println("Error. Solo puedes escribir un número del 1 al 8.");
            opcion = cross.integerVerificacion("Elige una opción (1-8): ");
        }
        
        return opcion;
    }

    public double calcularArea() { 
        System.out.println("No hay ninguna area a calcular. ");
        return 0.0;
    }

    public void imprimirDades() {
        System.out.println();
        System.out.println("La figura con ID "+id+" es un "+figura);
        System.out.println("El area del "+figura+" es: "+calcularArea());
        System.out.println("__________________________________________");
    }

    
}
