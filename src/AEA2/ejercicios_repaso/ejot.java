package AEA2.ejercicios_repaso;
import java.util.Scanner; 

public class ejot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] concursantes = {"Tinho","Guille","Cristina","Crespo","Claudia","Guillo","Olivia"};

        String[] criterios = {"Afinación","Coreo","Interpretación","Retos","Propuesta artística","Compañerismo","Actitud"};

        double[][] notas = new double[7][7]; // notas de los 7 concursantes de ot 

        double[] suma = new double[concursantes.length]; // para la nota final/promedio de cada concursante
        double[] promedio = new double[concursantes.length];

        for (int i = 0; i < concursantes.length; i++) {
            System.out.println("Introduce la nota de "+concursantes[i]+" en:");
            for (int j = 0; j < criterios.length; j++) {
                System.out.print(criterios[j]+": ");
                notas[i][j] = s.nextDouble();
                suma[i]+= notas[i][j]; 
            }

            promedio[i]=suma[i]/concursantes.length; 
            System.out.println();
        }

        for (int i = 0; i < promedio.length; i++) {
            System.out.println("La nota final de "+concursantes[i]+" es de: "+promedio[i]);
        }

        System.out.println();

        double notaMaxima = promedio[0];
        double notaMinima = promedio[0];
        String concursanteMaximo = concursantes[0];
        String concursanteMinimo = concursantes[0];

        for (int i = 0; i < promedio.length; i++) {
            if (notaMaxima<promedio[i]) {
                notaMaxima = promedio[i];
                concursanteMaximo = concursantes[i]; 

            } else if (notaMinima>promedio[i]) {
                notaMinima = promedio[i]; 
                concursanteMinimo = concursantes[i]; 
            }
        }

        System.out.println("El concursante con la nota más baja es "+concursanteMinimo+" con: "+notaMinima);
        System.out.println("El concursante con la nota más alta es "+concursanteMaximo+" con: "+notaMaxima);

        s.close();
    }
}
