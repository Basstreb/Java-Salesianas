package ejercicio_20;

import java.util.Arrays;

public class ParesImpares {

	public static void main(String[] args) {

		int[] numero = new int[100];
		int [] pares;
		int [] impares;
		int contpar = 0;
		int contimpar = 0;
		
		Arrays.parallelSetAll(numero, i -> (int) (Math.random() * ((1001 - 1) + 1)));
		Arrays.parallelSort(numero);
		System.out.println(java.util.Arrays.toString(numero));
		
		for (int i = 0; i < numero.length; i++) {
			if (numero[i]%2 == 0) {
				contpar++;
			}else {
				contimpar++;
			}
		}
		
		pares = new int[contpar] ;
		impares = new int[contimpar] ;
		int j = 0;
		int k = 0;
		
		
		for (int i = 0; i < numero.length; i++) {
			
			if (numero[i] % 2 == 0) {
				pares[j++] = numero[i];
			}else {
				impares[k++] = numero[i];
			}
			
		}
		
		System.out.println(java.util.Arrays.toString(pares));
		System.out.println(java.util.Arrays.toString(impares));
		
	}
}
