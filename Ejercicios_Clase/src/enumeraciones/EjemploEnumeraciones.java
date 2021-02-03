package enumeraciones;

public class EjemploEnumeraciones {

	public static void main(String[] args) {

		System.out.println("Valor 1: " + Dias.LUNES);
		
		indicarDia(Dias.LUNES);
	}

	public static void indicarDia(Dias dias) {
		switch (dias) {
		case LUNES:
			System.out.println("Primer día de la semana");
			break;
		default:
			break;
		}
	}

}
