package AEA4.entregas;

public class InicialitzaParells {
  public static void main(String[] args) {
    
    try {
      // Caldrà emmagatzemar 100 enters.
      int[] arrayParells = new int[100];
      // Anem omplint cada posició.
      for(int i = 0; i <= arrayParells.length; i++) {
        arrayParells[i] = 2 * i;
        System.out.println(arrayParells[i]);
      }

    } catch (ArrayIndexOutOfBoundsException a) {
      System.out.println("Error en el array: "+ a);
    } catch (Exception e) {
      System.out.println("Error en el código: "+ e);
    } finally {
      System.out.println("Final del programa :D");
    }
    
  }
}
