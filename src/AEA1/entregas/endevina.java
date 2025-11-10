package AEA1.entregas;

import java.util.Random;
import java.util.Scanner;

public class endevina {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);		
		System.out.println("Empezamos el juego.\nAdivina el valor entero entre 0 y 10.\n¿Que valor crees que es?");
		int valor = s.nextInt(); 
		
		Random r = new Random();
		int encert = r.nextInt(11); 
		
		do {
			
			if(valor!=encert) {
				System.out.println("¡Has fallado! Vuelve a intentarlo... ¿Que valor crees que es?");
				valor = s.nextInt();
			}

		} while (valor!=encert);

		System.out.println("Felicidades ¡Lo has adivinado!");
		
    }
}
