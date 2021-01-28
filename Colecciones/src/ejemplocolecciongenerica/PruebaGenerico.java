package ejemplocolecciongenerica;

public class PruebaGenerico {

	public static void main(String[] args) {
		
		Elemento<Double> e = new Elemento<>();
		Elemento<Integer> i = new Elemento<>();
		
		e.setDato(14.0);
		i.setDato(14);
		System.out.println("El dato es: " + e.getDato());
		System.out.println("El dato es: " + i.getDato());
	}

}
