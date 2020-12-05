package ejercicio_11;

public class Test {

	public static void main(String[] args) {
	
		Triangulo tri1 = new Triangulo(10, 15, 20);
		Triangulo tri2 = new Triangulo(10, 15, 20);
		Triangulo tri3 = new Triangulo(10, 10, 10);
		Triangulo tri4 = new Triangulo(10, 10, 20);
		
		Triangulo[] triangulos = new Triangulo[4];
		
		triangulos[0] = new Triangulo(10, 15, 20);
		triangulos[1] = new Triangulo(10, 15, 20);
		triangulos[2] = new Triangulo(10, 15, 20);
		triangulos[3] = new Triangulo(10, 15, 20);
		
		System.out.println(Triangulo.compareTo_Triangulos(tri1, tri2));
		System.out.println(Triangulo.compareTo_Triangulos(tri1, tri3));
		
		System.out.println(Triangulo.compareTo_VTriangulos(triangulos));
		
		System.out.println(tri1.tipo_Triangulo());
		System.out.println(tri3.tipo_Triangulo());
		System.out.println(tri4.tipo_Triangulo());
	}

}
