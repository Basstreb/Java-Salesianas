package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		
		System.out.println("Inserte un numero hasta el 100.");
		
		int num = 1;
		int x;
		int cont;
		int n;
		
		@SuppressWarnings("resource")
		Scanner numA = new Scanner(System.in);

		do {
			n = numA.nextInt();
		} while (n<1 || n>100);
		
		while (num <= n) {
			
			x = 1;
			cont = 0;
			
			while (x <= num) {
				
				if (num%x == 0) {
					cont ++;
				}
				
				x ++;
			}
			
			if (cont == 2) {
				System.out.println(num);
			}
			
			num ++;
		}
	}

}
