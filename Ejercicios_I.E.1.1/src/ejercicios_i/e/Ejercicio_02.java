package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner numA = new Scanner(System.in);
		
		System.out.println("Introduzca un numero.");
		int numi = numA.nextInt();
		numi = Math.abs(numi);
		
		String num = Integer.toString(numi);
		
		for (int i = 0; i < num.length(); i++) {
			System.out.println("El numero " + (i+1) + " es " + num.charAt(i));
		}
	}

}
