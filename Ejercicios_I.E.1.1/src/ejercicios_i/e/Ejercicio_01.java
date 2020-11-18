package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner nota = new Scanner(System.in);
		float nota1;
		
		System.out.println("Por favor, introduzca las notas de las asignaturas.");
		
		System.out.println("Introduzca la nota de Programación:");
		nota1 = nota.nextFloat();
		
		System.out.println("Introduzca la nota de Lenguajes de Marcas:");
		float nota2 = nota.nextFloat();
		
		System.out.println("Introduzca la nota de Bases de Datos:");
		float nota3 = nota.nextFloat();
		
		System.out.println("Introduzca la nota de Entornos de Desarrollo:");
		float nota4 = nota.nextFloat();
		
		System.out.println("Introduzca la nota de Sistemas Informáticos:");
		float nota5 = nota.nextFloat();
		
		System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral:");
		float nota6 = nota.nextFloat();
		
		
		float notam = (nota1+nota2+nota3+nota4+nota5+nota6)/6;
		System.out.format("Su nota media del curso es de: " + "%.2f",notam);

	}

}
