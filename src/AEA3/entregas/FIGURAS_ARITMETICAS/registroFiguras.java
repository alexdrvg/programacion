package AEA3.entregas.FIGURAS_ARITMETICAS;

public class registroFiguras {
    public static void main(String[] args) {
        registroFiguras programa = new registroFiguras(); // calculoFiguras como instancia/objeto
        programa.inicio(); // y se guarda en la variable programa
        // NO HACE FALTA HACER ESTO si podemos static en todas las funciones 
    }

    public void inicio() {
        System.out.println("Bienvenido a este programa para calcular areas"); // así solo manda una vez el mensaje, solo cuando inicia el programa
        
        tratarOpcion opciones = new tratarOpcion(); // así conectamos el doc de opciones

        while (!opciones.getFin()) { // para coger la variable boolean fin del doc, donde allí si se modifica !!
            opciones.mostrarMenu();
            opciones.opciones();
        }
    
    }
    
}
