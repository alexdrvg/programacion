package AEA3.entregas.PERSONA;

public class Developer extends Employee {
    private String lenguaje_programacion;

    //constructora
    public Developer(String nombre, double salario, String lenguaje_programación) {
        super(nombre, salario, "Desarrollador de Software",10);
        this.lenguaje_programacion=lenguaje_programación;
    }

    // setter
    public void setLenguaje_programacion(String nouLenguaje_programacion) {
        lenguaje_programacion = nouLenguaje_programacion;
    }

    // getter
    public String getLenguaje_programacion() {
        return lenguaje_programacion;
    }

    //función específica escribirCodigo
    public void escribirCodigo() {
        System.out.println("Estoy escribiendo mi ultra duper super código...");
    }

}
