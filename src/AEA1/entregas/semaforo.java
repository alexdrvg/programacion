package AEA1.entregas;

import java.util.Random;
import java.util.Scanner;

public class semaforo {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
        Random r = new Random(); 

        int numero_correcto = r.nextInt(10)+1; 
        int intentos = 3; 
        boolean acierto = false; 
        int numero_elegido = -1; 

        System.out.println("Tienes que adivinar un numero entre el 1 y el 10. Tienes " + intentos + " intentos restantes. Introduce un numero: ");

        do {
            if (s.hasNextInt()) {
                numero_elegido = s.nextInt();

                if (numero_elegido>=1 && numero_elegido<=10) {
                    
                    intentos--;

                    if (numero_elegido!=numero_correcto) {
                        System.out.println("Incorrecto. Tienes " + intentos + " intentos restantes. Introduce un numero:");
                    } else {
                        acierto = true; 
                    }
            
                } else {
                    System.out.println("Tienes que escribir un numero entre el 1 y el 10");
                }

            } else {
                System.out.println("Tienes que escribir un un numero entre el 1 y el 10. Introduce un numero: ");
                s.next(); 
            }
        } while (!acierto && intentos>0); 

        if (acierto) {
            System.out.println("Felicidades, lo has adivinado. ");
        } else {
            System.out.println("El numero secreto era: "+ numero_correcto);
        }

        s.close();
    }
}
