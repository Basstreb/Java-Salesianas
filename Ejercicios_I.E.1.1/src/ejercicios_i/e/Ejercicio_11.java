package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		System.out.println("Introduzca dos numeros amigos");
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		
		int ami1;
		int ami2;
		int num2;
		int num1;

		do {
			ami1 = 0;
			ami2 = 0;
			num1 = nums.nextInt();
			num2 = nums.nextInt();
			
			for (int i = 1; i < num1; i++) {
				if (num1%i == 0) {
					ami1 += i;
				}
			}
			for (int x = 1; x < num2; x++) {
				if (num2%x == 0) {
					ami2 += x;
				}
			}
			
		} while (ami1 != num2 & ami2 != num2);
		
		System.out.println("Son dos números amigos");
	}

}
