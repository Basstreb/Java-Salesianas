package Peaje;

class AutobusA extends VehiculoA {
	private int pasajeros;
	public AutobusA(String matricula, int pesoTotal, int pasajeros) {
		super(matricula, pesoTotal);
		this.pasajeros=pasajeros;
	}
	public int getPasajeros() { 
		return pasajeros; 
	}
	public String toString() {
		String s = super.toString();
		return s+" # Autobús - Pasajeros: "+pasajeros;
	}
	public int peaje() {
		return 1*pasajeros + 5*(super.getPesoTotal()/1000);
	}
}