package enumeraciones;

public class ContinentesClass {

	public static void main(String[] args) {

		// Utilizamos la enumeracion de paises
		System.out.println("Continente no. 4: " + Continentes.AMERICA);
		System.out.println("Paises en America: " + Continentes.AMERICA.getPaises());

		// Hacemos el test del numero de paises por continente
		System.out.println();
		indicarPaises(Continentes.AFRICA);
	}

	public static void indicarPaises(Continentes continentes) {

		switch (continentes) {
		case AFRICA:
			System.out.println("No. Paises en: " + continentes + ": " + continentes.getPaises());
			break;

		default:
			break;
		}

	}

}
