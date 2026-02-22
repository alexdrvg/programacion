package AEA3.entregas.PERSONA;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- INFORMACIÓN DE TRABAJADOR ---");
        Employee trabajador = new Employee("Alex", 1800, "Diseñador Web");
        System.out.println("Nombre del trabajador: "+trabajador.getNombre());
        System.out.println("Salario: "+trabajador.getSalario());

        System.out.println("\n--- INFORMACIÓN DE MANAGER ---");
        Manager manager = new Manager("Alexandra", 2800);
        System.out.println("Nombre del trabajador: "+manager.getNombre());
        System.out.println("Salario: "+manager.getSalario());
        System.out.println("Bonus: "+manager.calcularBonus(manager.getSalario()));
        manager.gestionProyecto();

        System.out.println("\n--- INFORMACIÓN DE DESARROLLADOR ---");
        Developer desarrolador = new Developer("Martí", 1000, "Java");
        System.out.println("Nombre del trabajador: "+desarrolador.getNombre());
        System.out.println("Salario: "+desarrolador.getSalario());
        System.out.println("Bonus: "+desarrolador.calcularBonus(desarrolador.getSalario()));
        desarrolador.escribirCodigo();

        System.out.println("\n--- INFORMACIÓN DE PROGRAMADOR ---");
        Programmer programador = new Programmer("Alejandra", 2500);
        System.out.println("Nombre del trabajador: "+programador.getNombre());
        System.out.println("Salario: "+programador.getSalario());
        System.out.println("Bonus: "+programador.calcularBonus(programador.getSalario()));
        programador.debug();

    }
}
