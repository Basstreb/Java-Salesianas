package ejercicios_i.e;

import java.util.Scanner;


public class Ejercicio_04 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el resultado ed lanzar un dado");
		@SuppressWarnings("resource")
		Scanner dado = new Scanner(System.in);
		
		int cara = dado.nextInt();
		
		switch (cara) {
		case 1:
			System.out.println("El lado contrario es: 6");
			break;
		case 2:
			System.out.println("El lado contrario es: 5");
			break;
		case 3:
			System.out.println("El lado contrario es: 4");
			break;
		case 4:
			System.out.println("El lado contrario es: 3");
			break;
		case 5:
			System.out.println("El lado contrario es: 2");
			break;
		case 6:
			System.out.println("El lado contrario es: 1");
			break;
		default:
			System.out.println("ERROR: número incorrecto");
			break;
		}
	}

}
