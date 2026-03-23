package AEA3.EXAMEN;
import java.util.Scanner;

public class Examen2_AlexandraRaymi {

    public static double[] notes = new double[50];
    public int MARCA_NOTES = -1;
    public int NUM_NOTES = 0;
    public String MARCA_FI = "fi";
    private boolean fi = false;
    public double max = 0;
    public double min = 10;
    public double mitj = 0;

    Scanner s = new Scanner(System.in);


    private final CalculArrays calculador = new CalculArrays();
    private final NotaAText transformar = new NotaAText();


    public static void main(String[] args) {
        Examen2_AlexandraRaymi programa = new Examen2_AlexandraRaymi();
        programa.inici();
    }

    public void inici(){
        //Desenvolupeu el vostre codi aquí
        PreguntarNotes();

        while (!fi) {
            
            MostrarMenu();
            TractarOpcio();
        }
    }

    //Param. entr:no en té
    //Param. sort:no en té
    //FUNCIÓ: llegir les notes
    private void PreguntarNotes() {
        //OPCIÓ 1 --> Les dades les definim DIRECTAMENT al programa
        //Desenvolupeu el vostre codi aquí

        //OPCIÓ 2 --> PUNTUACIÓ EXTRA (1p+). Agafem les dades de terminal
        //Comenceu per l'opció 1!!
        //Desenvolupeu el vostre codi aquí
        System.out.println("\nAbans de començar, escriu tantes notes ENTERES com vulguis.");
        System.out.println("\nQuan hagis acabat d'escriure les notes, escriu un -1.");
        System .out.println("---------------------------------");
        
        int i = 0;
        double nota = s.nextDouble();
        
        while ( nota != -1) {
                
            notes[i]=nota;
            nota = s.nextDouble();
            ++i;
            ++NUM_NOTES;
            
        }


        ImprimirArrayNotes();

    }

    //Param. entr: no hi ha 
    //Param. sort: no hi ha
    //FUNCIÓ: imprimir l'array de les notes just després que les haguem llegit
    private void ImprimirArrayNotes() {
        //Desenvolupeu el vostre codi aquí
        System.out.println("L'array de notes avaluat és: ");

        for (int i = 0; i < NUM_NOTES; i++) {
            System.out.print(notes[i] + " ");
            //NUM_NOTES += 1; // por X iteraciones sabremos cuantas notas X tedremos :D
        }

        System.out.println();

    }

    //Param. entr:
    //Param. sort:
    private void MostrarMenu() {
        System.out.println("\nBenvinguda al càlcul de notes de classe.");
        System .out.println("------------------------------------");
        System.out.println("[MAX] Saber la nota màxima de classe");
        System.out.println("[MIN] Saber la nota mínima de classe");
        System.out.println("[MIT] Saber la nota mitjana de classe");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    //Param. entr: no hi ha
    //Param. sort: no hi ha
    //FUNCIÓ: tractar cadascuna de les opcions que l'usuari pot triar
    private void TractarOpcio() {
        //Desenvolupeu el vostre codi aquí

        String opcionEscogida = s.nextLine();

        if (opcionEscogida.equalsIgnoreCase("MAX")) {

            max = calculador.calcularMaxim(notes);
            ImprimirResultat(max,transformar.notaAText(max), opcionEscogida);

        } else if (opcionEscogida.equalsIgnoreCase("MIN")) {

            min = calculador.calcularMinim(notes);
            ImprimirResultat(min,transformar.notaAText(min), opcionEscogida);

        } else if (opcionEscogida.equalsIgnoreCase("MIT")) {

            mitj = calculador.calcularMitjana(notes, NUM_NOTES);
            ImprimirResultat(mitj,transformar.notaAText(mitj), opcionEscogida);

        } else if (opcionEscogida.equalsIgnoreCase("FI")) {
            System.out.println("HASTA LA PRÓXIMA :b");
            fi = true;
        }

    }

    //Param. entr: la nota que volem transformar en text
    //Param. sort: la nota JA transformada en text i si modificar la variable per saber si algú ha tret un 8.
    //FUNCIÓ: Cridem la funció que ens transforma en text la notra nota.
    /* private String PrepararSortida(double valor) {
        //Desenvolupeu el vostre codi aquí

        HECHO ARRIBA EN FUNCION TRATAROPCIO(), dentro de cada opcion elegida llamando a ImprimirResultat(y sus 3 parm entrada)

    } */

    //Param. entr: double valornota, String text, String opcio
    //Param. sort: no hi ha
    //FUNCIÓ: imprimir el resultat de l'opció que l'usuari ha triat.
    private void ImprimirResultat(double valornota, String text, String opcio) {
        String opcioescollida = "";

        if (opcio.equalsIgnoreCase("MAX")){
            opcioescollida = "màxim";
        }
        else if (opcio.equalsIgnoreCase("MIN")){
            opcioescollida = "mínim";
        }
        else {
            opcioescollida = "mitjà";
        }

        System.out.print("El valor " + opcioescollida +" de l'array que has escrit és " + valornota);
        System.out.println(" que equival a un " + text + ".\n");
    
    }


}

