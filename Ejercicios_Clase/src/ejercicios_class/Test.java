package ejercicios_class;

public class Test {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.modificarNombre("Daniel");
		p.modificarGenero('H');
		p.modificarOcupacion("Estudiante");

		System.out.println("El nombre es: " + p.obtenerNombre());
		System.out.println("El genero es: " + p.obtenerGenero());
		System.out.println("La ocupación es: " + p.obtenerOcupacion());
	}

}
