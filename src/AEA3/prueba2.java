package AEA3;
import java.util.Scanner;

public class prueba2 {
    public static final Scanner s = new Scanner(System.in);
    
    public void main(String[] args) {
        System.out.println("Aquí se mostrará la suma que quieras hacer: ");

        System.out.println("El resultado de la suma es "+Datos());
    }

    // el INT !! es el parametro de salida + RETURN
    public int Datos(/* aquí se pondría el parametro de entrada*/) {
        System.out.println("Escribe el primer número: ");
        int primerNum = s.nextInt(); 

        System.out.println("Escribe el segundo número: ");
        int segundoNum = s.nextInt(); 
   
        int suma = primerNum+segundoNum; 

        return suma; 
    }

    // parametro de salida - RETURN
    // void - NO HAY RETURN (porque como esta vacio, no devuelve nada)
}
