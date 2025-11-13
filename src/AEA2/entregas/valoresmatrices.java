package AEA2.entregas;

public class valoresmatrices {
    public static void main(String[] args) {
        int [][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        System.out.println("Matriz transformada: ");
 
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++) {

                if (i%2==0 && j%2==0) {
                    matriz[i][j]=1;
                    System.out.print(matriz[i][j]+" ");
                } else if (i%2==0 && j%2!=0) {
                    matriz[i][j]=2;
                    System.out.print(matriz[i][j]+" ");
                } else if (i%2!=0 && j%2==0) {
                    matriz[i][j]=3;
                    System.out.print(matriz[i][j]+" ");
                } else {
                    matriz[i][j]=4;
                    System.out.print(matriz[i][j]+" ");
                }

            }

            System.out.println();
        }        
    }
}
