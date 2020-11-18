package ejercicios_i.e;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Intente adivinar el numero que ha pensado el ordenador");
		
		int num = nums.nextInt();
		int azar = r.nextInt(100)+1;
		int cont = 0;
		
		while (num != azar) {
			
			if (num>azar) {
				System.out.println("El numero es menor que el introducido");
				num = nums.nextInt();
			}
			else {
				System.out.println("El numero es mayor que el introducido");
				num = nums.nextInt();
			}
			
			cont++;
		}
		
		System.out.println("Acertaste el número!!");
		System.out.println("El número de intentos hasta acertar ha sido " + cont);
	}

}
