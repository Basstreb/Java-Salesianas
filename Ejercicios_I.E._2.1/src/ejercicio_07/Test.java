package ejercicio_07;

public class Test {

	public static void main(String[] args) {
		
		Asignatura a1 = new Asignatura("Programacion", 9);
		Asignatura a2 = new Asignatura("FOL", 4);
		Asignatura a3 = new Asignatura("Sistemas Informaticos", 5);
		
		System.out.println(a1.calificacion());
		System.out.println(a2.calificacion());
		System.out.println(a3.calificacion() + "\n");
		System.out.println(a1.asignatura());
		System.out.println(a2.asignatura());
		System.out.println(a3.asignatura());

	}

}
