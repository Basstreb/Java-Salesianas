package CensoUniversitario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public Main() {
	}
	private static String res, res2, dni, nombre, direccion, titulacion, asignaturas, departamento;
	//Tabla hash
	private static HashMap<String, Persona> personas = new HashMap<String, Persona>();
	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static int tfno, op;
	private static double sueldo;
	private static Fecha fecnac;
	private static Persona objper;
	private static Alumno alumno;
	private static Profesor profe;
	private static String clase;
	public static void main(String[] args) {

		while (true) {
			try {
				do {
					System.out.println("\n\n--- Operaciones del Censo Universitario ---");
					System.out.println(" 1 - Alta. ");
					System.out.println(" 2 - Baja. ");
					System.out.println(" 3 - Consulta. ");
					System.out.println(" 4 - Modificación. ");
					System.out.println(" 5 - Salir. ");
					System.out.println(" Seleccione la operación: (1,2,3,4,5): ");
					res = entrada.readLine();
				} while (!res.equals("1") && !res.equals("2") && !res.equals("3") && !res.equals("4") && !res.equals("5"));
				// alta
				if (res.equals("1")) {
					alta();
				} // baja
				else if (res.equals("2")) {
					baja();
				} // consulta
				else if (res.equals("3")) {
					consulta();
				} // modificación
				else if (res.equals("4")) {
					modifica();
				} //salir
				else if (res.equals("5")) {
					System.exit(0);
				}
			} catch (NumberFormatException nfe) {
				System.out.println("\nError de formato numérico: " + nfe.toString());
			} catch (FechaMal fm) {
				System.out.println("\nError en formato de fecha.");
			} catch (IOException ioe) {
				System.out.println("\nError de entrada/salida: " + ioe.toString());
			} catch (Exception e) {
				// Captura cualquier otra excepción
				System.out.println(e.toString());
			}
		}
	}
	// alta
	private static void alta() throws IOException, FechaMal {
		System.out.println("\n -- Alta -- ");
		System.out.println("Introduzca el DNI: ");
		dni = entrada.readLine();
		System.out.println("Introduzca nombre: ");
		nombre = entrada.readLine();
		System.out.println("Introduzca fecha de nacimiento (DD/MM/AAAA): ");
		fecnac = new Fecha(entrada.readLine());
		System.out.println("Introduzca dirección: ");
		direccion = entrada.readLine();
		System.out.println("Introduzca teléfono: ");
		tfno = Integer.parseInt(entrada.readLine());
		do {
			System.out.println("Introduzca categoría (1-alumno, 2-profesor): ");
			res = entrada.readLine();
		} while (!res.equals("1") && !res.equals("2"));
		if (res.equals("1")) {
			System.out.println("Introduzca titulación: ");
			titulacion = entrada.readLine();
			System.out.println("Introduzca asignaturas: ");
			asignaturas = entrada.readLine();
			//instanciamos un alumno
			alumno = new Alumno(dni, nombre, fecnac, direccion, tfno, titulacion, asignaturas);
			//introducimos en la tabla hash.
			personas.put(dni, alumno);
			System.out.println("\nAlumno dado de alta: " + alumno.toString());
		} else {
			System.out.println("Introduzca departamento: ");
			departamento = entrada.readLine();
			System.out.println("Introduzca sueldo: ");
			sueldo = Double.parseDouble(entrada.readLine());
			//instanciamos un profesor
			profe = new Profesor(dni, nombre, fecnac, direccion, tfno, departamento, sueldo);
			//introducimos en la tabla hash.
			personas.put(dni, profe);
			System.out.println("\nProfesor dado de alta: " + profe.toString());
		}
	}
	// baja
	private static void baja() throws IOException {
		System.out.println("\n -- Baja -- ");
		System.out.println("Introduzca el DNI de la persona a borrar: ");
		dni = entrada.readLine();
		//obtenemos la persona de la tabla hash.
		objper = personas.get(dni);
		if (objper != null) {
			personas.remove(dni);
			System.out.println("Persona borrada: " + objper.toString());
		} else {
			System.out.println(" Error: - Persona no encontrada - ");
		}
	}
	// consulta
	private static void consulta() throws IOException {
		System.out.println("\n -- Consulta -- ");
		System.out.println("Introduzca el DNI de la persona: ");
		dni = entrada.readLine();
		//obtenemos la persona de la tabla hash.
		objper = personas.get(dni);
		if (objper != null) {
			System.out.println("- Nombre: " + objper.getNombre());
			System.out.println("- Fecha de nacimiento: " + objper.getFechaNac().toString());
			System.out.println("- Dirección: " + objper.getDireccion());
			System.out.println("- Teléfono: " + objper.getTfno());
			//sacamos la categoría de la persona
			clase = objper.getClass().getName();
			if (clase.equals("censouni.Alumno")) {
				alumno = (CensoUniversitario.Alumno) objper;
				System.out.println("- Titulación: " + alumno.getTitulacion());
				System.out.println("- Asignaturas: " + alumno.getAsignaturas());
			} else {
				profe = (CensoUniversitario.Profesor) objper;
				System.out.println("- Departamento: " + profe.getDepartamento());
				System.out.println("- Sueldo: " + profe.getSueldo());
			}
		} else {
			System.out.println(" Error: - Persona no encontrada - ");
		}
	}
	// modifica
	private static void modifica() throws IOException, FechaMal {
		System.out.println("\n -- Modificación -- ");
		System.out.println("Introduzca el DNI de la persona: ");
		dni = entrada.readLine();
		//obtenemos la persona de la tabla hash.
		objper = personas.get(dni);
		if (objper != null) {
			System.out.println("Introduzca el dato a modificar (1-Nombre, 2-FecNac, 3-Dir,4-Tfno, 5-Otro): ");
			op = Integer.parseInt(entrada.readLine());
			switch (op) {
			case 1:
				System.out.println("Introduzca nuevo nombre: ");
				nombre = entrada.readLine();
				objper.setNombre(nombre);
				break;
			case 2:
				System.out.println("Introduzca nueva fecha de nacimiento: ");
				fecnac = new Fecha(entrada.readLine());
				objper.setFechaNac(fecnac);
				break;
			case 3:
				System.out.println("Introduzca nueva dirección: ");
				direccion = entrada.readLine();
				objper.setDireccion(direccion);
				break;
			case 4:
				System.out.println("Introduzca nuevo teléfono: ");
				tfno = Integer.parseInt(entrada.readLine());
				objper.setTfno(tfno);
				break;
			case 5: //sacamos la categoría de la persona
				clase = objper.getClass().getName();
				if (clase.equals("censouni.Alumno")) {
					alumno = (CensoUniversitario.Alumno) objper;
					System.out.println("Introduzca el dato a modificar (1-Titulación, 2-Asignaturas): ");
					res2 = entrada.readLine();
					if (res2.equals("1")) {
						System.out.println("Introduzca nueva titulación: ");
						titulacion = entrada.readLine();
						alumno.setTitulacion(titulacion);
					} else if (res2.equals("2")) {
						System.out.println("Introduzca nuevas asignaturas: ");
						asignaturas = entrada.readLine();
						alumno.setAsignaturas(asignaturas);
					}
				} else {
					profe = (CensoUniversitario.Profesor) objper;
					System.out.println("Introduzca el dato a modificar (1-Dpto, 2-Sueldo): ");
					res2 = entrada.readLine();
					if (res2.equals("1")) {
						System.out.println("Introduzca nuevo departamento: ");
						departamento = entrada.readLine();
						profe.setDepartamento(departamento);
					} else if (res2.equals("2")) {
						System.out.println("Introduzca nuevo sueldo: ");
						sueldo = Double.parseDouble(entrada.readLine());
						profe.setSueldo(sueldo);
					}
				}
				break;
			default:
				System.out.println("Opción incorrecta");
			}
			System.out.println("Persona modificada: " + objper.toString());
		} else {
			System.out.println(" Error: - Persona no encontrada - ");
		}
	}
}