package AEA2;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);

        int[] a = new int[5];
        int notas = 0; 
        int suma_total = 0;

        System.out.println("Introduce las 5 notas: ");

        for (int i=0;i<a.length;i++) {
            notas = s.nextInt(); 
            a[i] = notas; 
            suma_total+= notas;    
        }

        Arrays.sort(a); 

        double media = suma_total/a.length;  

        System.out.println("La nota más alta de las 5 es: "+a[4]);
        System.out.println("La media de las 5 notas es de: "+media); 
        
        s.close();

    }
}