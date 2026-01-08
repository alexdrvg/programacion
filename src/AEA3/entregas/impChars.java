package AEA3.entregas;

public class impChars {
    public void main(String[] args) {
        System.out.println("Programa que imprime cualquier char, y las veces que se pida: ");
        imprimir('z',4);
    }
    // no tiene param. salida, pero si dos de entrada !
    public void imprimir (char a, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(a);
        }
    }
}
