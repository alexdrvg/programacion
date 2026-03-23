package AEA3.EXAMEN;

public class NotaAText {

    //Param. entr: la nota que volem transformar a text
    //Param. sort: la nota transformada en text

    public String notaAText(double nota) {
        //Desenvolupeu el vostre codi aquí

        String notaEscogida = "";

        if (nota==10) {
            notaEscogida = "Excel·lent";
        } else if (nota<5) {
            notaEscogida = "Suspés";
        } else {
            notaEscogida = "Aprovat";
        }

        return notaEscogida;
    }
}


