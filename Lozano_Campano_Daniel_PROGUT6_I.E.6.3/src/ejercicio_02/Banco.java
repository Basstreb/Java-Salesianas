package ejercicio_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

	static Scanner sc = new Scanner(System.in);
	private static List<Cuenta> cuentas = new ArrayList<>();
	private static List<Cliente> clientes = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		
	}
	
	public static void menu() {
		System.out.println("=======================");
		System.out.println("1. Nuevo Cliente");
		System.out.println("2. Nueva Cuenta");
		System.out.println("3. Litar Clientes y Cuentas");
		System.out.println("4. Ingresar Dinero");
		System.out.println("5. Sacar Dinero");
		System.out.println("6. Consultar Saldo");
		System.out.println("7. Revision Mensual");
		System.out.println("8. Cambiar Comision Mensual");
		System.out.println("0. Salir");
		System.out.println("=======================");
	}

}
