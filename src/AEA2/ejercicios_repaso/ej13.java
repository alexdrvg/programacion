package AEA2.ejercicios_repaso;
import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] ventas = new int[4][3]; // 4 son los productos y 3 son los meses 
        String[] productos = {"secadora","plancha","peines","tijeras"};
        int[] totalProductos = new int [productos.length]; 

        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Introduce las ventas de "+productos[i]+" del mes "+(j+1)+": ");
                ventas[i][j] = s.nextInt();
                totalProductos[i] += ventas[i][j];
            }
        }

        for (int i = 0; i < productos.length; i++) {
            System.out.println("El total de ventas de "+productos[i]+": "+totalProductos[i]);
            
        }

        int maxVendido = totalProductos[0];
        String masVendido = "";

        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < totalProductos.length; j++) {
                if (maxVendido<totalProductos[i]) {
                    maxVendido = totalProductos[i];
                    masVendido = productos[i];
                }
            }
        }

        System.out.println("El producto "+masVendido+", es el que contiene más numero de ventas: "+maxVendido);

        s.close();

    }
}
