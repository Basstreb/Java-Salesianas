package dam.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc;
	static ArrayList<Manager> listaRepresentantes;
	static ArrayList<CD> acdc;
	static ArrayList<CD> redhot;
	static ArrayList<CD> system;
	static Grupo ACDC;
	static Grupo redHot;
	static Grupo SystemofDown;
	static Manager m1;
	static Manager m2;
	static Manager m3;

	public static void main(String[] args) {
		listaRepresentantes = new ArrayList<>();
		sc = new Scanner(System.in);

		inicializar();
		inicializarGrupo();
		inicializarManager();
		menu();

		int opcion, id;

		do {
			opcion = menu();
			switch (opcion) {
			case 1: // Crear un Representante.
				crearRepresentante();
				break;
//			case 2:// Crear un CD para un grupo.
//				CrearTrabajador(2);
//				break;
//			case 3:// Crear un Trabajador de Tipo 3.
//				CrearTrabajador(3);
//				break;
//			case 4: //Eliminar representante
//				System.out.println("=====================================================================");
//				id = LecturaTeclado("Introduce identificador a consultar: ", 1, 999);
//				if (trat.ConsultarTrabajador(id) == null) {
//					System.out.println("NO EXISTE EL TRABAJADOR CON ESE IDENTIFICADOR");
//				} else {
//					System.out.println(trat.ConsultarTrabajador(id));
//				}
//				break;
//			case 4: //Eliminar representante
//				System.out.println("=====================================================================");
//				id = LecturaTeclado("Introduce identificador a eliminar: ", 1, 999);
//				if (listaRepresentantes.EliminarTrabajador(id)) {
//					System.out.println("EL TRABAJADOR [" + id + "] HA SIDO ELIMINADO");
//				} else {
//					System.out.println("EL TRABAJADOR [" + id + "] NO EXISTE");
//				}
//				break;
//			case 6: // numero trabajadores 1
//				System.out.println("=====================================================================");
//				int total = trat.numeroTrabajadores(1) + trat.numeroTrabajadores(2) + trat.numeroTrabajadores(3);
//				System.out.println("Número de Trabajadores Tipo1: " + trat.numeroTrabajadores(1));
//				System.out.println("Número de Trabajadores Tipo2: " + trat.numeroTrabajadores(2));
//				System.out.println("Número de Trabajadores Tipo3: " + trat.numeroTrabajadores(3));
//				System.out.println("Total de Trabajadores: " + total);
//				break;
//			case 7: // listado tipo 3
//				System.out.println("=====================================================================");
//				Object[] l1 = trat.ListaTrabajadores(1);
//				ListadoTrabajadores(1, l1);
//				Object[] l2 = trat.ListaTrabajadores(2);
//				ListadoTrabajadores(2, l2);
//				Object[] l3 = trat.ListaTrabajadores(3);
//				ListadoTrabajadores(3, l3);
//				break;
//			case 8:
//				break;
			}
		} while (opcion != 8);

//		for (int i = 0; i < listaRepresentantes.size(); i++) {
//			System.out.println(listaRepresentantes.get(i));
//		}	
	}

	private static int menu() {
		int opcion;
		System.out.println("=====================================================================");
		System.out.println(" 1. Crear un Representante.");
		System.out.println(" 2. Crear un CD de un Grupo.");
		System.out.println(" 3. Consultar un Representante.");
		System.out.println(" 4. Eliminar un Representante.");
		System.out.println(" 5. Mostrar Numero de Representantes.");
		System.out.println(" 6. Mostrar Todos los Representanes. ");
		System.out.println(" 7. Salir de la aplicación.");
		System.out.println("=====================================================================");
		opcion = LecturaTeclado("Introduce opción(1 a 7): ", 1, 7);
		return opcion;

	}//

	private static void inicializar() {
		CD disco1 = new CD("Back in Black", 1980);
		CD disco2 = new CD("High Voltage", 1976);
		CD disco3 = new CD("Highway to Hell", 1979);
		CD disco4 = new CD("Iron Man 2", 2010);

		CD disco11 = new CD("Californication", 1999);
		CD disco12 = new CD("By the Way", 2002);
		CD disco13 = new CD("Blood Sugar Sex Magik", 1991);
		CD disco14 = new CD("Stadium Arcadium", 2006);

		CD disco21 = new CD("Toxicity", 2005);
		CD disco22 = new CD("Hypnotize", 2001);
		CD disco23 = new CD("System of a Down", 1998);
		CD disco24 = new CD("Mezmerize", 2005);

		acdc = new ArrayList<>();
		acdc.add(disco1);
		acdc.add(disco2);
		acdc.add(disco3);
		acdc.add(disco4);

		redhot = new ArrayList<>();
		redhot.add(disco11);
		redhot.add(disco12);
		redhot.add(disco13);
		redhot.add(disco14);

		system = new ArrayList<>();
		system.add(disco21);
		system.add(disco22);
		system.add(disco23);
		system.add(disco24);

		Collections.sort(acdc);
		Collections.sort(redhot);
		Collections.sort(system);
	}

	private static void inicializarGrupo() {
		ACDC = new Grupo("ACDC", "Australia", acdc);
		redHot = new Grupo("Red Hot Chili Peppers", "California", redhot);
		SystemofDown = new Grupo("System of a Down", "EEUU", system);
	}

	private static void inicializarManager() {
		m1 = new Manager("Luis", 28, 1500, ACDC);
		m2 = new Manager("Carlos", 32, 1800, redHot);
		m3 = new Manager("Manuel", 40, 1650, SystemofDown);
		listaRepresentantes.add(m1);
		listaRepresentantes.add(m2);
		listaRepresentantes.add(m3);
	}

	private static void crearRepresentante() {
		System.out.println("Escriba el nombre");
		String n = sc.next();
		int e = LecturaTecladoInt("Escriba la edad");
		float s = LecturaTecladoFloat("Escriba el sueldo");
		Manager m = new Manager(n, e, s);
		listaRepresentantes.add(m);
		System.out.println("Indique el nombre del grupo al que representa");
		String nom = sc.next();
		System.out.println("Indique el pais del que procede el grupo");
		String p = sc.next();
		Grupo grupo = new Grupo(nom, p);
		m.setGrupo(grupo);
	}
	
	private static void crearCdGrupo() {
		
	}

	private static int LecturaTeclado(String string, int min, int max) {
		boolean sal = false;
		int entero = 0;
		do {
			try {
				System.out.print(string);
				entero = sc.nextInt();
				sc.nextLine();
				if (entero >= min && entero <= max) {
					sal = true;
				}
			} catch (InputMismatchException i) {
				sc.nextLine();
			}
		} while (!sal);
		return entero;
	}

	// LLER CADENA DE LONGITUD FIJA
	private static String LecturaTeclado(String string, int longitud) {
		boolean sal = false;

		String cad;
		do {
			System.out.print(string);
			cad = sc.nextLine();
			if (cad.length() <= longitud) {
				sal = true;
			}
		} while (!sal);

		return cad;
	}// Lectura String

	// LLER CADENA ENTRE UN MAXIMO Y MINIMO
	private static String LecturaTeclado(int maximo, String string, int minimo) {
		boolean sal = false;

		String cad;
		do {
			System.out.print(string);
			cad = sc.nextLine();
			if (cad.length() >= minimo && cad.length() <= maximo) {
				sal = true;
			}
		} while (!sal);

		return cad;
	}// Lectura String

	// LEER INT, MAYOR 0
	private static int LecturaTecladoInt(String string) {
		boolean sal = false;
		Integer entero = 0;
		do {
			try {
				System.out.print(string);
				entero = sc.nextInt();
				sc.nextLine();
				if (entero > 0) {
					sal = true;
				}
			} catch (InputMismatchException i) {
				sc.nextLine();
			}
		} while (!sal);

		return entero;
	}// LecturaEntero

	// LEER FLOAT, MAYOR 0
	private static float LecturaTecladoFloat(String string) {
		boolean sal = false;
		Float decimal = 0.0f;
		do {
			try {
				System.out.print(string);
				decimal = sc.nextFloat();
				sc.nextLine();
				if (decimal > 0) {
					sal = true;
				}
			} catch (InputMismatchException i) {
				sc.nextLine();
			}
		} while (!sal);

		return decimal;
	}// LecturaEntero

}
