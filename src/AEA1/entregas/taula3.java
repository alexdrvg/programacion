package AEA1.entregas;

import java.util.Scanner;

public class taula3 {
    public static void main(String[] args) {
        Scanner lim = new Scanner (System.in);		
		System.out.println("¿Hasta que tabla de multiplicar quieres conocer?");

		int tabla = 1;

		if (lim.hasNextInt()) {

				int numLimite = lim.nextInt();

				if (numLimite>= 1){
					do { // mejor con dos for 
				
						System.out.println("La tabla del "+tabla);

						for (int multiplicador = 1; multiplicador<=10; multiplicador++) {
							System.out.println(tabla+"*"+multiplicador+"="+tabla*multiplicador);
						}

						tabla++;

					} while (numLimite>=tabla);

				} else {
					System.out.println("Ha de ser un número más grande que cero"); 
				}

		} else {
			System.out.println("Tienes que escribir un numero entero y positivo");
		}
    }
}
