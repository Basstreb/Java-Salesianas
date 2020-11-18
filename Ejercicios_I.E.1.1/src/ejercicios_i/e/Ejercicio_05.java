package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		
		int pos = 0;
		int contpos = 0;
		int neg = 0;
		int contneg = 0;
		int contnul = 0;
		float mediapos = 0;
		float medianeg = 0;
		
		System.out.println("Introduzca 10 numeros:");
		
		for (int i = 0; i < 10; i++) {
			
			int num = nums.nextInt();
			
			if (num>0) {
				pos += num;
				contpos++;
			}
			else {
				if (num<0) {
					neg += num;
					contneg++;
				}
				else {
					contnul++;
				}
			}
		}
		
		if (contpos != 0) {
			mediapos = pos/contpos;
		}
		
		if (contneg != 0) {
			medianeg = neg/contneg;
		}
		
		System.out.println("Media Números Positivos " + mediapos);
		System.out.println("Media Números Negativos " + medianeg);
		System.out.println("Números Nulos " + contnul);
	}

}
