package ejercicio_16;

import java.util.Scanner;

public class Personajes {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		
		Guerrero g = new Guerrero("Aragorn", 200, "Espada Larga");
		Mago m = new Mago("Gandalf","Fuego");

		System.out.println("Nuestro Guerrero se llama " + g.getNombre() + ", tiene una energia de " + g.getEnergia() + " y lleva una " + g.getArma());
		System.out.println("Elige la fuerza del ataque del Guerrero:");
		System.out.println(g.combatir(num.nextInt()));
		
		System.out.println("Te puedes tomar una pocion para recuperar energia, cuanta energia quieres recuperar?");
		g.alimentarse(num.nextInt());
		System.out.println("La energia actual de " + g.getNombre() + " es de "+ g.getEnergia());
		
		System.out.println("Nuestro Mago se llama " + m.getNombre() + ", tiene una energia de " + m.getEnergia() + " y su poder es de " + m.getPoder());
		System.out.println(m.getNombre() + " ha hecho un encantamiento. " + m.encantar());
		m.alimentarse(30);
		System.out.println(m.getNombre() + " se come un bocata y recupera energia hasta " + m.getEnergia());
	}
}
