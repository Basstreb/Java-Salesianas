package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		
		System.out.println("Introduzca suelo fijo:");
		float sueldofijo1 = nums.nextFloat();
		System.out.println("Introduzca Importe Ventas:");
		float ventas = nums.nextFloat();
		System.out.println("Kilometros que recorre:");
		int km = nums.nextInt();
		System.out.println("Cuantos días se ha desplazado:");
		int dieta = nums.nextInt();
		
		float irpf = (sueldofijo1*18)/100;
		
		int ss = 150;
		
		float sueldofijo = sueldofijo1 - irpf;
		
		float comision = (ventas*5)/100;
		int dietatotal = dieta * 60;
		
		float sueldobruto = sueldofijo + comision + km + dietatotal;
		float sueldoliquido = sueldobruto - ss;
		
		System.out.println("El sueldo liquido será de " + sueldoliquido);
	}

}
