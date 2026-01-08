package AEA3.entregas;

import java.util.Scanner;

public class LlegirEnters {
  public static void main (String[] args) {
    LlegirEnters programa = new LlegirEnters();
    programa.inici();
  }
  public void inici() {
    System.out.println("Llegiu un real pel teclat:");
    double a = llegirEnterTeclat();
    System.out.println("El num real ha estat " + a + ".");
    System.out.println("Llegiu un altre real pel teclat:");
    a = llegirEnterTeclat();
    System.out.println("L'altre num real ha estat " + a + ".");
  }
  //1. Quin tipus de valor genera? Un real (double)
  public double llegirEnterTeclat() {
  //2. Es fa el codi que llegeix un únic enter del teclat, com s’ha fet sempre
  //No canvia absolutament res...
    Scanner lector = new Scanner(System.in);
    double enterLlegit = 0;
    boolean llegit = false;
    
    while (!llegit) {
        llegit = lector.hasNextDouble();
        
        if (llegit) {
            enterLlegit = lector.nextDouble();
            } else {
            System.out.println("Això no és un enter.");
            lector.next();
        }
    } lector.nextLine();
  //3. Un cop fet, quina variable t  el resultat? "enterLlegit"
  //4. Cal fer "return" damunt seu
  return enterLlegit;

  }
}