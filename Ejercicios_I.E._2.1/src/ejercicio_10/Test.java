package ejercicio_10;

public class Test {

	public static void main(String[] args) {
		
		//Creamos objeto almacen con kg de papas y chocos
		Almacen almacen = new Almacen(5, 3);
		
		//Llamamos metodos para ver cantidad de chocos y papas
		almacen.showChocos();
		almacen.showPapas();
		
		//Metodo para ver a cuantos comensales podriamos a atender
		System.out.println("Se puede atender a " + almacen.getComensales() + " comensales");
		
		//Aumentamos numero de papas
		almacen.addPapas(10);
		
		//Volvemos a comprobar a cuantos comensales podemos atender
		System.out.println("Se puede atender a " + almacen.getComensales() + " comensales");
	}

}
