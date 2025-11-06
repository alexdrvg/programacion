package AEA2.entregas;

import java.util.Scanner;

public class excelente {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in); 

		System.out.println("¿Cuantas notas quieres introducir?");
		int notaLimite = s.nextInt(); 
 
		int[]a = new int [notaLimite];

		int numeroNota = 1; 
		int nota=0; 
		boolean notaMaxima=false; 

		for (int i=0; i<a.length; i++) {
			System.out.println("Introduce la nota "+numeroNota+":");
			nota = s.nextInt(); 

			if (nota<=10 && nota>=0){
				if (nota==10){
					a[i]= nota; 
					notaMaxima = true; 
					numeroNota++; 
				} else {
					a[i] = nota; 
					numeroNota++; 
				}
			} else {
				System.out.println("Tienes que escribir una nota del 0 al 10");
				i--;
				 
			}

		}

		for (int i=0; i<a.length; i++) {

			if (notaMaxima) {
				System.out.println("Si, hay al menos un alumno con un 10 :D ");
				break;
			} else {
				System.out.println("No hay ningun alumno con un 10 :c");
				break; 
			}

		}
			
		s.close(); 
    }
}
