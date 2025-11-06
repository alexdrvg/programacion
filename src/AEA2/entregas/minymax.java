package AEA2.entregas;

import java.util.Arrays;

public class minymax {
    public static void main(String[] args) {
        
        int[]a = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};

		Arrays.sort(a);

        System.out.println("Este es el vector más pequeño: "+a[0]);
        System.out.println("Este es el vector más grande: "+a[15]);

    }
}

