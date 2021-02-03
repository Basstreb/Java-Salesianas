package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		
		int contmenor = 0, contmayor = 0, suma = 0;
		
		System.out.println("Introduce el número baliza");
		int baliza = nums.nextInt();
		
		System.out.println("Introduce la cantidad de números a comparar con baliza");
		int compbal = nums.nextInt();
		
		System.out.println("Introduce los números a comparar");
		for (int i = 1; i <= compbal; i++) {
			int comp = nums.nextInt();
			
			if (comp>baliza) {
				contmayor++;
				suma += comp;
			}
			else if (comp<baliza){
				contmenor++;
			}
		}
		
		System.out.println("Hay " + contmayor + " números mayor/es que la baliza, " + contmenor + " menor/es y la suma de los mayores es " + suma);
	}

}
