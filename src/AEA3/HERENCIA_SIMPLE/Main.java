package AEA3.HERENCIA_SIMPLE;

public class Main {
    public static void main(String[] args) {
        Estudiant estudiant1  = new Estudiant(01, 21,"Alexandra","Raymi","Digoine", "DAM", "PratFP");
        //falta assignaturas y notas 
        estudiant1.setAssignatures(new String[] {"Programación","Base de Datos"});
        estudiant1.setNotes(new double[]{10,9,9});

        Estudiant estudiant2 = new Estudiant(02, "Alexa", "Vilela", "DAM 1", "Prat");
        //falta edad, adreça, assignaturas y notas 
        estudiant2.setEdat(15);
        estudiant2.setAdreça("Josep Tarradelles");
        estudiant2.setAssignatures(new String[] {"Sistemas Informáticos","Entorns de Desenvolupament"});

        Estudiant estudiant3 = new Estudiant(03, "Alex", "Lara");
        //falta edat, adreça, curs, assignaturas, escola, notes
        estudiant3.setEdat(19);
        estudiant3.setAdreça("Hospitalet del Llobregat");
        estudiant3.setCurs("DAM 2");
        estudiant3.setAssignatures(new String[]{"Lideratge"});
        estudiant3.setEscola("Prat Formació Professional");
        estudiant3.setNotes(new double[]{10});

        Persona persona1 = new Persona(10, 24, "May", "Coral", "Provença");
        

        Persona persona2 = new Persona(11, "Ferly","Terry");
        //falta edad y calle

    }
}
