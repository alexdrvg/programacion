package AEA2.entregas;
import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
		
		System.out.println("¿Cuántos valores quieres introducir?"); 
		int limite= s.nextInt();

		double[] a = new double [limite];  

		int valor = 1;
		double suma = 0;  
		double valores=0;

		for (int i=0; i<a.length; i++) {
			System.out.println("Introduce el valor "+valor+":");
			valores = s.nextDouble();   
			suma = valores + suma; 
			valor++;
		}

		double media = suma/a.length;
		
		System.out.println("La media de los valores introducidos es de: "+media);

		s.close(); 
    }
}
