package AEA3.PERSONA;

public class Programmer extends Employee {

    //constructor
    public Programmer(String nombre, double salario){
        super(nombre, salario,"Desarrolador Java",12);
    }

    //función específica debug()
    public void debug(){
        System.out.println("Debugeando... Bip Bip :b");
    }

}
