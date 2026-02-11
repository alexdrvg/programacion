package AEA3.HERENCIA_MULTINIVELL;

public class Seat extends Car {
    private String modelo;
    private String tipo_combustible;

    //constructor 
    public Seat (String matricula, String marca, int potencia_caballos, String color, String modelo) {
        super(matricula, marca, potencia_caballos, color);
        this.modelo=modelo;
    }
    
    //setter

    public void setModelo(String nouModelo) {
        modelo = nouModelo;
    }

    public void setTipo_combustible(String nouTipo_combustible) {
        tipo_combustible = nouTipo_combustible;
    }


    //getter

    public String getModelo() {
        return modelo;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

}
