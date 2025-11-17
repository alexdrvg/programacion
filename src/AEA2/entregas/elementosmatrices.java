package AEA2.entregas;
import java.util.Scanner; 

public class elementosmatrices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el numero de filas: ");
        int filas = s.nextInt();

        System.out.println("Introduce el numero de columnas: ");
        int columnas = s.nextInt(); 

        int[][] matrices = new int [filas][columnas]; 
        
        for (int i=0; i<matrices.length; i++) {

            for (int j=0; j<matrices[i].length; j++) {

                System.out.println("Introduce un numero para la fila "+i+" y la columna "+j+": ");
                matrices[i][j] = s.nextInt(); 

            }

        }

        System.out.println("La matriz será así: ");

        for (int i=0; i<matrices.length; i++) {
            for (int j=0; j<matrices[i].length; j++) {
                System.out.print(matrices[i][j]+" ");
            }
            System.out.println();
        }

        int maximo = matrices[0][0];
        int minimo = matrices[0][0]; 

        for (int i=0; i<matrices.length; i++) {
            for (int j=0; j<matrices[i].length; j++) {
                if (maximo < matrices[i][j]) {
                    maximo = matrices [i][j];
                }
                
                if (minimo > matrices[i][j]){
                    minimo = matrices[i][j]; 
                }
            }
        }

        System.out.println("El número más grande de la matriz es el: "+maximo);
        System.out.println("El número más pequeño de la matriz es el: "+minimo);

    }
}
