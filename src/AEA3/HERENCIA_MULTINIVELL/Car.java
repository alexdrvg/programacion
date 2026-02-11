package AEA3.HERENCIA_MULTINIVELL;

public class Car {
    private String matricula;
    private String marca;
    private int potencia_caballos;
    private String color;
    private boolean kilometro_cero;

    //constructor
    public Car (String matricula, String marca, int potencia_caballos, String color) {
        this.matricula=matricula;
        this.marca=marca;
        this.potencia_caballos=potencia_caballos;
        this.color=color;
    }

    public Car (String matricula) {
        this.matricula=matricula;
    }

    //setters

    public void setMatricula (String novaMatricula) {
        matricula=novaMatricula;
    }

    public void setMarca(String nouMarca) {
        marca = nouMarca;
    }

    public void setPotencia_caballos(int nouPotencia_caballos) {
        potencia_caballos = nouPotencia_caballos;
    }

    public void setColor(String nouColor) {
        color = nouColor;
    }

    public void setKilometro_cero(boolean nouKilometro_cero) {
        kilometro_cero = nouKilometro_cero;
    }

    //getters

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getPotencia_caballos() {
        return potencia_caballos;
    }

    public String getColor() {
        return color;
    }

    public boolean getKilometro_cero() {
        return kilometro_cero;
    }

}
