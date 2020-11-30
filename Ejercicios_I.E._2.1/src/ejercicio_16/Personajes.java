package ejercicio_16;

import java.util.Scanner;

public class Personajes {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);

		Guerrero guerrero = new Guerrero("Aragorn", 200, "Espada Larga");
		Mago mago = new Mago("Gandalf", "Bola de Fuego");

		System.out.println("Nuestro Guerrero se llama " + guerrero.getNombre() + ", tiene una energia de "
				+ guerrero.getEnergia() + " y lleva una " + guerrero.getArma());
		System.out.println("Elige la fuerza del ataque del Guerrero:");
		System.out.println(guerrero.combatir(num.nextInt()));

		System.out.println("Te puedes tomar una pocion para recuperar energia, cuanta energia quieres recuperar?");
		guerrero.alimentarse(num.nextInt());
		System.out.println("La energia actual de " + guerrero.getNombre() + " es de " + guerrero.getEnergia());

		System.out.println("Nuestro Mago se llama " + mago.getNombre() + ", tiene una energia de " + mago.getEnergia()
				+ " y su poder es de " + mago.getPoder());
		System.out.println(mago.getNombre() + " ha hecho un encantamiento. " + mago.encantar());
		mago.alimentarse(30);
		System.out.println(mago.getNombre() + " se come un bocata y recupera energia hasta " + mago.getEnergia());
	}
}
