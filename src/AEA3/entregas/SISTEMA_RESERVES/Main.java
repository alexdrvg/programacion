package AEA3.entregas.SISTEMA_RESERVES;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        Allotjament iniciador = new Allotjament(null, null, 0, false);
        Habitacio h1 = new Habitacio(2);
        Apartament a1 = new Apartament(4, true);
        CasaRural cr1 = new CasaRural(true, true);

        boolean fin = false;
        int opcio;
        double[] llistaPreuNit = new double [3];

        while (!fin) {

            iniciador.menu();
            opcio = iniciador.lectorMenu();

            if (opcio==1) {
                System.out.println(h1.mostrarInformacio());
                System.out.println(a1.mostrarInformacio());
                System.out.println(cr1.mostrarInformacio());

            } else if(opcio==2) {
                
                while (true) { //bucle infinito, solo se puede salir con el break
                
                    System.out.println("Introdueix el nom de l'allotjament a reservar: ");
                    String allotjamentReservat = s.nextLine();

                    if (allotjamentReservat.equalsIgnoreCase(h1.getNom())) {
                        h1.reservar();
                        break;
                    } else if (allotjamentReservat.equalsIgnoreCase(a1.getNom())) {
                        a1.reservar();
                        break; 
                    } else if (allotjamentReservat.equalsIgnoreCase(cr1.getNom())) {
                        cr1.reservar();
                        break;
                    } else {
                        System.out.println("El nom no correspon a cap allotjament. Torna a intentar-ho.");
                    }

                }

            } else if (opcio==3) {

                while (true) { //bucle infinito, solo se puede salir con el break
                    
                    System.out.println("Introdueix el nom de l'allotjament a alliberar: ");
                    String allotjamentAlliberat = s.nextLine();

                    if (allotjamentAlliberat.equalsIgnoreCase(h1.getNom())) {
                        h1.alliberar();
                        break;
                    } else if (allotjamentAlliberat.equalsIgnoreCase(a1.getNom())) {
                        a1.alliberar();
                        break; 
                    } else if (allotjamentAlliberat.equalsIgnoreCase(cr1.getNom())) {
                        cr1.alliberar();
                        break;
                    } else {
                        System.out.println("El nom no correspon a cap allotjament. Torna a intentar-ho.");
                    }

                }

            } else if (opcio==4) {
                
                iniciador.cercaPersonalitzada();
                int opcioDeCerca = iniciador.lectorCercaPersonalitzada();
                
                if (opcioDeCerca == 1) {
                    llistaPreuNit[0] = h1.calcularPreuNit();
                    llistaPreuNit[1] = a1.calcularPreuNit();
                    llistaPreuNit[2] = cr1.calcularPreuNit();

                    Arrays.sort(llistaPreuNit); //se ordena en ascendente, así muestra los precios de menor a mayor

                    System.out.println("\nLa llista de preus dels allotjaments actuals es de: ");
                    
                    for (int i = 0; i < llistaPreuNit.length; i++) {
                        System.out.print(llistaPreuNit[i]+"  ");
                    }

                    System.out.println();

                } else if (opcioDeCerca==2) {

                    if (a1.getTeCuina()) {
                        System.out.println(a1.mostrarInformacio());
                    } else {
                        System.out.println("No hi ha cap apartament amb cuina disponible");
                    }
                    
                } else if (opcioDeCerca==3) {
                    
                    if (cr1.getTeJardi() || cr1.getTePiscina()) {
                        System.out.println(cr1.mostrarInformacio());
                    } else {
                        System.out.println("No hi ha cap casa rural amb jardí o piscina disponible");
                    }

                }

            } else if (opcio==5) {
                System.out.println("Fins la propera :D !");
                fin = true;
            }

        }

        s.close();

    }

}
