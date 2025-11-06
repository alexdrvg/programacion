package AEA2.entregas;

import java.util.Scanner;

public class suspendido {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

		System.out.println("¿Cuántas notas quieres introducir?");
		int notaLimite=s.nextInt(); 

		int[] a = new int [notaLimite]; 

		int ordenNota = 1; 
		int nota = 0; 
		boolean suspendido = false; 

		for (int i=0; i<a.length; i++) {
			System.out.println("Introduce la nota "+ordenNota);
			nota = s.nextInt(); 

			if (nota<=10 && nota>=0) {
				if (nota<5) {
					a[i] = nota; 
					suspendido = true; 
					ordenNota++;
				} else {
					a[i]=nota;
					ordenNota++; 
				}
			} else {
				System.out.println("Tienes que escribir un numero entre el 0 y el 10");
				i--; 
			}
		}

		for (int i=0; i<a.length;i++) {

			if (suspendido) {
				System.out.println("Al menos un alumno ha suspendido");
				break; 
			} else {
				System.out.println("Ningún alumno ha suspendido");
				break; 
			}

		}

		s.close();
    }
}
