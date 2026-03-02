package AEA3.entregas.FIGURA_MEJORADO;
import java.util.Scanner;

import CROSS.cross;

import java.util.Random;


public class Main {
        public static void main(String[] args) {
        
        Figura iniciador = new Figura(null, 0); //para acceder a las funciones seguentFigura, llegirDades, etc 

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        boolean fin = false;
        int figuraEscogida;

        System.out.println("--- Bienvenido a este programa para calcular areas de figuras ---");

        while (!fin) {

            iniciador.seguentFigura();
            figuraEscogida = iniciador.llegirDades(); //importante
            //guardamos la opcíon que escoga el usuario en figuraEscogida
            
            int azar = r.nextInt(2); //aquí declaramos aleatoriamente si será una constructora o otra

            if (figuraEscogida == 1) {
                if (azar == 1) {
                    Triangle triangle1 = new Triangle();
                    triangle1.lectorTriangle();
                    triangle1.imprimirDades();

                } else {
                    int base = cross.integerVerificacion("Introduce la base del triángulo: ");
                    int h = cross.integerVerificacion("Introduce la altura del triángulo: ");
                    
                    Triangle triangle0 = new Triangle(base, h);
                    triangle0.imprimirDades();
                } 
            } else if (figuraEscogida == 2) {
                if (azar == 1) {
                    Quadrat quadrat1 = new Quadrat();
                    quadrat1.lectorQuadrat();
                    quadrat1.imprimirDades();

                } else {
                    int costat = cross.integerVerificacion("Introduce el lado del cuadrado: ");

                    Quadrat quadrat0 = new Quadrat(costat);
                    quadrat0.imprimirDades();
                }
            } else if (figuraEscogida == 3) {
                if (azar==1) {
                    Rectangle rectangle1 = new Rectangle();
                    rectangle1.lectorRectangle();
                    rectangle1.imprimirDades();

                } else {
                    int base = cross.integerVerificacion("Introduce la base del rectángulo: ");
                    int altura = cross.integerVerificacion("Introduce la altura del rectángulo: ");

                    Rectangle rectangle0 = new Rectangle(base, altura);
                    rectangle0.imprimirDades();
                }
            } else if (figuraEscogida == 4) {
                if (azar==1) {
                    Trapezi trapezi1 = new Trapezi();
                    trapezi1.lectorTrapezi();
                    trapezi1.imprimirDades();

                } else {
                    int a = cross.integerVerificacion("Introduce la base mayor del trapezio: ");
                    int b = cross.integerVerificacion("Introduce la base menor del trapezio: ");
                    int h = cross.integerVerificacion("Introduce la altura del trapezio: ");

                    Trapezi trapezi0 = new Trapezi(a, b, h);
                    trapezi0.imprimirDades();
                }
            } else if(figuraEscogida == 5) {
                if (azar == 1) {
                    Rombe rombe1 = new Rombe();
                    rombe1.lectorRombe();
                    rombe1.imprimirDades();

                } else {
                    int dMayor = cross.integerVerificacion("Introduce la diagonal mayor: ");
                    int dMenor = cross.integerVerificacion("Introduce la diagonal menor: ");

                    Rombe rombe0 = new Rombe(dMayor, dMenor);
                    rombe0.imprimirDades();
                }
            } else if(figuraEscogida == 6) {
                if (azar==1) {
                    Paralelogramo paralelogramo1 = new Paralelogramo();
                    paralelogramo1.lectorParalelogramo();
                    paralelogramo1.imprimirDades();

                } else {
                    int base = cross.integerVerificacion("Introduce la base del paralelogramo: ");
                    int h = cross.integerVerificacion("Introduce la altura del paralelogramo: ");

                    Paralelogramo paralelogramo0 = new Paralelogramo(base, h);
                    paralelogramo0.imprimirDades();
                }   
            } else if (figuraEscogida == 7) {
                if (azar==1) {
                    Circulo ciruclo1 = new Circulo();
                    ciruclo1.lectorCirculo();
                    ciruclo1.imprimirDades();

                } else {
                    double radio = cross.doubleVerificacion("Introduce el radio del círculo: ");

                    Circulo circulo0 = new Circulo(radio);
                    circulo0.imprimirDades();
                }
            } else if (figuraEscogida == 8) {
                System.out.println("¡Hasta la próxima :D !");
                fin = true;
            }

        } 

        s.close();

    }

}
