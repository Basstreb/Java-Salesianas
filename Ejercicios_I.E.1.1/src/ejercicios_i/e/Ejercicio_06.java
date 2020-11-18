package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		
		System.out.println("Introduzca dos numeros para usar como limite de un intervalo:");
		int lim1 = nums.nextInt();
		int lim2 = nums.nextInt();
		
		int sumatotal = 0;
		int contator = 0;
		int i = 1;
		int num = 0;
		int check = 0;
		
		do {
			System.out.println("Numeros introducidos al reves");
			lim1 = nums.nextInt();
			lim2 = nums.nextInt();
		} while (lim1>lim2);
		
		System.out.println("Una vez introducido los numeros, proceda a introducir numeros, cuando introduzca un 0 parara el programa.");
		
		while (i != 0) {
			num = nums.nextInt();
			i = num;
			
			if (num>lim1 & num<lim2) {
				sumatotal += num;
			}
			else {
				if (num<lim1 || num>lim2) {
					contator++;
				}
				else {
					if (num == lim1 || num == lim2) {
						check = 1;
					}
				}
			}
		}
		
		System.out.println("La suma total de numeros dentro del intervalo es " + sumatotal);
		System.out.println("Cantidad de numeros fuera del intervalo es " + contator);
		
		if (check == 1) {
			System.out.println("Hemos introducido algún numero igual a los limites del intervalo.");
		}
	}

}
