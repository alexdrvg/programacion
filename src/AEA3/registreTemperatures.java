package AEA3;
import java.util.Scanner;

public class registreTemperatures {
  //Constants
  private static final int MAX_SETMANES = 52;
  public static final Scanner s = new Scanner(System.in); // final significa que el valor no se puede canviar

  //Variables globals
  private boolean fi = false; // mentre FI sigui FALSE, executarem el programa
  private int numTemperatures = 0;
  private double[] temperatures = new double[MAX_SETMANES * 7];
  private int dia = 1;
  private int mes = 1;

  //M todes associats al problema general
  public static void main (String[] args) {
    registreTemperatures programa = new registreTemperatures();
    programa.inici();
  }

  public void inici() {
    while (!fi) {
      mostrarMenu();
      tractarOpcio();
    } 
  }

  //Mètodes associats al punt 2 
  public void mostrarMenu() {
    System.out.println("\nBenvingut al registre de temperatures");
    System.out.println("----------------------------------------");
    System.out.println("[RT] Registrar temperatures setmanals.");
    System.out.println("[MJ] Consultar temperatura mitjana.");
    System.out.println("[DF] Consultar diferència màxima.");
    System.out.println("[FI] Sortir.");
    System.out.print("Opció: ");
  }

  public void tractarOpcio() {
    String opcio = s.nextLine(); 
    if (opcio.equalsIgnoreCase("RT")) {
      registreTemperaturesSetmanals();
    } else if (opcio.equalsIgnoreCase("MJ")) {
      mostrarMitjana();
    } else if (opcio.equalsIgnoreCase("DF")) {
      mostrarDiferencia();
    } else if (opcio.equalsIgnoreCase("FI")) {
      finalitzarExecucio();
    } else {
      System.out.println("Opció no vàlida");
    }
  }

  //M todes associats al punt 3
  public void registreTemperaturesSetmanals() {
    //Cal controlar si hi haurà espai per a aquests 7 registres
    if ((numTemperatures + 7) >= temperatures.length) {
      System.out.println("No queda espai per a més temperatures.");
    }
    else {
      llegirTemperaturesTeclat();
      incrementarData();
    }
  }

  public void mostrarMitjana() {
    if (numTemperatures > 0) {
      System.out.print("\nFins avui ");
      mostrarData();
      System.out.print(" la mitjana ha estat de ");
      calculaMitjana();
      System.out.println(" graus.");
    }
    else {
      System.out.println("\nNo hi ha temperatures registrades.");
    }
  }

  public void mostrarDiferencia() {
     if (numTemperatures > 0) {
      System.out.print("\nFins avui ");
      mostrarData();
      System.out.print(" la diferencia de temperatures es de ");
      calculaDiferencia();
      System.out.println(" graus.");
    }
    else {
      System.out.println("\nNo hi ha temperatures registrades.");
    }
  }

  public void finalitzarExecucio() {
    System.out.println("Hasta la próxima :D ");
    fi = true;
    
  }

  public void llegirTemperaturesTeclat() {
    System.out.println("Escriu les temperatures d’aquesta setmana:");
    int numLlegides = 0;
    while (numLlegides < 7) {
      if (s.hasNextFloat()) {
        temperatures[numTemperatures] = s.nextFloat();
        numLlegides++;
        numTemperatures++;
      }
      else {
        s.next();
      }
    }
  }

  public void incrementarData() {
    //Quants dies t  aquest mes?
    int diesAquestMes = 0;
    if (mes == 2) {
      diesAquestMes = 28;
    }
    else if ((mes == 4)||(mes == 6)||(mes == 9 )||(mes == 11)) {
      diesAquestMes = 30;
    }
    else {
      diesAquestMes = 31;
    }
    dia = dia + 7;
    //Hem passat de mes?
    if (dia > diesAquestMes) {
      dia = dia - diesAquestMes;
      mes++;
      //Hem passat d’any?
      if (mes > 12) {
        mes = 1;
      }
    }
  }

  public void mostrarData() {
    System.out.print(dia + " de ");
    switch(mes) {
      case 1:
        System.out.print("Gener");
        break;
      case 2:
        System.out.print("Febrer");
        break;
      case 3:
        System.out.print("Març");
        break;
      case 4:
        System.out.print("Abril");
        break;
      case 5:
        System.out.print("Maig");
        break;
      case 6:
        System.out.print("Juny");
        break;
      case 7:
        System.out.print("Juliol");
        break;
      case 8:
        System.out.print("Agost");
        break;
      case 9:
        System.out.print("Setembre");
        break;
      case 10:
        System.out.print("Octubre");
        break;
      case 11:
        System.out.print("Novembre");
        break;
      case 12:
        System.out.print("Desembre");
    }
  }

  public void calculaMitjana() {
    double acumulador = 0;
    for(int i = 0; i < numTemperatures; i++) {
      acumulador = acumulador + temperatures[i];
    }
    System.out.print((acumulador / numTemperatures));
  }

  public void calculaDiferencia() {
    double maximo = temperatures[0]; 
    double minimo = temperatures[0];

    for (int i = 0; i < temperatures.length; i++) {
      if (maximo<temperatures[i]) {
        maximo = temperatures[i];
      }
      
      if (temperatures[i]<minimo) {
        minimo = temperatures[i];
      }
    }

    System.out.println(maximo-minimo);

  }
}
