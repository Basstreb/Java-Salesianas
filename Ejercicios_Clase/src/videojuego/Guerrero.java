package videojuego;

public class Guerrero extends Personaje {
	
	//Atributos
	private String arma;
	
	//Constructores
	Guerrero(){	}
	
	Guerrero(String nombre, int energia, String arma){
		this.nombre = nombre;
		this.energia = energia;
		this.arma = arma;
	}

	//Metodos
	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}
	
	public String combatir(int gastoe) {
		this.energia -= gastoe;
		return "Has atacado con " + this.arma + " y la cantidad de energia gastada es de " + gastoe +
				" la energia restante es de " + this.energia;
	}
}
