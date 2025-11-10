package AEA1.entregas;

import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);		
		System.out.println("Escribe una figura (triangulo, círculo, trapecio, rombo, paralelogramo): ");

		String figura = s.nextLine(); 
		
		if (figura.equals("trapecio")){
			System.out.println("Introduce la base mayor: ");
			double baseMayor = s.nextDouble();

			System.out.println("Introduce la base menor: ");
			double baseMenor = s.nextDouble();

			System.out.println("Introduce la altura: ");
			double altura = s.nextDouble();

			double areaTrapecio = ((baseMayor+baseMenor)*altura)/2;
			System.out.println("Area del trapecio: " + areaTrapecio);

		}
		
		else if (figura.equals("rombo")){
			System.out.println("Introduce la diagonal mayor: ");
			double diagonalMayor = s.nextDouble();

			System.out.println("Introduce la diagonal menor: ");
			double diagonalMenor = s.nextDouble();

			double areaRombo = (diagonalMayor*diagonalMenor)/2;
			System.out.println("Area del rombo: " + areaRombo);

		}
		else if (figura.equals("triangulo")){
			System.out.println("Introduce la base: ");
			double base = s.nextDouble();

			System.out.println("Introduce la altura: ");
			double altura = s.nextDouble();

			double areaTriangulo = (base*altura)/2;
			System.out.println("Area del triángulo: " + areaTriangulo);
		}
		else if (figura.equals("circulo")){
			System.out.println("Introduce el radio: ");
			double radio = s.nextDouble();

			double numeroPi = 3.1416;

			double areaCirculo = numeroPi*(radio*radio);

			System.out.println("Area del círculo: " + areaCirculo);
		}
		else if (figura.equals("paralelogramo")){
			System.out.println("Introduce la base: ");
			double base = s.nextDouble();

			System.out.println("Introduce la altura: ");
			double altura = s.nextDouble();

			double areaParalelogramo = base*altura;
			System.out.println("Area del paralelogramo: " + areaParalelogramo);
		}
    }
}
