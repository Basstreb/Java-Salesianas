package asociacion;

public class Motor {

	// Attributes
	private int aceite;
	private int CV = 0;

	// Constructors
	Motor(int c) {
		CV = c;
		aceite = 0;
	}

	// Getters
	public int getAceite() {
		return aceite;
	}

	public int getCV() {
		return CV;
	}

	// Setter
	public void setAceite(int aceite) {
		this.aceite = aceite;
	}

}
