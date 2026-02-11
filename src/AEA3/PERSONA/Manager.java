package AEA3.PERSONA;

public class Manager extends Employee {
    private int num_trabajadores;

    //constructora
    public Manager(String nombre, double salario){
        super(nombre, salario, "Manager",15);
        //no podemos el "puesto_trabajo" en entrada de constructora
        //porque ya sabemos que puesto tiene, así que no lo pedimos
        //pero lo escribimos en el super para que el programa lo sepa (obligatorio)
        ++num_trabajadores;
    }

    //getter
    public int getNum_trabajadores() {
        return num_trabajadores;
    }

    //setter
    public void setNum_trabajadores(int nouNum_trabajadores) {
        num_trabajadores = nouNum_trabajadores;
    }

    //función específica gestionProyecto()
    public void gestionProyecto() {
        System.out.println("Estoy gestionando mi proyecto...");
    }

}
