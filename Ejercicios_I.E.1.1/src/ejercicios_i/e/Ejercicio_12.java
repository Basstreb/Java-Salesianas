package ejercicios_i.e;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		System.out.println("¿Cuantas veces quieres tirar el dado?");
		@SuppressWarnings("resource")
		Scanner nums = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("###.##");
		Random r = new Random();
		
	int lado1 = 0;
	int lado2 = 0;
	int lado3 = 0;
	int lado4 = 0;
	int lado5 = 0;
	int lado6 = 0;
	int tirada = 0;
	double porcent1,porcent2,porcent3,porcent4,porcent5,porcent6;
	double num = nums.nextInt();
	
	do {
		int dado = r.nextInt(6)+1;
		
		switch (dado) {
		case 1:
			lado1 ++;
			break;
		case 2:
			lado2 ++;
			break;
		case 3:
			lado3 ++;
			break;
		case 4:
			lado4 ++;
			break;
		case 5:
			lado5 ++;
			break;
		case 6:
			lado6 ++;
			break;
		default:
			break;
		}
		tirada += 1;
		
	} while (tirada != num);
	
	porcent1 = (lado1/num)*100;
	porcent2 = (lado2/num)*100;
	porcent3 = (lado3/num)*100;
	porcent4 = (lado4/num)*100;
	porcent5 = (lado5/num)*100;
	porcent6 = (lado6/num)*100;
	
	System.out.println("Veces que sale la cara 1 " + formato.format(porcent1) + "%");
	System.out.println("Veces que sale la cara 2 " + formato.format(porcent2) + "%");
	System.out.println("Veces que sale la cara 3 " + formato.format(porcent3) + "%");
	System.out.println("Veces que sale la cara 4 " + formato.format(porcent4) + "%");
	System.out.println("Veces que sale la cara 5 " + formato.format(porcent5) + "%");
	System.out.println("Veces que sale la cara 6 " + formato.format(porcent6) + "%");
	}

}
