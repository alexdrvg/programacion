package AEA2.ejercicios_repaso;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] notas = new double[10]; // en cambio de 30 notas pondré 10 notas. 
        double suma = 0;

        int aprobados = 0;
        int suspendidos = 0;
    

        for (int i = 0; i < notas.length; i++) {                
            System.out.println("Introduce la nota: ");
            notas[i] = s.nextDouble();
            if (notas[i]>=0 && notas[i]<=10) {
                suma += notas[i];
            } else {
                System.out.println("Tienes que escribir un valor entre el 0 y el 10. Vuelve a intentarlo: ");
                continue;
            }
        }

        double mejorNota = notas[0];
        double peorNota = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>=5) {
                aprobados++;
            } else if (notas[i]<5) {
                suspendidos++;
            }

            if (mejorNota<notas[i]) {
                mejorNota = notas[i];
            } else if (peorNota>notas[i]) {
                peorNota = notas[i];
            }
        }

        double media = suma/notas.length;

        System.out.println("La media de las notas de clase es: "+media);
        System.out.println("La mejor nota ha sido un: "+mejorNota);
        System.out.println("La peor nota ha sido un: "+peorNota);
        System.out.println("El numero de aprobados ha sido de "+aprobados+" y el numero de suspendido de "+suspendidos);

        s.close();
    }
}
