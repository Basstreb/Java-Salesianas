/* El organismo encargado de las autopistas de un determinado pa�s est�
instalando un sistema de cobro de peajes en una de sus carreteras m�s
importantes.
� Se debe cobrar peaje a dos tipos distintos de veh�culos, los camiones y los
autobuses de la siguiente forma:
� Los camiones que llegan a una cabina de peaje deben pagar 5� por eje y 2� por
cada tonelada de peso y los autobuses deben pagar 1� por pasajero y 5� por cada
tonelada de peso.
� Una pantalla en la cabina de peaje muestra la cantidad del total de recibos
cobrados y la cantidad de veh�culos que han pagado desde la �ltima
recaudaci�n.
� Cada vez que se realice un peaje debe mostrar su importe as� como la matr�cula
del veh�culo y su peso para cualquier tipo de veh�culo. Si se trata de un cami�n
debe mostrar adem�s de esa informaci�n el n�mero de ejes y si se trata de un
autob�s el n�mero de pasajeros.
� Tambi�n se quiere saber cuantos veh�culos han pagado peaje en el total de
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
		//Crea distintos veh�culos
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
		System.out.println("Total veh�culos de todas las cabinas: "+VehiculoA.getCantidad());
		VehiculoA.borraCantidad();
	}
}