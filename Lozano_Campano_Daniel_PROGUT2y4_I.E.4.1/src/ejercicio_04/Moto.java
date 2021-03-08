package ejercicio_04;

public class Moto extends Vehiculo{

	private int numPlazas;
	
	public Moto(String m, String co) {
		super(m, co, 2);
	}
	
	public Moto(String m, String co, int ci) {
		super(m, co, 2, ci);
	}
	
	public Moto(String m, String co, int ci, int po) {
		super(m, co, 2, ci, po);
	}
	
	public Moto(String m, String co, int ci, int po, int pl) {
		super(m, co, 2, ci, po);
		numPlazas = pl;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	public String muestraDatosMoto() {
		
		if (numPlazas == 1) {
			return "La moto tiene matricula " + getMatricula() + " el color es " + getColor() + " y tiene " + numPlazas
					+ " plaza";
		}else {
			return "La moto tiene matricula " + getMatricula() + " el color es " + getColor() + " y tiene " + numPlazas
					+ " plazas";
		}
	}
}
