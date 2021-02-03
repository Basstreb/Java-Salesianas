package actividades_java;

public class Prueba {

	public static void main(String[] args) {

		int numero;
		
			do {
				numero = (int)(Math.random()*(75-25+1)+25);
			} while (numero != 25);
			
			System.out.println(numero);
	}

}
