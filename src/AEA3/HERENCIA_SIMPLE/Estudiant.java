package AEA3.HERENCIA_SIMPLE;

public class Estudiant extends Persona {
    private String curs;
    private String[] assignatures;
    private String escola;
    private double[] notes;

    public Estudiant(int id, int edat, String nom, String cognom, String adreça, String curs, String escola) {
        super(id, edat, nom, cognom, adreça);
        this.curs=curs;
        this.escola=escola;
    }

    //parametro de entrada con los OBLIGATORIOS parametros de constructor Persona + los elegidos x cada uno (en mi caso curs y escola)
    public Estudiant(int id, String nom, String cognom, String curs, String escola) {
        super(id, nom, cognom);
        this.curs=curs;
        this.escola=escola;
    }

    // aquí x ejemplo no pedimos ningun parametro de estudiante, así que tiene que ir los de Persona (segundo) obligatorio
    public Estudiant(int id, String nom, String cognom) {
        super(id, nom, cognom);
    }

   
    //setters

    public void setCurs(String nouCurs) {
        curs=nouCurs;
    }

    public void setAssignatures(String[] novesAssignatures) {
        for (int i = 0; i < assignatures.length; i++) {
            assignatures[i]=novesAssignatures[i];
        }
    }

    public void setEscola(String novaEscola) {
        escola=novaEscola;
    }

    public void setNotes(double[] novesNotes) {
        for (int i = 0; i < notes.length; i++) {
            notes[i]=novesNotes[i];
        }
    }

    //getters 
    
    public String getCurs() {
        return curs;
    }

    public String[] getAssignatures() {
        return assignatures;
    }

    public String getEscola() {
        return escola;
    }

    public double[] getNotes() {
        return notes;
    }
}
