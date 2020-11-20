package ejercicio_class;

import java.util.Scanner;

public class Vehiculo {
	
	//Attributes
	private String modelo;
	private double potencia;
	private boolean cRueda;
	
	//Constructors
	Vehiculo(String modelo) {
		this.modelo = modelo;
	}
	
	Vehiculo() {
	}
	
	//Methods
	public String getModelo() {
		return modelo;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public boolean isCRueda() {
		return cRueda;
	}
	public void setTraccion(boolean traccion) {
		this.cRueda = traccion;
	}
	
	public void imprimir(){
		if (cRueda) {
			System.out.println("El modelo es "+ modelo +" la potencia es de "+ potencia + "CV y tiene traccion a las cuatro ruedas");
		}
		else {
			System.out.println("El modelo es "+ modelo +" la potencia es de "+ potencia + "CV y no tiene traccion a las cuatro ruedas");
		}
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner teclado = new Scanner(System.in);
		
		Vehiculo coche1 = new Vehiculo("Mustang");
		coche1.setPotencia(550);
		coche1.setTraccion(false);
		
		Vehiculo coche2 = new Vehiculo("Ibiza");
		coche2.setPotencia(80);
		coche2.setTraccion(true);
		
		System.out.println("Indique el modelo del coche");
		Vehiculo coche3 = new Vehiculo(teclado.nextLine());
		
		System.out.println("Indique la cantidad de CV que tiene");
		coche3.setPotencia(teclado.nextDouble());
		
		System.out.println("Indique con un Si o un No si tiene traccion a las 4 Ruedas");
		String rueda = teclado.nextLine();
		
//		if (rueda.equals("Si")) {
//			coche3.setTraccion(true);
//		}
//		else if (rueda.equals("No")) {
//			coche3.setTraccion(false);
//		}
		
		coche1.imprimir();
		coche2.imprimir();
		coche3.imprimir();
		
		
	}
}
