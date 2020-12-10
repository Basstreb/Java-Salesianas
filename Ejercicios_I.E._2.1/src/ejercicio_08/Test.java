package ejercicio_08;

public class Test {

	public static void main(String[] args) {

		/**
		 * Creamos dos arrays uno para los alumnos y otro para las asignaturas
		 */
		Alumno[] alumno = { new Alumno("Pedro", 24), new Alumno("Jorge", 19), new Alumno("Luis", 30) };
		Asignatura[] asignaturas = { new Asignatura("Programacion", 0), new Asignatura("Sistemas Informaticos", 0),
				new Asignatura("Entornos de Desarrollo", 0), new Asignatura("Lenguaje de Marcas", 0),
				new Asignatura("Base de Datos", 0), new Asignatura("Fol", 0) };

		//Ciclo for que chequea los alumnos y les asigna las asignaturas y un valor de notas aleatorio
		for (int i = 0; i < alumno.length; i++) {

			System.out.println(alumno[i].getNombre());
			System.out.println(alumno[i].getEdad());

			for (int j = 0; j < (asignaturas.length - 1); j++) {
				System.out.print(asignaturas[j].getNombreAsignatura() + ", ");
			}
			System.out.print(asignaturas[(asignaturas.length - 1)].getNombreAsignatura() + ".");

			System.out.println();

			for (int j = 0; j < asignaturas.length; j++) {

				alumno[i].setAsignatura(asignaturas[j]);
				alumno[i].getAsignatura().setNota((float) Math.floor(Math.random() * 11));

				System.out.println(alumno[i].getAsignatura().getNombreAsignatura());
				System.out.println(alumno[i].getAsignatura().getNota());
				System.out.println(alumno[i].getAsignatura().calificacion());
			}

			System.out.println("");
		}
	}

}
