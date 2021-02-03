package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		
		System.out.println("Inserte día de salida de tren");
		int dia1 = nums.nextInt();
		System.out.println("Insterte hora de salida del tren (Formato 24H)");
		int hora1 = nums.nextInt();
		System.out.println("Insterte minuto de salida del tren");
		int min1 = nums.nextInt();
		
		System.out.println("Inserte día de llegada del tren");
		int dia2 = nums.nextInt();
		System.out.println("Inserte hora de llegada del tren (Formato 24H)");
		int hora2 = nums.nextInt();
		System.out.println("Inserte minuto de llegada del tren");
		int min2 = nums.nextInt();
		
		int diastotal;
		int horastotal;
		int mintotal;
		
		if (dia1 <= dia2) {
			diastotal = dia2 - dia1;
		}
		else {
			diastotal = (30 - dia1) + dia2;
		}
		
		if (hora1 <= hora2) {
			horastotal = hora2 - hora1;
		}
		else {
			horastotal = (24-hora1) + hora2;
		}
		
		if (min1 <= min2) {
			mintotal = min2 - min1;
		}
		else {
			mintotal = (60 - min1) + min2;
		}
		
		horastotal += diastotal*24;
		
		System.out.println("El tren llegara en " + horastotal + " horas " + mintotal + " minutos.");
	}

}
