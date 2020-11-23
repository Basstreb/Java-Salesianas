package ejercicios_clase;

/**
 * 
 * @author Dani
 *
 */

public class Estaticos {

	/**
	 * @param args
	 */
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Bicicleta bici1 = new Bicicleta(21, 27, 0);
		Bicicleta bici2 = new Bicicleta(18, 24, 0);
		
		System.out.println(bici1);		
		System.out.println(bici2);
		
		//bici1.getNumeroDeBicicletas();
		System.out.println(bici1.getNumeroDeBicicletas());
	}
}
