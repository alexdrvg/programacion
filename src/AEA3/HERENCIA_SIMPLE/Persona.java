package AEA3.HERENCIA_SIMPLE;

public class Persona {
    private int id;
    private int edat;
    private String nom;
    private String cognom;
    private String adreça;

    public Persona (int id, int edat, String nom, String cognom, String adreça) {
        this.id=id;
        this.edat=edat;
        this.nom=nom;
        this.cognom=cognom;
        this.adreça=adreça;
    }   

    public Persona (int id,String nom, String cognom){
        this.id=id;
        this.nom=nom;
        this.cognom=cognom;
    }

    // setters

    public void setId(int nouId) { //sin parámetros de salida, solo de entrada y void
        id = nouId;
    }

    public void setEdat(int novaEdat) {
        edat=novaEdat;
    }

    public void setNom(String nouNom) {
        nom=nouNom;
    }

    public void setCognom(String nouCognom) {
        cognom=nouCognom;
    }

    public void setAdreça(String novaAdreça) {
        adreça=novaAdreça;
    }

    // getters

    public int getId() {
        return id;
    }

    public int getEdat() {
        return edat;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getAdreça() {
        return adreça;
    }

}


