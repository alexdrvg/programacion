package AEA1.entregas;

import java.util.Scanner;

public class menuinteractivo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("-- MENU INTERACTIVO --\n Escoge una opcion entre el 1-4: ");
        int opcion = s.nextInt();
        
        do {
            if (opcion==1) {
                System.out.println("Bienvenido al programa. Escoge una opcion del 1-4: ");
                opcion=s.nextInt(); 

            } else if (opcion==2) {
                System.out.println("Fecha actual. Escoge una opcion del 1-4: ");
                opcion = s.nextInt(); 

            } else if (opcion==3) {
                System.out.println("Introduce el primer numero: ");
                int primerNumero = s.nextInt();
                System.out.println("Introduce el segundo numero: ");
                int segundoNumero = s.nextInt(); 
                System.out.println("El resultado de la suma es de: "+(primerNumero+segundoNumero)+"\n Escoge un numero del 1-4: ");
                opcion = s.nextInt(); 

            } else {
                System.out.println("Opcion inválida. Volviendo al menu principal... ");
                break; 
            }

        } while (opcion!=4);
       
        System.out.println("Has salido del programa. Adios :D");
    }
}
