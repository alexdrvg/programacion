package AEA3.entregas.MAX_MIN;
import java.util.Scanner;

public class guardarNotas {
    public static final Scanner s = new Scanner(System.in);
    
    private int numNotas;
    private double[] notas; // en public tmb funcionaría pero es mejor esto por el encapsulamiento

    public double[] getNotas() { // así se hace para que pueda acceder a notas[] sin modificarla y siendo privada en la clase guardarNotas
        return notas;
    }

    public void lectorNotas() {
        System.out.println("Escribe el número de notas con las que quieres trabajar: ");
        numNotas = s.nextInt();
        notas = new double[numNotas];

        System.out.println("Escribe las notas de cada alumno: ");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno "+(i+1)+": "); 
            notas[i] = s.nextDouble();
        }

    }
}
