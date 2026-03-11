package AEA3.entregas.SISTEMA_RESERVES;

public class Habitacio extends Allotjament {
    private int numLlits;

    public Habitacio (int numLlits) {
        super("Habitació", "Habitacio 101", 2, true);
        this.numLlits=numLlits;
    }

    //getter
    public int getNumLlits() {
        return numLlits;
    }

    //setter
    public void setNumLLits(int nouNumLLits) {
        numLlits = nouNumLLits;
    }



    //funciones específicas
    public double calcularPreuNit() {
         
        //base 50 euros x noche + 20 x cama adicional a partir de la 3
        double preu = 50+((getNumLlits()-2)*20);
        
        return preu;
    }

    public String mostrarInformacio() {
        // escribir los complementos + cargos extras de precio noche
        return super.mostrarInformacio() + "Llits: "+numLlits +"\n  El preu per nit d'aquest allotjament es de: "+calcularPreuNit() +" euros";
    }

}
