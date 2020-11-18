package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		
		System.out.println("Introduzca un numero para averiguar los multiplos de 3 hasta este.");
		
		int num = nums.nextInt();
		
		int contador = 0;
		
		while (num <= 0) {
			System.out.println("El numero debe ser mayor que 0, por favor intentelo de nuevo");
			num = nums.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			if (i%3 == 0) {
				System.out.println(i);
				contador++;
			}
		}
		
		System.out.println("Numero total de numeros mostrados: " + contador);
		
	}

}
