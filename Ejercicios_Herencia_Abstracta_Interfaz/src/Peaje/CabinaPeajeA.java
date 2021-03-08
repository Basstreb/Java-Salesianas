package Peaje;

class CabinaPeajeA
{
	//Atributos
	//total recaudado
	private int total;
	//cantidad de vehículos que han pasado por esa cabina
	private int vehiculos;
	//Métodos
	public CabinaPeajeA() {
		total=0;
		vehiculos=0;
	}
	public void muestraDatos() {
		System.out.println("Totales desde la última recogida - Peaje: "+total+"€ Vehículos: "+vehiculos);
	}
	public void recaudar() {
		System.out.println("**** Ejecutando recaudación ****");
		muestraDatos();
		total=0;
		vehiculos=0;
	}
	public void calculaPeaje(VehiculoA va) {
		int peaje = va.peaje();
		System.out.println(va.toString()+" - Peaje: "+peaje+"€" );
		vehiculos++;
		total += peaje;
	}
}