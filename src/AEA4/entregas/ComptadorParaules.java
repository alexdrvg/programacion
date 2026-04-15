package AEA4.entregas;

import java.io.File;
import java.util.Scanner; 
import java.io.PrintStream;

public class ComptadorParaules {
    public static void main(String[] args) {

        try {
            
            File entrada = new File("/Users/alexa/Documents/entrada.txt");

            if (!entrada.exists()) {

                System.out.println("El documento entrada.txt no existe o no se ha encontrado en la ruta. ");

            } else {

                Scanner lector = new Scanner(entrada);

                File sortida = new File("/Users/alexa/Documents/sortida.txt");
                PrintStream escriptorFitxer = new PrintStream(sortida);
        
                int numPalabras = LeerPalabras(lector);
                escriptorFitxer.println("El número de palabras en el txt son " + numPalabras);
                    
                lector.close();
                escriptorFitxer.close();
            }

        }

        catch (Exception e) {

            System.out.println("Error al leer entrada.txt: " + e);
        }

    }

    public static int LeerPalabras(Scanner lector) {
        
        int numPalabras = 0;

        try {

            while (lector.hasNext()) {
                lector.next();
                numPalabras++;
            }

        } catch (Exception e) {
            System.out.println("Error al contar las palabras: "+ e);
        }

        return numPalabras;

    }
}
