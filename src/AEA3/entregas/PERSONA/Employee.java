package AEA3.entregas.PERSONA;

public class Employee {
    private String nombre;
    private String direccion;
    private double salario;
    private String puesto_trabajo;
    private double bonus;
    
    public Employee(String nombre, double salario, String puesto_trabajo) {
        this.nombre=nombre;
        this.salario=salario;
        this.puesto_trabajo=puesto_trabajo;
    }

    public Employee(String nombre,double salario,String puesto_trabajo, double bonus) {
        this.nombre=nombre;
        this.salario=salario;
        this.puesto_trabajo=puesto_trabajo;
        this.bonus=bonus;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getSalario() {
        return salario;
    }

    public String getPuesto_trabajo() {
        return puesto_trabajo;
    }

    //setter

    public void setNombre(String nouNombre) {
        nombre = nouNombre;
    }

    public void setDireccion(String nouDireccion) {
        direccion = nouDireccion;
    }

    public void setSalario(double nouSalario) {
        salario = nouSalario;
    }

    public void setPuesto_trabajo(String nouPuesto_trabajo) {
        puesto_trabajo = nouPuesto_trabajo;
    }

    public double calcularBonus (double salario) {
        salario=(salario*bonus)/100;
        return salario;
    }

}
