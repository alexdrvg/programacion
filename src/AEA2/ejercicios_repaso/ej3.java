package AEA2.ejercicios_repaso;
import java.util.Scanner; 

public class ej3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);   

        String[] productos = {"leche", "pan", "huevos", "yogurt", "azucar"}; // en cambio de 15 productos serán 5 porque si
        String menosDeCinco = ""; 
        int cantidad = 0;
        int total = 0;
    

        for (int i=0; i<productos.length; i++) {
            System.out.println("Escribe la cantidad de productos en stock de "+productos[i]+": "); 
            cantidad = s.nextInt(); 
            total+=cantidad;

            if (cantidad<5) {
                menosDeCinco+= productos[i]+" "; 
            }

        }

        System.out.println("El total de stock de los productos es de: "+total);
        System.out.println("Los productos con menos de cinco unidades son: "+menosDeCinco);

    }
}
