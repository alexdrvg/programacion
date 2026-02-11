package AEA3.HERENCIA_JERARQUICA;

public class Cat extends Animal {
    private String raza;
    private String color;
    private double peso;
    private String tipo_pelo;

    //constructora
    public Cat (String especie, String reino, String genero, String raza, String color, double peso, String tipo_pelo) {
        super(especie, reino, genero);
        this.raza=raza;
        this.color=color;
        this.peso=peso;
        this.tipo_pelo=tipo_pelo;
    }

    //setter
    public void setRaza(String nouRaza) {
        raza = nouRaza;
    }

    public void setColor(String nouColor) {
        color = nouColor;
    }

    public void setPeso(double nouPeso) {
        peso = nouPeso;
    }

    public void setTipo_pelo(String nouTipo_pelo) {
        tipo_pelo = nouTipo_pelo;
    }

    //getter
    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }
    
    public double getPeso() {
        return peso;
    }

    public String getTipo_pelo() {
        return tipo_pelo;
    }

    //funcion 
    public void sound(){
        meow();
    }

    public void meow() {
        System.out.println("Miau Miaw");
    }
}
