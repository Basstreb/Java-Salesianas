package ejercicios_clase;

import java.util.Scanner;

public class Practica_clase {

	public static void main(String[] args) {
				
		@SuppressWarnings("resource")
		Scanner sRadio = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la circunferencia");
		
		int radio = sRadio.nextInt();
		
		double superficie = Math.PI * Math.pow(radio, 2);
		
		System.out.println(superficie);
		System.out.format("%.2f", superficie);
	}

}
