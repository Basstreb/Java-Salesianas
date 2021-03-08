package Peaje;

class CamionA extends VehiculoA {
	private int ejes;

	public CamionA(String matricula, int pesoTotal, int ejes) {
		super(matricula, pesoTotal);
		this.ejes=ejes;
	}

	public int getEjes() { 
		return ejes; 
	}

	public String toString() {
		String s = super.toString();
		return s+" # Camión - Ejes: "+ejes;
	}

	public int peaje() {
		return 5*ejes + 2*(super.getPesoTotal()/1000);
	}
}