package AEA2.ejercicios_repaso;
import java.util.Scanner; 

public class ej15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] cine = { // en cambio de 12x20 haré 3x4 cine chiquito
            {1,0,1,1},
            {0,0,1,1},
            {0,0,0,1},
        }; 

        boolean libre = false;

        System.out.println("Esta es la disponibilidad del cine (0-libre, 1-ocupado): ");
        
        for (int i = 0; i < cine.length; i++) {
            for (int j = 0; j < cine[i].length; j++) {
      
                System.out.print(cine[i][j]+" ");
            }
            System.out.println();
        } // imprimimos para enseñar el mapa del cine
    
        System.out.println("Selecciona los asientos que quieres reservar (fila y columna): ");
       
        while (!libre) { //le decimos el bucle se repita hasta que libre se convierta en true (porque esta inizialidado como false) 
        
            boolean ocupado = false;

            System.out.println("Introduce la fila (empezando desde el 1): ");
            int filaEscogida = s.nextInt()-1;

            System.out.println("Introduce la columna (empezando desde el 1): ");
            int columnaEscogida = s.nextInt()-1;

            if (filaEscogida<0 || filaEscogida>=cine.length ||columnaEscogida<0 || columnaEscogida>=cine[0].length) {
                System.out.println("Rango no válido. Vuelve a intentarlo: ");
                continue;  
            }

            if (cine[filaEscogida][columnaEscogida]==0) {
                libre = true;
            }

            if (cine[filaEscogida][columnaEscogida]==1) {
                ocupado = true;
            }

            if (ocupado) {
                System.out.println("El asiento esta ocupado, intentálo de nuevo: ");
                ocupado = false; 
                continue; 
            }
            
        }
    
        if (libre) {
            System.out.println("El asiento esta libre. Se te reserverá este asiento. ");
        }

    }
}
