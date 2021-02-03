package ejercicios_i.e;

import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		
		System.out.println("Indique hasta que número quiere ver cuales son centros numéricos");
		int n = nums.nextInt();
		
		int fsum = 0, ssum = 0, index = 1;
		
		while (index < n+1) {
			
			for (int i = 1; i <= index ; i++) {
				fsum += (i-1);
			}
			
			for (int i = (index+1); i <= (index*2); i++) {
				if (ssum != fsum) {
					ssum += i;
				}
			}
			
			if (ssum == fsum & index != 1) {
				System.out.println(index + " Es un centro numérico");
			}
			
			index++;
			fsum = 0;
			ssum = 0;
		}
		
	}

}
