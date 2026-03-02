package CROSS;
import java.util.Scanner;

public class cross {
    public static final Scanner s = new Scanner(System.in);

    //public para que cualquier clase puedan acceder y ver a la función 
    //static para que no haga falta crear un objeto para acceder a la función (así pertenece a la clase, no a un objeto)
    public static int integerVerificacion(String mensaje) {
        System.out.println(mensaje); // se escribirá el syos pedido, ejemplo: "Escribe la base del rectángulo:" ...
        //y si lo que escribe no es un integer entonces se activa el while 
        while(!s.hasNextInt()) {
            s.next(); //limpiamos buffer
            System.out.println("Error. Tienes que escribir un número. Vuelve a intentarlo: ");
        }

        int valor = s.nextInt();
        s.nextLine(); // así se limpia el \n para que no falle el siguiente input !!!
        // IMPORTANTE: ponerlo después de pedir de nuevo el valor, porq así se come el \n sobrante y deja el próximo input limpio para la próxima !!

        return valor;
    }   

    public static double doubleVerificacion(String mensaje) {
        System.out.println(mensaje);

        while(!s.hasNextDouble()) {
            s.next();
            System.out.println("Error. Tienes que escribir un número decimal. Vuelve a intentarlo: ");
        }

        double valor = s.nextDouble();
        s.nextLine();

        return valor;
    }

    //falta String (validar que no envie espacio en vacio)

}
