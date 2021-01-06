package ejercicio_35;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_35 {

	private static int num;
	private static boolean check;
	private static String texto;

	private static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_35.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Ejercicio_35.num;
	}

	public static String tryCatchString() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				Ejercicio_35.texto = keyboard.next();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
			}
		} while (check);

		return Ejercicio_35.texto;
	}

	public static void main(String[] args) {

		ArrayList<Contacto> contacto = new ArrayList<Contacto>();

		do {
			System.out.println(
					"Agenda:\n1. Crear Contacto\n2. Eliminar Contacto\n3. Ver Contactos\n4. Modificar Contacto\n5. Salir");

			int menu = tryCatchInt();

			switch (menu) {
			case 1:
				System.out.println(
						"Para la creación de un contacto introduzca primero el nombre, luego la direccion y por ultimo su telefono.");
				System.out.println("Nombre:");
				String nombre = tryCatchString();
				System.out.println("Direccion:");
				String direccion = tryCatchString();
				System.out.println("Telefono");
				int telefono = tryCatchInt();
				contacto.add(new Contacto(nombre, direccion, telefono));
				break;
			case 2:
				System.out.println("Introduzca el numero de contacto que quiera eliminar:");
				int eliminado = tryCatchInt();

				if (num == 0 || num > contacto.size()) {
					System.out.println("Ha introducido un numero incorrecto de contacto");
				} else {
					contacto.remove(eliminado - 1);
				}
				break;
			case 3:
				if (contacto.size() == 0)
					System.out.println("No ha creado ningun contaco");
				else
					System.out.println("Contactos:");
				for (int i = 0; i < contacto.size(); i++) {
					System.out.println((i + 1) + ". Nombre: " + contacto.get(i).getNombre() + "| Direccion: "
							+ contacto.get(i).getDireccion() + "| Telefono: " + contacto.get(i).getTelefono());
				}
				break;
			case 4:
				if (contacto.size() == 0)
					System.out.println("No ha creado ningun contaco");
				else {
					System.out.println("Indique el numero del contacto que quiera modificar:");
					System.out.println("Contactos:");
					for (int i = 0; i < contacto.size(); i++) {
						System.out.println((i + 1) + ". Nombre: " + contacto.get(i).getNombre() + "| Direccion: "
								+ contacto.get(i).getDireccion() + "| Telefono: " + contacto.get(i).getTelefono());
					}

					int mod = tryCatchInt();

					System.out.println(
							"Opciones:\n1. Modificar Nombre\n2. Modificar Direccion\n3. Modificar Telefono\n4. Salir");
					int menu2 = tryCatchInt();
					switch (menu2) {
					case 1:
						nombre = tryCatchString();
						contacto.get(mod - 1).setNombre(nombre);
						break;
					case 2:
						direccion = tryCatchString();
						contacto.get(mod - 1).setDireccion(direccion);
						break;
					case 3:
						telefono = tryCatchInt();
						contacto.get(mod - 1).setTelefono(telefono);
						break;
					}
				}
				break;
			}

			System.out.println();
		} while (num != 5);

	}

}
