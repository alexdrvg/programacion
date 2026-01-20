package AEA3.entregas.FIGURAS_ARITMETICAS;
   
public class calcularFiguras {
    public static double area; 

    lectorFiguras lector = new lectorFiguras(); // aquí conectamos con el doc con la info de cada figura

    public double calcularTriangulo() {
        area = (lectorFiguras.base*lectorFiguras.altura)/2;
        return area;
    }

    public double calcularRectangulo() {
        area = lectorFiguras.base*lectorFiguras.altura;
        return area;
    }

    public double calcularCirculo() {
        double numeroPi = 3.1416;

	    area = numeroPi*(lectorFiguras.radio*lectorFiguras.radio);

        return area;
    }  

    public double calcularTrapezio() {
        area = ((lectorFiguras.baseMayor+lectorFiguras.baseMenor)*lectorFiguras.altura)/2;
        return area;
    }

    public double calcularParalelogramo() {
        area = lectorFiguras.base*lectorFiguras.altura;

        return area;
    }

}