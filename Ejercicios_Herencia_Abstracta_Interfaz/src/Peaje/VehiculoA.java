package Peaje;

public abstract class VehiculoA
{
	//Atributos
	private String matricula;
	private int pesoTotal;
	//Cantidad de veh�culos que han pasado por el peaje
	private static int cantidad=0;
	//M�todos
	public VehiculoA(String matricula, int pesoTotal) {
		this.matricula=matricula;
		this.pesoTotal=pesoTotal;
		incrementaCantidad();
	}
	private static void incrementaCantidad() {
		cantidad++;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public int getPesoTotal() {
		return this.pesoTotal;
	}
	public static int getCantidad() {
		return VehiculoA.cantidad;
	}
	public static void borraCantidad() {
		VehiculoA.cantidad = 0;
	}
	public String toString() {
		return "Veh�culo con matr�cula: "+matricula +" Peso total: "+ pesoTotal;
	}
	public abstract int peaje();
}