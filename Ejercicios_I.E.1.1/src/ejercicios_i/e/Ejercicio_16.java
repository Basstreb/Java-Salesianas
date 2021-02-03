package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		
		int verdura, tomate, patata, cebolla, semitoma, semicebo, semirepo, semipata;
		int preciosemi = 0;
		
		do {
			
			System.out.println("Elija el tipo de verdura introduciendo el numero, o introduzca 0 para salir.");
			System.out.println("1.- Tomate");
			System.out.println("2.- Repollo");
			System.out.println("3.- Patata");
			System.out.println("4.- Cebolla");
			System.out.println("0.- Salir");
			
			verdura = nums.nextInt();
			
			switch (verdura) {
			case 1:
				System.out.println("Ha elegido Tomate. Especifique tipo:");
				System.out.println("1.- Pera.");
				System.out.println("2.- Ensalada.");
				tomate = nums.nextInt();
				
				switch (tomate) {
				case 1:
					System.out.println("Ha elegido tomate pera, introduzca cantidad de semillas:");
					semitoma = nums.nextInt();
					preciosemi = semitoma * 15;
					break;
				case 2:
					System.out.println("Ha elegido tomate ensalada, introduzca cantiadad de semillas:");
					semitoma = nums.nextInt();
					preciosemi = semitoma * 20;
					break;
				}
				break;
			case 2:
				System.out.println("Ha elegido Repollo, introduzca cantidad de semillas:");
				semirepo = nums.nextInt();
				preciosemi = semirepo * 10;
				break;
			case 3:
				System.out.println("Ha elegido Patata. Especifique el tipo:");
				System.out.println("1.- Criolla");
				System.out.println("2.- Pastusa");
				System.out.println("3.- Salentuna");
				patata = nums.nextInt();
				
				switch (patata) {
				case 1:
					System.out.println("Ha elegido patata criolla, introduzca cantidad de semillas:");
					semipata = nums.nextInt();
					preciosemi = semipata * 8;
					break;
				case 2:
					System.out.println("Ha elegido patata pastusa, introduzca cantidad de semillas:");
					semipata = nums.nextInt();
					preciosemi = semipata * 9;
					break;
				case 3:
					System.out.println("Ha elegido patata salentuna, introduzca cantidad de semillas:");
					semipata = nums.nextInt();
					preciosemi = semipata * 11;
					break;
				}
				break;
			case 4:
				System.out.println("Ha elegido Cebolla. Especifique tipo:");
				System.out.println("1.- Larga");
				System.out.println("2.- Vieja");
				cebolla = nums.nextInt();
				
				switch (cebolla) {
				case 1:
					System.out.println("Ha elegido cebolla larga, introduzca cantidad de semillas");
					semicebo = nums.nextInt();
					preciosemi = semicebo * 15;
					break;
				case 2:
					System.out.println("Ha elegido cebolla vieja, introduzca cantidad de semillas");
					semicebo = nums.nextInt();
					preciosemi = semicebo * 13;
					break;
				}
				break;
			}
			
			if (verdura != 0) {
				System.out.println("El precio de las semillas sera de " + preciosemi);
			}
			
		} while (verdura != 0);
	}

}
