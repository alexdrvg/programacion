package AEA3.HERENCIA_JERARQUICA;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Tiburón", "Animalia", "Hembra");
        animal1.setAlimentacion("Carnívoro");
        System.out.println(animal1.getGenero());

        Dog dog1 = new Dog("Perro", "Animal", "Macho", "Pomeranian", "Marrón", 8, "Corto");
        System.out.println(dog1.getEspecie());

        Cat cat1 = new Cat("Gato", "Animal", "Femenino", "Tuxedo", "Negro y blanco", 6.5, "Corto");
        System.out.println(cat1.getRaza());
    }
}

