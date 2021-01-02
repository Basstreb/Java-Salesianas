package ejercicio_24;

public class Ejercicio_24 {

	public static void main(String[] args) {

		String cadenaString = "Esta es la cadena de prueba para contar cuantas vocales habria dentro de esta";
		String cadenaString2 = "Una segunda cadena para comprobar";
		int contVocal = 0;
		int contVocal2 = 0;

		cadenaString = cadenaString.toLowerCase();
		cadenaString2 = cadenaString2.toLowerCase();

		for (int i = 0; i < cadenaString.length(); i++) {
			char vocal = cadenaString.charAt(i);
			if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u')
				contVocal++;
		}

		for (int i = 0; i < cadenaString2.length(); i++) {
			char vocal = cadenaString2.charAt(i);
			if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u')
				contVocal2++;
		}

		System.out.println("En la primera cadena hay un total de " + contVocal + " vocales");
		System.out.println("En la segunda cadena hay un total de " + contVocal2 + " vocales");

	}

}
