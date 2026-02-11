package AEA3.HERENCIA_MULTINIVELL;

public class Main {
    public static void main(String[] args) {
        Arona arona1 = new Arona("AAA8153", "Ibiza", 200, "Blanco", "Seat",25.000);
        //falta cambios
        arona1.setCoche_cambio("Automático");

        
        Seat seat1 = new Seat("AAA8153", "Ibiza", 200, "Negro", "Seat");
        //falta tipo de combustible
        seat1.setTipo_combustible("Diesel");

        
        Car car1 = new Car("FXX8153", "Seat", 180, "Gris");
        //falta si es o no kilometro cero
        car1.setKilometro_cero(true);
        
        Car car2 = new Car("BBB8153");
        //falta marca, caballos, color y kilometro cero
        car2.setMarca("Seat");
        car2.setPotencia_caballos(210);
        car2.setColor("Azul Navy");
        car2.setKilometro_cero(true);
    }
}
