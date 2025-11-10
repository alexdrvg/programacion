package AEA2;

import java.util.Scanner;

public class vocales {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

		int[] arrayEnters = new int [5];
		System. out.println("Escriu 5 nombres enters");

		int j = 0;

		while (j < arrayEnters. length) {
			int num = s.nextInt();
			arrayEnters [j] = num;
			System.out.println("Estic escrivint: " + arrayEnters[j] + " i hauria d'escriure " + num);
			++j;
		}

		for (int i = 0; i < arrayEnters. length; ++i){
		
			System.out.println(arrayEnters[i]);
		}

		/* char[] a = new char [8];
		System.out.println("Escriu 8 caracteres:"); 

		int j = 0;

		for (; j < a.length; j++) {
		
			char valores = s.next().charAt(0);
			a[j]=valores;

			if (valores=='a' || valores=='e' || valores=='i' || valores=='o' || valores=='u' ) {
				a[j]='0'; 
			}
		}
		
		for (int i = 0; i < a. length; ++i){
			System.out.println(a[i]);
		} */
		s.close();
    }
}
