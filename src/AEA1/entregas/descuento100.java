package AEA1.entregas;

import java.util.Scanner;

public class descuento100 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);		
		System.out.println("Enter price of the product: ");

		double product = s.nextDouble(); 

		if (product>=100) {
			double finalProduct = product - (product*(8.0/100.0));
			System.out.println("Discount of 8% applied. Final price is: " + finalProduct);
		} else if (product<30){
			System.out.println("2 euros penalty has been applied. Final price is: " + (product+2));
		} else {
			System.out.println("There hasn't been any discount or penalty applied. Final price is: " + product);

		}
	
    }
}
