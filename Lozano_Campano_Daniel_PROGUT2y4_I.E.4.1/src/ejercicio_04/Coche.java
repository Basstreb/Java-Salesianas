package ejercicio_04;

public class Coche extends Vehiculo {

	private int numPuertas;

	public Coche(String m, String co) {
		super(m, co, 4);
	}

	public Coche(String m, String co, int ci) {
		super(m, co, 4, ci);
	}

	public Coche(String m, String co, int ci, int po) {
		super(m, co, 4, ci, po);
	}

	public Coche(String m, String co, int ci, int po, int pu) {
		super(m, co, 4, ci, po);
		numPuertas = pu;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String muestraDatosCoche() {
		return "El coche tiene matricula " + getMatricula() + " el color es " + getColor() + " y tiene " + numPuertas
				+ " puertas";
	}
}
