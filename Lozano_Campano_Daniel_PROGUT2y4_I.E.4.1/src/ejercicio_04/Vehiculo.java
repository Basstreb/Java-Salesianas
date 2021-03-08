package ejercicio_04;

public class Vehiculo {

	private String matricula;
	private String color;
	private int nRuedas;
	private int cilindrada;
	private int potencia;
	
	public Vehiculo(String m, String co, int r) {
		matricula = m;
		color = co;
		nRuedas = r;
	}
	
	public Vehiculo(String m, String co, int r, int ci) {
		this(m, co, r);
		cilindrada = ci;
	}
	
	public Vehiculo(String m, String co, int r, int ci, int po) {
		this(m, co, r, ci);
		potencia = po;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getColor() {
		return color;
	}

	public int getnRuedas() {
		return nRuedas;
	}
	
}
