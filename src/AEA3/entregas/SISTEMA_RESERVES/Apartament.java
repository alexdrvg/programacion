package AEA3.entregas.SISTEMA_RESERVES;

public class Apartament extends Allotjament {
    private int habitacions;
    private boolean teCuina;

    public Apartament (int habitacions, boolean teCuina) {
        super("Apartament","Apartament Blue", 6, true);
        this.habitacions=habitacions; 
        this.teCuina=teCuina;

    }

    //getter
    public int getHabitacions() {
        return habitacions;
    }

    public boolean getTeCuina() {
        return teCuina;
    }

    //setter
    public void setHabitacions(int nouHabitacions) {
        habitacions = nouHabitacions;
    }

    public void setTeCuina(boolean nouTeCuina) {
        teCuina = nouTeCuina;
    }


    //funciones específicas

    public double calcularPreuNit() {
        //100 base + 10 x cada hab
        double preu = 100+(getHabitacions()*10);
        
        return preu;
    }

    public String cuinaDisponible() {
        if (getTeCuina()) {
            return "Sí";
        } else {
            return "No";
        }
    }

    public String mostrarInformacio() {
        //lo ponemos dentro del return para que no haga @override con el mostrarinformacio del padre
        return super.mostrarInformacio() + "Habitacions: "+getHabitacions()+", Cuina: "+cuinaDisponible()+"\n  El preu per nit d'aquest allotjament es de: "+calcularPreuNit() +" euros";
        
    }
    
}
