package AEA2.entregas;

public class pares {
    public static void main(String[] args) {
        int[]a = new int [100];

		System.out.println("Arrays con 100 numeros pares:");

		for (int i=0; i<a.length; i++) {
			a[i]= i * 2; 
			System.out.print(a[i]+" ");
		
		}
    }
}
