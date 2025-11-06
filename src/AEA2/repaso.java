package AEA2;

// import java.util.Random;
import java.util.Scanner;

public class repaso { 
    
    /* public static void main (String[]args) {
        Scanner s = new Scanner(System.in); 
        Random r = new Random(); 

        int numero_correcto = r.nextInt(10)+1; 
        int intentos = 5; 
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

        s.close();; 

    } */ 
    /* public static void main (String [] args) {
        Scanner s = new Scanner (System.in); 

        System.out.println("Escribe, ¿hasta que tabla de multiplicar quieres saber?");
        int num_limite = s.nextInt();  

        for (int multiplicador=1; multiplicador<=num_limite; multiplicador++) {
            System.out.println("Esta es la tabla del "+multiplicador);
            for (int i=1; i<=10; i++) {
                System.out.println(multiplicador+"*"+i+"="+multiplicador*i);
            }
            System.out.println("_____________");
        } 
    } */
    /* public static void main(String[] args) {
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

        
    } */
    /* public static void main(String[] args) {
        
        // una forma de crear un array 
        int [] a = new int [5]; 
        a = new int[]{1,2,3,4,5,6}; 

        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }

        // segunda forma de crear un array
        int [] b = {1,2,3,4,5,6}; 

        for (int i=0; i<b.length; i++) {
            System.out.println(b[i]);
        }

        // una forma de crear una matriz
        int [][] matrizA = new int [3][4]; // 3 filas y 4 columnas (vacias)

        // segunda forma de crear una matriz 

        int [][] matrizB = {
            {1,2,3,4},
            {4,3,2,1}
        }; // 4 columnas y dos filas (con valores)

        System.out.println(matrizB[1][3]); // imprime 1 :D 

    } */
    /* public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int intentos=3;
        String contraseña = "alex123"; 
        boolean acierto = false; 

        System.out.println("Tienes que adivinar la contraseña secreta. Tienes 3 intentos: ");
        
        do {
            if (s.hasNextLine()) {

                String respuesta = s.nextLine();
                intentos--; 

                if (respuesta.equals(contraseña)) {
                    acierto = true; 
                } else {
                    System.out.println("Incorrecto. Tienes "+intentos+" intentos restantes.");
                }

            } else {
                System.out.println("Tienes que introducir una palabra. Vuelve a intentarlo: ");
                s.nextLine(); 
            }

        } while (!acierto && intentos>0);

        if (acierto) {
            System.out.println("Felicidades, has adivinado la contraseña secreta, que era: "+contraseña);
        } else {
            System.out.println("Te has quedado sin intentos. La contraseña secreta era: "+contraseña);
        }

        s.close();

    } */
    
}
