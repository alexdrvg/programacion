package AEA2.ejercicios_repaso;
import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[][] temperaturas = new double[2][7]; // dos ciudades con registro de 7 dias cada una

        String[] ciudades = {"Barcelona","Madrid"};

        // se introducen temperaturas de las dos ciudades
        
        for (int i = 0; i < ciudades.length; i++) { //ciudad
            for (int j = 0; j < temperaturas[i].length; j++) { //dia
                System.out.println("Ingresa la temperatura del dia "+(j+1)+" de "+ciudades[i]);
                temperaturas[i][j] = s.nextDouble(); 
              
            }
            
            System.out.println();
        } 

        //aquí calculamos dia más caluroso de las dos ciudades

        double maximoBcn = temperaturas[0][0];
        double maximoMdrd = temperaturas[0][0];

        int diaMaxBcn = 0;
        int diaMaxMdrd = 0;

        for (int i = 0; i < ciudades.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                    
                if (i==0) { // i=0 es barcelona, así solo lee la temperatura de la fila bcn
                    if (temperaturas[i][j]>maximoBcn) {
                        maximoBcn = temperaturas[i][j];
                        diaMaxBcn = j+1;

                    }
                } else if (i==1) {
                    if (temperaturas[i][j]>maximoMdrd) {
                        maximoMdrd = temperaturas[i][j];
                        diaMaxMdrd = j+1; // j es el dia, pero como empieza en cero, al sumar +1 se muestra del dia 1-7, si no seria 0-6.
                    }
                }
            }
            
        }
        
        System.out.println("La dia más caluroso de Barcelona es el "+diaMaxBcn+ " y hizo: " +maximoBcn+" grados.");
        System.out.println("El dia más caluroso de Madrid es el "+diaMaxMdrd+" y hizo: "+maximoMdrd+" grados.");

        // aquí se hace la media de cada ciudad (i=0 bcn, i=1 madrid)

        double sumaBcn = 0;
        double sumaMdrd = 0;

        for (int i = 0; i < ciudades.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (i==0) {
                    sumaBcn+= temperaturas[i][j];
                } else if (i==1) {
                    sumaMdrd+= temperaturas[i][j];
                }
            }
        }

        System.out.println("La temperatura promedio de Barcelona es de: "+sumaBcn/temperaturas[0].length);
        System.out.println("La temperatura promedio de Madrid es de: "+sumaMdrd/temperaturas[1].length);

        s.close(); 
    }
}
