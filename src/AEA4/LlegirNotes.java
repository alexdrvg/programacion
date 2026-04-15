package AEA4;

import java.io.File;
import java.util.Scanner;
import java.io.PrintStream;


public class LlegirNotes {
    //la paraula fi serveix com a marca de final de fitxer
    public static final String MARCA_FI = "fi";
    public static void main (String[] args) {

        try {
            File f = new File("/Users/alexa/Documents/Notes.txt");
            File f2 = new File("/Users/alexa/Documents/NotesMitja.txt"); // donde se escribirá

            PrintStream escriptorFitxer = new PrintStream(f2);

            Scanner lector = new Scanner(f);
            boolean llegir = true;

            while (llegir) {

                String nom = lector.next();
                
                if (MARCA_FI.equals(nom)) {
                    llegir = false;
                } else {
                    String cognom = lector.next();
                    escriptorFitxer.println("Estudiant: " + nom + " " + cognom);
                    //Noteu com un scanner es pot passar com paràmetre
                    double mitjana = llegirNotes(lector);
                    escriptorFitxer.println(" - Mitjana: " + mitjana);
                }

            }
            //Cal tancar el fitxer
            lector.close();
            escriptorFitxer.close();
        }
        catch(Exception e) {
            //Excepció!
            System.out.println("1 Error llegint estudiants: " + e);
        }
    }

    /** Donat un Scanner en un fitxer quan l’apuntador es troba sobre l’inici
     * de les notes, s’extreuen i es calcula la mitjana.
     *
     * @param lector Scanner a processar
     * @return Mitjana de notes
     */
    public static double llegirNotes(Scanner lector) {
        double res = 0;
        int numNotes = 0;

        try {
            
            // Llegim la primera nota
            double nota = lector.nextDouble();
            
            // Mentre la nota no sigui -1, continuem acumulant
            while (nota != -1.0) {
                res = res + nota;
                numNotes++;
                nota = lector.nextDouble(); // Llegim la següent
            }
            
            // Es calcula nota mitjana (evitant divisió per zero si algú no té notes)
            if (numNotes > 0) {
                res = res / numNotes;
            }
        }
        
        catch (Exception e) {
            //Excepció!
            System.out.println("2 Error llegint notes: " + e);
        }
        return res;
    }
}

