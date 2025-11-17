package AEA2.entregas;
import java.util.Scanner; 
// import java.util.Arrays; 

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

                System.out.println("Introduce un numero para la fila "+i+" y la columna "+j);
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


    }
}
