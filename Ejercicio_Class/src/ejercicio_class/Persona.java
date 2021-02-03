package ejercicio_class;

import java.util.Scanner;

public class Persona {
	
	//Attributes
	private String nombre;
	private String apellidos;
	private String nif;
	
	//Constructors
	Persona(){
		
	}
	
	Persona(String nombre, String apellidos, String nif){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
	}
	
	
	//Methods
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public void habla() {
		System.out.println("Hola mi nombre es " + getNombre() + " y mis apellidos son " + getApellidos() + " y mi DNI es " + getNif());
	}
	
	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		Scanner teclado = new Scanner(System.in);
//		
//		Persona p = new Persona();
//		
//		p.setNombre(teclado.nextLine());
//		p.setApellidos(teclado.nextLine());
//		p.setNif(teclado.nextLine());
//		
//		Persona p1 = new Persona("Daniel", "Lozano Campano", "77847769Z");
//		
//		p.habla();
//		p1.habla();
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		Persona[] personas = new Persona[1];
		
		for (int i = 0; i < personas.length; i++) {
			
			personas[i] = new Persona();
			System.out.println("Introduzca su nombre");
			personas[i].setNombre(teclado.nextLine());
			
			System.out.println("Introduzca sus apellidos");
			personas[i].setApellidos(teclado.nextLine());
			
			System.out.println("Indique su DNI");
			personas[i].setNif(teclado.nextLine());
		}
		
		for (Persona persona : personas) {
			persona.habla();
		}
	}
}
