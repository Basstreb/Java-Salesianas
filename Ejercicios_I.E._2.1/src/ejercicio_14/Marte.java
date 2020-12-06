package ejercicio_14;

public class Marte {

	public static void main(String[] args) {
			
		Marciano et1 = new Marciano("Lucas");
		Marciano et2 = new Marciano("Paco");
		Marciano et3 = new Marciano("Pilar");
		
		et2.muere();
		
		Marciano et4 = new Marciano("Pancho");
		
		et2.muere();
		
		Marciano.cuentaMarcianos();
		
		et1.estaVivo();
		et2.estaVivo();
		et3.estaVivo();
		et4.estaVivo();
	}

}
