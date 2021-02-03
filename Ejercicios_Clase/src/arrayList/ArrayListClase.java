package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClase {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");
		lista.add("hoy?");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
		}
		
		System.out.println();
		
		Iterator<String> it = lista.iterator();
		
		while (it.hasNext()) {
			
			System.out.print(it.next() + " ");
			
		}
		
		System.out.println();
	
		for (String cadena : lista) {
			System.out.print(cadena + " ");
		}
		

	}

}
