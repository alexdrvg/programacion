package AEA3.entregas.MAX_MIN;

public class calculo {
    // tiene tanto param. de salida (double y return) como entrada (guardarNotas lector)

    public double calcularMaximo(guardarNotas lector) { //al usar este metodo/función, se entregará un objeto
        // que este en el plano de guardarNotas, el cual aqui dentro se llamará "lector"

        // aqui lector.getNotas() funciona porque en principal.java hemos hecho calcularmax(lector), 
        // siendo ese (lector) una objetvo/instancia que hemos hecho en principal:  guardarNotas lector = new guardarNotas();
        // por eso al hacer .getNotas(), se conecta con la clase guardarNotas();


        double[] notas = lector.getNotas(); // guardamos en una nueva variable el notas[] privado del guardarNotas();
       
        double numMaximo = notas[0]; 

        for (int i = 0; i < notas.length; i++) {
            if (numMaximo<notas[i]) {
                numMaximo = notas[i]; 
            }
        }
        return numMaximo; 

    }

    public double calcularMinimo(guardarNotas lector) {

        double[] notas = lector.getNotas();
        double numMinimo = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i]<numMinimo) {
                numMinimo = notas[i]; 
            }
        }

        return numMinimo;
    }

    public double calcularMedia(guardarNotas lector) {

        double[] notas = lector.getNotas();
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        return suma/notas.length;

    }
}
