package ejercicio_14;

public class Marte {

	public static void main(String[] args) {

		// Creamos los tres primeros marcianos
		Marciano et1 = new Marciano("Lucas");
		Marciano et2 = new Marciano("Paco");
		Marciano et3 = new Marciano("Pilar");

		// Matamos a uno de los creados
		et2.muere();

		// Creamos un cuarto marciano
		Marciano et4 = new Marciano("Pancho");

		// Intentamos matar a uno ya muerto
		et2.muere();

		// Checkea cuantos marcianos estan vivos
		Marciano.cuentaMarcianos();

		// Check de si el marciano esta vivo
		et1.estaVivo();
		et2.estaVivo();
		et3.estaVivo();
		et4.estaVivo();
	}

}
