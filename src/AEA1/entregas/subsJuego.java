package AEA1.entregas;

import java.util.Scanner;

public class subsJuego {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);		
		System.out.println("Introduce your type of subscription (1-4): ");
		
		int sub = s.nextInt();

		switch (sub) {
			case 1:
				System.out.println("Basic");
				break;
			case 2:
				System.out.println("Standard");
				break;
			case 3:
				System.out.println("Premium");
				break;
			case 4:
				System.out.println("VIP");
				break;
			default:
				System.out.println("No valid option");
		}
    }
}
