package videojuego;

public class Mago extends Personaje {
	
	//Atributos
	private String poder;
	
	
	//Constructores
	Mago(){
		this.energia = 100;
	}
	
	Mago(String nombre, String poder){
		this.nombre = nombre;
		this.poder = poder;
		this.energia = 100;
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
