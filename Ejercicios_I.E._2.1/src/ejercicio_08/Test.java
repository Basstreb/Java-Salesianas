package ejercicio_08;

public class Test {

	public static void main(String[] args) {
		
		Alumno[] alumno = new Alumno [3];
		Asignatura[] asignaturas = new Asignatura[6];

		alumno[0] = new Alumno("Pedro", 24);
		alumno[1] = new Alumno("Jorge", 19);
		alumno[2] = new Alumno("Luis", 30);
		
		asignaturas[0] = new Asignatura("Programacion", 0);
		asignaturas[1] = new Asignatura("Sistemas Informaticos", 0);
		asignaturas[2] = new Asignatura("Entornos de Desarrollo", 0);
		asignaturas[3] = new Asignatura("Lenguaje de Marcas", 0);
		asignaturas[4] = new Asignatura("Base de Datos", 0);
		asignaturas[5] = new Asignatura("Fol", 0);
		
		
		
		for (int i = 0; i < alumno.length; i++) {
			
			System.out.println(alumno[i].getNombre());
			System.out.println(alumno[i].getEdad());
			
			for (int j = 0; j < asignaturas.length; j++) {
				System.out.print(asignaturas[j].getNombreAsignatura() + ", ");
			}
			
			System.out.println();
			
			for (int j = 0; j < asignaturas.length; j++) {
				
				alumno[i].setAsignatura(asignaturas[j]);
				alumno[i].getAsignatura().setNota((float)Math.random() * (10 + 0 + 1) + 0);
				
				System.out.println(alumno[i].getAsignatura().getNombreAsignatura());
				System.out.println(alumno[i].getAsignatura().getNota());
				System.out.println(alumno[i].getAsignatura().calificacion());
			}
			
			System.out.println("");
		}
	}

}
