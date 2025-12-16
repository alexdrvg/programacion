package AEA3;

public class estrellas {
    //parametros de entrada (practicar parametro de salida)
    public static void main(String[] args) {
        System.out.println("Has pedido dibujar... ");
        Estrellas(5);
        System.out.println("Aquí acaba el programa.");
        
    }

    public static void Estrellas (int numEstrellas) {
        for (int i = 0; i < numEstrellas; i++) {
            System.out.print("*");
        }

        System.out.println(); 
    }
}
