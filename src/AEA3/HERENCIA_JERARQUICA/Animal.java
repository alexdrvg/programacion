package AEA3.HERENCIA_JERARQUICA;

public class Animal {
    private String especie;
    private String reino;
    private String genero;
    private String alimentacion;

    // constructor
    public Animal (String especie, String reino, String genero){
        this.especie=especie;
        this.reino=reino;
        this.genero=genero;
    }

    //setter
    public void setEspecie(String nouEspecie) {
        especie = nouEspecie;
    }

    public void setReino(String nouReino) {
        reino = nouReino;
    }

    public void setGenero(String nouGenero) {
        genero = nouGenero;
    }  
    
    public void setAlimentacion(String nouAlimentacion) {
        alimentacion = nouAlimentacion;
    }

    //getter
    public String getEspecie() {
        return especie;
    }

    public String getReino() {
        return reino;
    }

    public String getGenero() {
        return genero;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    //funcion 

    public void sound() {
        System.out.println("Mute");
    }

}
