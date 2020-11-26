package paquete1;

public class Envoltorio {

	private Numero n;

	public Envoltorio(Numero n) {
		n.setValor(0);
	}

	public Numero getNumero() {
		return n;
	}

	public static void main(String[] args) {
		Numero n = new Numero(3);
		Envoltorio e = new Envoltorio(n);
		System.out.println(n.getValor());
		System.out.println(e.getNumero().getValor());
	}

}
