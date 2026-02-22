package AEA3.entregas.FIGURA;

public class Rombe extends Figura{
    private int dMayor;
    private int dMenor;

    public Rombe() {
        super("Rombe", 05);

    }

    public Rombe(int dMayor, int dMenor){
        super("Rombe", 05);
        this.dMayor=dMayor;
        this.dMenor=dMenor;
    }

    //getter
    public int getDMayor() {
        return dMayor;
    }

    public int getDMenor() {
        return dMenor;
    }

    //setter
    public void setDMayor(int nouDMayor) {
        dMayor = nouDMayor;
    }

    public void setDMenor(int nouDMenor) {
        dMenor = nouDMenor;
    }

    //funciones específicas
    public double calcularArea() {
        double area=(dMayor*dMenor)/2;
        return area;
    }


}
