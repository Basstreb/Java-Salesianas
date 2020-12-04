package ejercicio_10;

public class Test {

	public static void main(String[] args) {
		
		Almacen almacen = new Almacen(5, 3);
		
		almacen.showChocos();
		almacen.showPapas();
		
		System.out.println("Se puede atender a " + almacen.getComensales() + " comensales");
		
		almacen.addPapas(10);
		
		System.out.println("Se puede atender a " + almacen.getComensales() + " comensales");
	}

}
