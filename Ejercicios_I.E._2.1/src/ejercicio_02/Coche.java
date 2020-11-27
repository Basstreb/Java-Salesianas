package ejercicio_02;

import java.util.Scanner;

public class Coche {

	public static void main(String[] args) {
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner teclado = new Scanner(System.in);
		
//		Vehiculo coche1 = new Vehiculo("Mustang");
//		coche1.setPotencia(550);
//		coche1.setTraccion(false);
//		
//		Vehiculo coche2 = new Vehiculo("Ibiza");
//		coche2.setPotencia(80);
//		coche2.setTraccion(true);
		
		System.out.println("Indique el modelo del coche");
		Vehiculo coche3 = new Vehiculo(teclado.nextLine());
		
		System.out.println("Indique la cantidad de CV que tiene");
		coche3.setPotencia(teclado.nextDouble());
		
		System.out.println("Indique con un Si o un No si tiene traccion a las 4 Ruedas");
		String rueda;
		rueda = teclado.next();
		String traccion = null;
		
		if (rueda.equals("Si")) {
			traccion = "true";
		}
		else if (rueda.equals("No")) {
			traccion = "false";
		}
		
		boolean trac = Boolean.parseBoolean(traccion);
		
		coche3.setTraccion(trac);
		
//		coche1.imprimir();
//		coche2.imprimir();
		coche3.imprimir();
	}

}
