package AEA3.entregas.SISTEMA_RESERVES;

public class CasaRural extends Allotjament {
    private boolean teJardi;
    private boolean tePiscina;

    public CasaRural(boolean teJardi, boolean tePiscina) {
        super("Casa Rural","Masia Verda", 10, true);
        this.teJardi=teJardi;
        this.tePiscina=tePiscina; 
    }
    

    //getter
    public boolean getTeJardi() {
        return teJardi;
    }

    public boolean getTePiscina() {
        return tePiscina;
    }

    //setter
    public void setTeJardi(boolean nouTeJardi) {
        teJardi = nouTeJardi;
    }

    public void setTePiscina(boolean nouTePiscina) {
        tePiscina = nouTePiscina;
    }



    //funciones específicas

    public double calcularPreuNit() {
        // 150 base noche + 50 si tiene piscina
        double preu = 150;
        
        if (getTePiscina()) {
            preu = 200;
            return preu;
        } 

        return preu;
        
    }

    public String jardiDisponible() {
        if (getTeJardi()) {
            return "Sí";
        } else {
            return "No";
        }
    }

    public String piscinaDisponible() {
        if (getTePiscina()) {
            return "Sí";
        } else {
            return "No";
        }
    }

    public String mostrarInformacio() {
        // escribir los complementos + cargos extras de precio noche
        return super.mostrarInformacio()+"Jardí: "+jardiDisponible()+", Piscina: "+piscinaDisponible()+"\n  El preu per nit d'aquest allotjament es de: "+calcularPreuNit() +" euros";
    }
}
