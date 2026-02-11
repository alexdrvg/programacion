package AEA3.PERSONA_EJEMPLO;

public class principal {
    public static void main(String[] args) {

        Persona persona1 = new Persona("46481472J","Alexandra",(short)21);

        Persona persona2 = new Persona("Alex",(short)20);
        persona2.setDni("11111111A");

        Persona persona3 = new Persona((short)19, "22222222B");
        persona3.setNom("Alexa");

        Persona persona4 = new Persona("33333333C");
        persona4.setNom("Alex");
        persona4.setEdat(18);

        Persona persona5 = new Persona((short)17);
        persona5.setNom("Ale");
        persona5.setDni("44444444D");

        System.out.println(persona5.getNom());

    }
}

