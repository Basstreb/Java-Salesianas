package dam.modelos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	static Scanner sc;
	static ArrayList<Manager> listaRepresentantes;
	
	public static void main(String[] args) {
		listaRepresentantes = new ArrayList<>();
		sc = new Scanner(System.in);
		
		Discografia disco1 = new Discografia("Back in Black", 1980);
		Discografia disco2 = new Discografia("High Voltage", 1976);
		Discografia disco3 = new Discografia("Highway to Hell", 1979);
		Discografia disco4 = new Discografia("Iron Man 2", 2010);
		
		SortedSet<Discografia> acdc = new TreeSet<>();
		acdc.add(disco1);
		acdc.add(disco2);
		acdc.add(disco3);
		acdc.add(disco4);
		
		Grupo ACDC = new Grupo("ACDC", "Australia", acdc);
		
		Manager m1 = new Manager("Luis", 28, 1500, ACDC);
		
		listaRepresentantes.add(m1);
		
//		System.out.println(listaRepresentantes);
		
		for (int i = 0; i < listaRepresentantes.size(); i++) {
			Manager p = listaRepresentantes.get(i);
			System.out.printf("%d %s %s %n", i, p.getNombre(), p.getGrupo());
		}
	}
}
