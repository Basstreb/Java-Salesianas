package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_09 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		
		System.out.println("Escriba los numeros con los que quiera calcular o ponga dos 0 para salir");
		
		int num1;
		int num2;
		int comand;
		
		do{
			
			num1 = nums.nextInt();
			num2 = nums.nextInt();
			
			if (num1 != 0 & num2 != 0) {
				do {
					
					System.out.println("1.- Sumar los números");
					System.out.println("2.- REstar los números");
					System.out.println("3.- Multiplicar los números");
					System.out.println("4.- Dividir los números");
					System.out.println("5.- Salir del programa");
					
					comand = nums.nextInt();
					
					switch (comand) {
					case 1:
						int suma = num1 + num2;
						System.out.println("La suma es " + suma);
						break;
					case 2:
						int resta = num1 - num2;
						System.out.println("La resta es " + resta);
						break;
					case 3:
						int mult = num1 * num2;
						System.out.println("La multiplicacion es " + mult);
						break;
					case 4:
						while (num2 == 0) {
							num2 = nums.nextInt();
						}
						float div = num1/num2;
						System.out.println("La division es " + div);
						break;
					}
					
				} while (comand != 5);
			}
			
		}while(num1 != 0 & num2 != 0);
	}

}
