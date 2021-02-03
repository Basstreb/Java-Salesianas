package ejercicios_i.e;

public class Ejercicio_08 {

	public static void main(String[] args) {
		
		int numpar = 0;
		int numimpar = 0;
		
		for (int i = 0; i < 101; i += 2) {
			numpar += i;
		}
		
		for (int i = 1; i < 101; i += 2) {
			numimpar += i;
		}
		
		System.out.println("La suma de los numeros pares del 1 al 100 es " + numpar);
		System.out.println("La suma de los numeros impares del 1 al 100 es " + numimpar);
		
	}

}
