package ejercicio_16;

public class Mago extends Personaje {
	
	//Atributos
	private String poder;
	
	
	//Constructores
	Mago(String nombre, String poder){
		super(nombre, 100);
		this.poder = poder;
	}

	//Metodos
	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}
	
	public String encantar () {
		this.energia -= 2;
		return "La energia restante es de " + this.energia + " de poder de " + this.poder;
	}
	
}
