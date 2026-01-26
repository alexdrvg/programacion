package AEA3.entregas.MAX_MIN;
import java.util.Scanner;

public class principal {
    public static final Scanner s = new Scanner(System.in);
    
    private static boolean fin = false;

    public static void main(String[] args) {
        principal programa = new principal();
        programa.inicio();
    }

    public void inicio() {
        System.out.println("Bienvenido a este programa para calcular la nota máxima, mínima y media");

        while (!fin) {
            mostrarMenu();
            tratarOpcion(); 
        }
    }

    public void mostrarMenu() {
        System.out.println("________________________________________\n");
        System.out.println("Escoge la opción a calcular: ");
        System.out.println("[1] Calcular nota máxima");
        System.out.println("[2] Calcular nota mínima");
        System.out.println("[3] Calcular nota media");
        System.out.println("[4] Salir del programa");
        System.out.print("Elige una opción (1-4): ");
    }

    public void tratarOpcion() {
        int opcionEscogida = s.nextInt(); 

        guardarNotas lector = new guardarNotas();
        calculo calculador = new calculo(); 

        if (opcionEscogida==1) {
            lector.lectorNotas();
            double max = calculador.calcularMaximo(lector); // esto es lo mismo que llamar calcmax() pero aqui se llama y se guarda en la variable
            System.out.println("La nota máxima es "+max);

        } else if (opcionEscogida==2) {
            lector.lectorNotas();
            double min = calculador.calcularMinimo(lector);// aqui ENVIAMOS el objeto lector creado arriba
            // DENTRO de la función calcularMinimo();, así tiene acceso a la clase guardarNotas :D
            System.out.println("La nota mínima es "+min);
        } else if (opcionEscogida==3) {
            lector.lectorNotas();
            double media = calculador.calcularMedia(lector);
            System.out.println("La nota media es "+media);
        } else if (opcionEscogida==4) {
            finDelPrograma();
        } else {
            System.out.println("Opción no válida. Inténtalo de nuevo. ");
        }

    }

    public void finDelPrograma() {
        System.out.println("Adiós. Hasta la próxima :D ");
        fin = true;
    }
}
