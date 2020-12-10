package ejercicio_13;

public class Test {

	public static void main(String[] args) {
		
		Alimento lomoCerdo = new Alimento("lomo de Cerdo", 19, 63, 95, true, 'A', 'B');
		Alimento solomillo = new Alimento("solomillo", 70, 84, 93, true, 'M', 'A');
		Alimento entrecote = new Alimento("entrecote", 95, 49, 89, true, 'B', 'M');
		
		Alimento guisantes = new Alimento("guisantes", 2, 15, 4, false, 'A', 'B');
		Alimento esparragos = new Alimento("esparragos", 5, 20, 6, false, 'M', 'A');
		Alimento lechuga = new Alimento("lechuga", 8, 18, 7, false, 'B', 'M');
		
		
		System.out.println(lomoCerdo.esDietetico());
		System.out.println(lomoCerdo.muestraAlimento());
		System.out.println(solomillo.esDietetico());
		System.out.println(solomillo.muestraAlimento());
		System.out.println(entrecote.esDietetico());
		System.out.println(entrecote.muestraAlimento());
		
		System.out.println(guisantes.esDietetico());
		System.out.println(guisantes.muestraAlimento());
		System.out.println(esparragos.esDietetico());
		System.out.println(esparragos.muestraAlimento());
		System.out.println(lechuga.esDietetico());
		System.out.println(lechuga.muestraAlimento());

	}

}
