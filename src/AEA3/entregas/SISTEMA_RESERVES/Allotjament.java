package AEA3.entregas.SISTEMA_RESERVES;
import CROSS.cross;

public class Allotjament {
    private String tipusAllotjament;
    private  String nom;
    private int capacitat;
    private boolean disponible;

    public Allotjament (String tipusAllotjament, String nom, int capacitat, boolean disponible) {
        this.tipusAllotjament=tipusAllotjament;
        this.nom=nom;
        this.capacitat=capacitat;
        this.disponible=disponible;
    } 

    //getter
    public String getTipusAllotjament() {
        return tipusAllotjament;
    }

    public String getNom() {
        return nom;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public boolean getDisponible() {
        return disponible;
    }

    //setter
    public void setTipusAllotjament(String nouTipusAllotjament) {
        tipusAllotjament = nouTipusAllotjament;
    }

    public void setNom(String nouNom) {
        nom = nouNom;
    }

    public void setCapacitat(int nouCapacitat) {
        capacitat = nouCapacitat;
    }

    public void setDisponible(boolean nouDisponible) {
        disponible = nouDisponible;
    }



    //funciones específicas

    public void menu() {
        System.out.println("\nMenú: ");
        System.out.println("[1] Mostrar allotjaments disponibles");
        System.out.println("[2] Reservar allotjament");
        System.out.println("[3] Alliberar allotjament");
        System.out.println("[4] Buscar allotjaments x cerca personalitzada");
        System.out.println("[5] Sortir");
    }

    public int lectorMenu() {
        int opcio = cross.integerVerificacion("\nSelecciona una opció, del 1 al 5: ");

        while (opcio<1 || opcio>5) {
            System.out.println("Error. Has d'escriure un numero entre el 1 i el 5. ");
            opcio=cross.integerVerificacion("Selecciona una opció, del 1 al 5: ");

        }

        return opcio;

    }

    public void cercaPersonalitzada() {
        System.out.println("\nSelecciona una cerca: ");
        System.out.println("[1] Buscar per preu màxim x nit");
        System.out.println("[2] Buscar per disponibilitat de cuina (només apartaments)");
        System.out.println("[3] Buscar per disponibilitat de jardí o piscina (només cases rurals)");

    }

    public int lectorCercaPersonalitzada() {
        int opcioDeCerca = cross.integerVerificacion("\nSelecciona un numero del 1 al 3: ");

        while (opcioDeCerca<1 || opcioDeCerca>3) {
            System.out.println("Error. Has d'escriure un numero entre el 1 i el 3.");
            opcioDeCerca = cross.integerVerificacion("Selecciona un numero del 1 al 3: ");
        }

        return opcioDeCerca;

    }

    public double calcularPreuNit() {
        System.out.println("No hi ha preu x nit a calcular...");
        return 0.0;
    }

    public String mostrarInformacio() {
        
        //como tiene que retornar un string, lo guardamos en un var String y no en cadenas de system.out.print
        String informacio = "- "+tipusAllotjament + ": "+nom+" (Capacitat: " + capacitat + ") - "+(disponible ? "Disponible" : "No disponible")+" - ";

        return informacio;
    }

    public boolean reservar() {        

        if (disponible) {
            disponible = false; //porq si esta disponible lo reservamos, así que pasa a NO estar disp 
            System.out.println("Reservat correctament");
            
            return true;

        } else {
            System.out.println("Aquest allotjament no està disponible x reservar");
            
            return false;
        }
    }

    public void alliberar() {
        if (!disponible) {
            disponible = true; //si no esta disp, cambiamos la disp a true !!
            System.out.println("Alliberat correctament");
        } else {
            System.out.println("Aquest allotjament ja estava previament alliberat");
        }
    }

    public void isDisponible() {
        if (disponible) {
            System.out.println("Aquest allotjament està disponible :)");
        } else {
            System.out.println("Aquest allotjament no està disponible :(");
        }
    }

}
