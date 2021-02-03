package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		
		int max1 = 0;
		int max2 = 0;
		int maxx = 0;
		int num;
		
		System.out.println("Escriba una secuencia de numeros deseada para ver los dos mayores, se termiunara cuando introduzca uno negativo.");
		
		do {
			num = nums.nextInt();
			
			if (max1<num) {
				maxx = max1;
				max1 = num;
			}
			else if (max2<num & num<max1) {
				max2 = num;
			}
			else if (max2<maxx) {
				max2 = maxx;
			}
		} while (num>0);
		
		System.out.println(max1);
		System.out.println(max2);
	}

}
