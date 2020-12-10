package ejercicio_17;

public class PlazaAparcamiento {

	private int numeroPlaza;
	private Coche coche;
	private boolean plazaLibre;
	private static int contCoches;

	/**
	 * Constructor que recibe el numero de la plaza.
	 * 
	 * @param np
	 */
	public PlazaAparcamiento(int np) {
		numeroPlaza = np;
		plazaLibre = true;
	}

	public int getNumeroPlaza() {
		return numeroPlaza;
	}

	public void setNumeroPlaza(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	public boolean isPlazaLibre() {
		return plazaLibre;
	}

	public void setPlazaLibre(boolean plazaLibre) {
		this.plazaLibre = plazaLibre;
	}

	public static int getContCoches() {
		return contCoches;
	}

	public static void setContCoches(int contCoches) {
		PlazaAparcamiento.contCoches = contCoches;
	}

	/**
	 * Metodo que muestra el menu de nuestro programa
	 */
	public void muestraMenu() {
		System.out.println(
				"PLAZA APARCAMIENTO\n1.    Aparcar coche\n2.    Sacar coche\n3.    Ver coche aparcado\n4.    Salir aplicacion\nOPCION:");
	}

	/**
	 * Metodo que aparca el coche y aumenta el contador
	 */
	public void aparcaCoche() {
		if (plazaLibre) {
			System.out.println(
					"Introduzca primero la matricula del vehiculo sin letras, despues la marca y por ultimo el modelo.");
			coche = new Coche(MainGestionPlaza.tryCatchInt(), MainGestionPlaza.tryCatchString(),
					MainGestionPlaza.tryCatchString());
			plazaLibre = false;
			System.out.println("EL COCHE SE HA APARCADO");
			contCoches++;
		} else {
			System.out.println("PLAZA YA OCUPADA POR OTRO COCHE");
		}
	}

	/**
	 * Metodo que saca el coche del aparcamiento
	 */
	public void sacarCoche() {
		if (!plazaLibre) {
			plazaLibre = true;
			System.out.println("PLAZA LIBRE EL COCHE " + coche + " HA SALIDO DE LA PLAZA");
		} else {
			System.out.println("ERROR, NO HAY COCHE EN LA PLAZA DE APARCAMIENTO LA PLAZA ESTA LIBRE");
		}
	}

	/**
	 * Metodo que muestra si la plaza esta ocupada y si es asi decir que coche es
	 */
	public void mostrarCoche() {
		if (!plazaLibre) {
			System.out.println("En la plaza numero " + numeroPlaza + " esta aparcado el coche " + coche.getMarca()
					+ " modelo " + coche.getModelo() + " con matricula " + coche.getMatricula());
		} else {
			System.out.println("LA PLAZA ESTA LIBRE");
		}
	}

	/**
	 * Metodo que muestra el estado de la plaza
	 */
	public void estadoPlaza() {
		if (!plazaLibre) {
			System.out.println("LA PLAZA ESTA ACTUALMENTE OCUPADA");
			if (contCoches == 1) {
				System.out.println("Ha aparcado un total de " + contCoches + " coche.");
			} else {
				System.out.println("Han aparcado un total de " + contCoches + " coches.");
			}
		} else {
			if (contCoches == 1) {
				System.out.println("Ha aparcado un total de " + contCoches + " coche.");
			} else {
				System.out.println("Han aparcado un total de " + contCoches + " coches.");
			}
		}
	}

}
