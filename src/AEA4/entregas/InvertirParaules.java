package AEA4.entregas;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class InvertirParaules {
    public static void main(String[] args) {
        
        try {
            File entrada = new File("/Users/alexa/Documents/arxiu.txt");

            if (!entrada.exists()) {
                System.out.println("El documento arxiu.txt no existe o no se ha encontrado en la ruta. ");
            } else {
                Scanner lector = new Scanner(entrada);

                File sortida = new File("/Users/alexa/Documents/arxiu_invertit.txt");
                PrintWriter escriptor = new PrintWriter(sortida);

                String arxiu_invertit = InvertirDocumento(lector);

                escriptor.println(arxiu_invertit);

                lector.close();
                escriptor.close();
            }
        
        } catch (Exception e) {
            System.out.println("Error al leer arxiu.txt: " + e);
        }

    }

    public static String InvertirDocumento (Scanner lector) {

        String arxiu_invertit = "";

        try {

            while (lector.hasNextLine()) {

                String linea = lector.nextLine(); //leemos la primera linea y la guardamos como String

                char[] linea_invertida = linea.toCharArray(); // transformamos String a Array de Chars (así manipulamos con un for cada letra)

                for (int i = linea_invertida.length -1; i >= 0; i--) {
                    arxiu_invertit += linea_invertida[i];
                }
            }
        
        } catch (Exception e) {
            System.out.println("Error al invertir las palabras: "+ e);
        }

        return arxiu_invertit;

    }

}
