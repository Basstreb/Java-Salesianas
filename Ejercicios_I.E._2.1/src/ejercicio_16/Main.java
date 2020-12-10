package ejercicio_16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		
		//Creamos al guerrero y al mago
		Guerrero guerrero = new Guerrero("Aragorn", 200, "Espada Larga");
		Mago mago = new Mago("Gandalf", "Bola de Fuego");

		//Testeamos los metodos de la clase guerrero
		System.out.println("Nuestro Guerrero se llama " + guerrero.getNombre() + ", tiene una energia de "
				+ guerrero.getEnergia() + " y lleva una " + guerrero.getArma());
		System.out.println("Elige la fuerza del ataque del Guerrero:");
		System.out.println(guerrero.combatir(num.nextInt()));

		//Testeamos metodos secundarios del guerrero
		System.out.println("Te puedes tomar una pocion para recuperar energia, cuanta energia quieres recuperar?");
		guerrero.alimentarse(num.nextInt());
		System.out.println("La energia actual de " + guerrero.getNombre() + " es de " + guerrero.getEnergia());

		//Testeamos metodos del mago
		System.out.println("Nuestro Mago se llama " + mago.getNombre() + ", tiene una energia de " + mago.getEnergia()
				+ " y su poder es de " + mago.getPoder());
		System.out.println(mago.getNombre() + " ha hecho un encantamiento. " + mago.encantar());
		mago.alimentarse(30);
		System.out.println(mago.getNombre() + " se come un bocata y recupera energia hasta " + mago.getEnergia());
	}
}
