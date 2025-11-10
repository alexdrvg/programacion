package AEA1.entregas;

import java.util.Scanner;

public class multiTres {
    public static void main(String[] args) {
        Scanner lim = new Scanner (System.in);		
		System.out.println("¿Hasta que valor quieres sumar múltiples de 3?");
		int limite = lim.nextInt();

		int suma = 0;
		
		if (limite>0) {
			for (int i=0; i<=limite; i+=3) {
				System.out.println("Agregamos " + i + "...");
				suma = suma + i;
			}
			
			System.out.println("El resultado final es "+suma);

		} else {
			System.out.println("¡Tienes que escribir un número positivo y entero!");
		} 
        
    }
}
