/*Se pretende realizar una aplicación en Java para la gestión y venta de productos de una tienda de informática.
En la tienda se venden dos tipos de productos: ordenadores y teléfonos móviles. La información que hay que guardar 
de cualquier producto es un código de producto único para la tienda, el nombre, el precio y la cantidad que tienen 
actualmente para vender. De los ordenadores hay que guardar una cadena con las características del mismo como el 
procesador, la cantidad de memoria, la capacidad de su disco duro, etc. De los teléfonos móviles hay que guardar 
el operador que lo comercializa.
Codificar las clases que representan los productos de la tienda y una aplicación que realice las siguientes operaciones:
1. Alta de nuevos productos:
Se pedirán los datos del producto y se dará de alta en la tienda.
2. Baja de productos:
Se pedirá el código del producto y se dará de baja de la tienda.
3. Consulta de productos:
Se pedirá el código del producto y se mostrará su información.
4. Venta de productos:
Se pedirá el código del producto y la cantidad y se restará esa cantidad de la actual.
5. Reponer producto:
Se pedirá el código del producto a reponer y se incrementará el valor de su cantidad.
De forma voluntaria se puede realizar la operación de modificación de los datos de algún producto.
*/

package TiendaInformatica;

import java.io.*;
import java.util.*;

public class Tienda {
	private static HashMap<String, Producto> productos = new HashMap<String, Producto>();
	private static BufferedReader entrada=
			new BufferedReader(new InputStreamReader(System.in));
	private static String codigo, nombre, caracteristicas, operador, res;
	private static int cantidad;
	private static double precio;
	private static Ordenador ord;
	private static Movil mov;
	private static Producto pro;

	public static void main(String[] args) {
		
		while (true) {
			try {
				do
				{
					System.out.println("\n\n--- Operaciones de la Tienda ---");
					System.out.println(" 1 - Alta de producto. ");
					System.out.println(" 2 - Baja de producto. ");
					System.out.println(" 3 - Consulta de producto. ");
					System.out.println(" 4 - Venta de producto. ");
					System.out.println(" 5 - Reponer producto. ");
					System.out.println(" 6 - Modificar producto. ");
					System.out.println(" 7 - Salir. ");
					System.out.println(" Seleccione la operación: ");
					res=entrada.readLine();
				} while ( !res.equals("1") && !res.equals("2")
						&& !res.equals("3") && !res.equals("4")
						&& !res.equals("5") && !res.equals("6")
						&& !res.equals("7") );
				// alta
				if (res.equals("1")) {
					alta();
				}
				// baja
				else if (res.equals("2")) {
					baja();
				}
				// consulta
				else if (res.equals("3")) {
					consulta();
				}
				// venta
				else if (res.equals("4")) {
					venta();
				}
				// reponer
				else if (res.equals("5")) {
					reponer();
				}
				// modifica
				else if (res.equals("6")) {
					modifica();
				}
				// salir
				else if (res.equals("7")) System.exit(0);
			} catch( NumberFormatException nfe ) {
				System.out.println("\nError de formato numérico: " + nfe.toString());
			} catch( IOException ioe ) {
				System.out.println( "\nError de entrada/salida: " + ioe.toString() );
			} catch( Exception e ) {
				// Captura cualquier otra excepción
				System.out.println( e.toString() );
			}
		}
	}
	// alta
	private static void alta() throws IOException {
		System.out.println("\n -- Alta de producto -- ");
		System.out.println("Introduzca nombre del producto: ");
		nombre=entrada.readLine();
		System.out.println("Introduzca el precio del producto: ");
		precio=Double.parseDouble(entrada.readLine());
		System.out.println("Introduzca cantidad del producto: ");
		cantidad=Integer.parseInt(entrada.readLine());
		do
		{
			System.out.println("Introduzca tipo producto (1-ordenador, 2-tfno. móvil): ");
			res=entrada.readLine();
		} while ( !res.equals("1") && !res.equals("2") );
		if (res.equals("1")) {
			System.out.println("Introduzca características ordenador: ");
			caracteristicas=entrada.readLine();
			ord = new Ordenador(nombre, precio, cantidad, caracteristicas);
			codigo = ord.getCodigo();
			productos.put(codigo,ord);
			System.out.println("\nOrdenador dado de alta: "+ ord.toString());
		} else {
			System.out.println("Introduzca operador del móvil: ");
			operador=entrada.readLine();
			mov = new Movil(nombre, precio, cantidad, operador);
			codigo = mov.getCodigo();
			productos.put(codigo,mov);
			System.out.println("\nMóvil dado de alta: "+ mov.toString());
		}
	}
	// baja
	private static void baja() throws IOException {
		System.out.println("\n -- Baja de producto -- ");
		System.out.println("Introduzca el código del producto: ");
		codigo = entrada.readLine();
		pro = productos.get(codigo);
		if (pro != null) {
			productos.remove(codigo);
			System.out.println("\nProducto borrado.");
		} else {
			System.out.println(" Error: - Producto no encontrado - ");
		}
	}
	// consulta
	private static void consulta() throws IOException {
		System.out.println("\n -- Consulta de producto -- ");
		System.out.println("Introduzca el código del producto: ");
		codigo = entrada.readLine();
		pro = productos.get(codigo);
		if (pro != null) {
			System.out.println("\nInformación del Producto:\n"+pro.toString());
		} else {
			System.out.println(" Error: - Producto no encontrado - ");
		}
	}
	// venta
	private static void venta() throws IOException {
		System.out.println("\n -- Venta de producto -- ");
		System.out.println("Introduzca el código del producto: ");
		codigo = entrada.readLine();
		System.out.println("Introduzca la cantidad: ");
		cantidad=Integer.parseInt(entrada.readLine());
		pro = productos.get(codigo);
		if (pro != null) {
			if (pro.restaCantidad(cantidad)) {
				System.out.println("\nPrecio: "+ pro.getPrecio()*cantidad);
				System.out.println("Producto comprado: "+ pro.toString());
			} else System.out.println("No hay stock.");
		} else {
			System.out.println(" Error: - Producto no encontrado - ");
		}
	}
	// reponer
	private static void reponer() throws IOException {
		System.out.println("\n -- Reponer producto -- ");
		System.out.println("Introduzca el código del producto: ");
		codigo = entrada.readLine();
		System.out.println("Introduzca la cantidad: ");
		cantidad=Integer.parseInt(entrada.readLine());
		pro = productos.get(codigo);
		if (pro != null) {
			pro.sumaCantidad(cantidad);
			System.out.println("\nProducto repuesto: "+ pro.toString());
		} else {
			System.out.println(" Error: - Producto no encontrado - ");
		}
	}
	// modifica
	private static void modifica() throws IOException {
		System.out.println("\n -- Modificar producto -- ");
		System.out.println("Introduzca el código del producto: ");
		codigo = entrada.readLine();
		pro = productos.get(codigo);
		if (pro == null) {
			System.out.println(" Error: - Producto no encontrado - ");
			return;
		}
		//sacamos el tipo de producto
		String tipo = pro.getClass().getName();
		int op;
		if (tipo.equals("tienda.Ordenador")) {
			ord = (TiendaInformatica.Ordenador) pro;
			System.out.println("Introduzca el dato a modificar (1-nombre, 2-precio, 3-características): ");
			op = Integer.parseInt(entrada.readLine());
			switch(op) {
			case 1: System.out.println("Introduzca nombre del producto: ");
			nombre=entrada.readLine();
			ord.setNombre(nombre);
			break;
			case 2: System.out.println("Introduzca el precio del producto: ");
			precio=Double.parseDouble(entrada.readLine());
			ord.setPrecio(precio);
			break;
			case 3: System.out.println("Introduzca características ordenador: ");
			caracteristicas=entrada.readLine();
			ord.setCaracteristicas(caracteristicas);
			break;
			default: System.out.println("Opción incorrecta");
			}
		} else {
			mov = (TiendaInformatica.Movil) pro;
			System.out.println("Introduzca el dato a modificar (1-nombre, 2-precio, 3-operador): ");
			op = Integer.parseInt(entrada.readLine());
			switch(op) {
			case 1: System.out.println("Introduzca nombre producto: ");
			nombre=entrada.readLine();
			mov.setNombre(nombre);
			break;
			case 2: System.out.println("Introduzca el precio del producto: ");
			precio=Double.parseDouble(entrada.readLine());
			mov.setPrecio(precio);
			break;
			case 3: System.out.println("Introduzca operador del móvil: ");
			operador=entrada.readLine();
			mov.setOperador(operador);
			break;
			default: System.out.println("Opción incorrecta");
			}
		}
		System.out.println("\nProducto modificado: "+ pro.toString());
	}
}