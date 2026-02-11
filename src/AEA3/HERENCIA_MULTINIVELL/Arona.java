package AEA3.HERENCIA_MULTINIVELL;

public class Arona extends Seat{
    private double precio;
    private String coche_cambio;

    //constructor
    public Arona(String matricula, String marca, int potencia_caballos, String color, String modelo, double precio){
        super(matricula, marca, potencia_caballos, color, modelo);
        this.precio=precio;
    }

    //setter
    public void setPrecio(double nouPrecio) {
        precio = nouPrecio;
    }

    public void setCoche_cambio(String nouCoche_cambio) {
        coche_cambio = nouCoche_cambio;
    }

    //getter
    public double getPrecio() {
        return precio;
    }

    public String getCoche_cambio() {
        return coche_cambio;
    }
}
