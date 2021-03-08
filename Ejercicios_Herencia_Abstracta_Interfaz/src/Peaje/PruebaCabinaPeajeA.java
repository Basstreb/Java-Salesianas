/* El organismo encargado de las autopistas de un determinado país está
instalando un sistema de cobro de peajes en una de sus carreteras más
importantes.
– Se debe cobrar peaje a dos tipos distintos de vehículos, los camiones y los
autobuses de la siguiente forma:
• Los camiones que llegan a una cabina de peaje deben pagar 5€ por eje y 2€ por
cada tonelada de peso y los autobuses deben pagar 1€ por pasajero y 5€ por cada
tonelada de peso.
– Una pantalla en la cabina de peaje muestra la cantidad del total de recibos
cobrados y la cantidad de vehículos que han pagado desde la última
recaudación.
– Cada vez que se realice un peaje debe mostrar su importe así como la matrícula
del vehículo y su peso para cualquier tipo de vehículo. Si se trata de un camión
debe mostrar además de esa información el número de ejes y si se trata de un
autobús el número de pasajeros.
– También se quiere saber cuantos vehículos han pagado peaje en el total de
cabinas.
*/

package Peaje;

public class PruebaCabinaPeajeA
{
	public static void main(String args[])
	{
		//Crea las cabinas
		CabinaPeajeA cabina1 = new CabinaPeajeA();
		CabinaPeajeA cabina2 = new CabinaPeajeA();
		//Crea distintos vehículos
		VehiculoA v1 = new CamionA("1234-BCD",10000,3);
		VehiculoA v2 = new CamionA("2345-CDF",15500,4);
		VehiculoA v3 = new AutobusA("5678-CFG",7000,35);
		VehiculoA v4 = new AutobusA("6789-DTD",8000,50);
		//Cobra peajes
		cabina1.calculaPeaje(v1);
		cabina1.calculaPeaje(v3);
		cabina1.muestraDatos();
		cabina2.calculaPeaje(v2);
		cabina2.calculaPeaje(v4);
		cabina2.muestraDatos();
		//Recauda
		cabina1.recaudar();
		cabina1.muestraDatos();
		cabina2.recaudar();
		cabina2.muestraDatos();
		System.out.println("Total vehículos de todas las cabinas: "+VehiculoA.getCantidad());
		VehiculoA.borraCantidad();
	}
}