package AEA1.entregas;

import java.util.Scanner;

public class descuento95 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);		
		System.out.println("Enter price of the product: ");

		double product = s.nextDouble(); 

		if (product>=95) {
			double finalProduct = product - (product*(15.0/100.0));
			System.out.println("Discount applied. Final price is: " + finalProduct);
		} else {
			System.out.println("Discount doesn't apply. Final price is: " + product);

		}
    }
}
