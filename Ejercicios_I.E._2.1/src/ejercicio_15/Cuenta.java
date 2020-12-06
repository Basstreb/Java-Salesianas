package ejercicio_15;

public class Cuenta {

	private float dinero;
	
	Cuenta(){}
	
	Cuenta(float d){
		dinero = d;
	}
	
	public void ingresar(float c) {
		dinero += c;
	}
	
	public void extraer(float c) {
		dinero -= c;
	}
	
	public float getSaldo() {
		return dinero;
	}
	
	
	
}
