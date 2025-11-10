package AEA2;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        /* primer ejercicio !!!!
        int [] a ={3,12,18,34,7,10};

		for (int i=0; i<a.length; i++) {
			if (a[i]%2!=0) {
				a[i]=0;
			}

			System.out.println(a[i]);
		
		} */

        /* segundo ejercicio !!!!
        Scanner s = new Scanner (System.in);

		int[] a = new int [5];
		int mida = a.length;
		int suma = 0;

		System.out.println("Dame 5 valores:");

		for (int i = 0; i < mida; i++) {
			
			a[i] = s.nextInt();
			
			if (i%2!=0) {
				suma=a[i]+suma;
			} 
		}
		
		System.out.println("El suma total de los indices impares es: "+suma);
        */

		/* tercer ejercicio !!!!

		int[] a = new int[6];
		int[] b={7,10,25,40,50,-50};
		int[] c= new int [6];

		for (int i=0; i<b.length;i++){
			System.out.println("Estamos en la iteración "+i+" y el valor es "+b[i]);
		} // ejercicio facil (empieza i en 0 o sea primera casilla [7], y luego sigue hasta la ultima)

		for(int i=0; i<a.length;i++) {
			a[i]=i+11;

			if (i%2==0) {
				a[i]= -1;
			}

			c[i]=a[i]+b[i];

			System.out.println(c[i]);

		} */

    }
}
