package Peaje;

class CabinaPeajeA
{
	//Atributos
	//total recaudado
	private int total;
	//cantidad de veh�culos que han pasado por esa cabina
	private int vehiculos;
	//M�todos
	public CabinaPeajeA() {
		total=0;
		vehiculos=0;
	}
	public void muestraDatos() {
		System.out.println("Totales desde la �ltima recogida - Peaje: "+total+"� Veh�culos: "+vehiculos);
	}
	public void recaudar() {
		System.out.println("**** Ejecutando recaudaci�n ****");
		muestraDatos();
		total=0;
		vehiculos=0;
	}
	public void calculaPeaje(VehiculoA va) {
		int peaje = va.peaje();
		System.out.println(va.toString()+" - Peaje: "+peaje+"�" );
		vehiculos++;
		total += peaje;
	}
}