package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Esta clase contiene las funciones relacionadas con los objetos cliente
 */
public class FuncionCliente {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	static int cod=0;
	Cliente c ;
	Excepcion ex = new Excepcion();
	HashMap<Integer, Cliente> listaCliente;

	FuncionCliente(){
		listaCliente = new HashMap<>();
	}
	
	/**
	 * Metodo que crea y anade un cliente a la coleccion del obejto FuncionCliente
	 */
	public void addCliente() throws IOException {	//Anade cliente a la lista
		
		System.out.println("-ANADIR CLIENTE- \nNombre Cliente:");
		String nombre = teclado.readLine();
		System.out.println("Direccion  Cliente:");
		String direccion = teclado.readLine();
		System.out.println("Telefono Cliente:");
		String telefono = ex.soloTelefono(teclado.readLine());
		c = new Cliente(nombre, direccion, telefono);
		cod++;
		listaCliente.put(cod, c);
		System.out.println("");
	}
	

	
	/**
	 * Metodo que ficha un cliente, es decir, lo describe. El cliente que va a ser descrito es elegido primero.
	 */
	public void ficharSoloCliente() throws NumberFormatException, IOException {
		
		if (listaCliente.isEmpty()) {
			System.out.println("no hay ningun clientes");
		}else {
			listarCliente();
			Iterator g = listaCliente.entrySet().iterator();
			System.out.println("Selecciona el codigo de cliente deseado");
			int num=Integer.parseInt(ex.soloNumeros(teclado.readLine()));
			if (num<=listaCliente.size()&&num>0) {
				while (g.hasNext()) {
					Map.Entry e = (Map.Entry)g.next();
					if ((int) e.getKey()==num) {
						listaCliente.get(num).fichaCliente();
					}		
				}
			}else {
				System.out.println("Introduzca un codigo valido");
				ficharSoloCliente();
			}
		}
	}
	
	/**
	 * Metodo que permite elegir un cliente para luego eliminarlo de la coleccion de Clientes
	 */
	public void eliminarCliente() throws NumberFormatException, IOException  {	//Elimina cliente de la lista
		
		if (listaCliente.isEmpty()) {
			System.out.println("No hay clientes");
		}else {
			listarCliente();
			boolean aux = false;
			int num;
			do {
				System.out.println("Selecciona el codigo del cliente a eliminar: ");
				num = ex.pedirInt();
				
				if(listaCliente.containsKey(num)){
					if (listaCliente.get(num).clientePeliculas.isEmpty() && listaCliente.get(num).clienteVideojuegos.isEmpty()) {
						 listaCliente.remove(num);
				            System.out.println("Usuario eliminado correctamente");
				            aux=true;
					}else {
						System.out.println("No es posible eliminar clientes con productos alquilados");
						aux = true;
					}
		           
		        }else {
		        	System.out.println("Usuario no encontrado");
		        	aux=false;
		        }
			} while (aux==false);
			
		}
	}
	
	/**
	 * Metodo que lista todos los cliente de la coleccion Clientes junto con su "Key"
	 */
	public void listarCliente() {
		if (listaCliente.isEmpty()) {
			System.out.println("No hay clientes");
		}else {
			Iterator g = listaCliente.entrySet().iterator();
			while (g.hasNext()) {
				Map.Entry e = (Map.Entry)g.next();
				System.out.println("Cod:" + (int) e.getKey() + e.getValue().toString());	
			}
		}

	}
	
	

	
	
	
}
