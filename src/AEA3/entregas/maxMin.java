package AEA3.entregas;
import java.util.Scanner;

public class maxMin {
    public static final Scanner s = new Scanner(System.in);
    private static boolean fin = false; 
    private static int numNotas; // aqui solo se declaran, no hace falta ponerle valor
    private static double[] notas; // ya se les pondrá valor abajo, y aqui se actualiza para toda el class

    public static void main(String[] args) {
        System.out.println("Bienvenido a este programa para calcular la nota máxima, mínima y media");

        while (!fin) {
            mostrarMenu();
            tratarOpcion(); 
        }
    }

    public static void mostrarMenu() {
        System.out.println("________________________________________\n");
        System.out.println("Escoge la opción a calcular: ");
        System.out.println("[1] Calcular nota máxima");
        System.out.println("[2] Calcular nota mínima");
        System.out.println("[3] Calcular nota media");
        System.out.println("[4] Salir del programa");
        System.out.print("Elige una opción (1-4): ");
    }

    public static void tratarOpcion() {
        int opcionEscogida = s.nextInt(); 

        if (opcionEscogida==1) {
            lectorNotas();
            double max = calcularMaximo(); // esto es lo mismo que llamar calcmax() pero aqui se llama y se guarda en la variable
            System.out.println("La nota máxima es "+max);

        } else if (opcionEscogida==2) {
            lectorNotas();
            double min = calcularMinimo();
            System.out.println("La nota mínima es "+min);
        } else if (opcionEscogida==3) {
            lectorNotas();
            double media = calcularMedia();
            System.out.println("La nota media es "+media);
        } else if (opcionEscogida==4) {
            finDelPrograma();
        } else {
            System.out.println("Opción no válida. Inténtalo de nuevo. ");
        }

    }
    // función en comun con todas las opciones de calcular (recopilar todas las notas)
    public static void lectorNotas() {
        System.out.println("Escribe el número de notas con las que quieres trabajar: ");
        numNotas = s.nextInt();
        notas = new double[numNotas];

        System.out.println("Escribe las notas de cada alumno: ");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno "+(i+1)+": "); 
            notas[i] = s.nextDouble();
        }

    }

    public static double calcularMaximo() {
       
        double numMaximo = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (numMaximo<notas[i]) {
                numMaximo = notas[i]; 
            }
        }
        return numMaximo; 

    }

    public static double calcularMinimo() {
        double numMinimo = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i]<numMinimo) {
                numMinimo = notas[i]; 
            }
        }

        return numMinimo;
    }

    public static double calcularMedia() {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        return suma/notas.length;

    }   

    public static void finDelPrograma() {
        System.out.println("Adiós. Hasta la próxima :D ");
        fin = true;
    }
}
