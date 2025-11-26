package AEA2.ejercicios_repaso;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int [6]; // en cambio de 20, de 6 clientes porque si 
        int notas = 0; 
        int suma = 0;
        int cinco = 0;
        int tresOMenos = 0; 

        for (int i=0; i<a.length; i++) {
            System.out.println("Valora el servicio (1-5): ");
            notas = s.nextInt();
            a[i]=notas;
            suma+= notas; 

            if (notas==5) {
                ++cinco; 
            } 

            if (notas<=3) {
                ++tresOMenos;
            }

        }

        int media = suma/a.length; 

        System.out.println("La valoración media es de: "+media);
        System.out.println("Personas que han valorado con un 5: "+cinco);
        System.out.println("Personas que han valorado con 3 o menos: "+tresOMenos);

        System.out.println("Valoraciones: ");

        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }

        s.close();
    }
}
