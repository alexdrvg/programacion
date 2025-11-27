package AEA2.ejercicios_repaso;
import java.util.Scanner;
import java.util.Arrays;

public class ej9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ventas = new int[10]; // ventas de 10 vendedores, determina mayor, menor, promedio y orden descendente
        int vendedor = 1; 
        int suma=0;

        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Introduce las ventas del vendedor "+vendedor+": ");
            ventas[i]=s.nextInt();
            suma+= ventas[i]; 
            vendedor++;
        }
        int promedio = suma/ventas.length;

        Arrays.sort(ventas);

        System.out.println("El promedio de todas las ventas es de: "+promedio);
        System.out.println("La mayor venta es de: "+ventas[ventas.length-1]);
        System.out.println("La menor venta es de: "+ventas[0]);

        for (int i = ventas.length-1; i>=0; i--) {
            System.out.print(ventas[i]+" ");
        }

        s.close();
    }
}
