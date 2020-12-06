package ejercicio_17;

public class Coche {

	private int matricula;
	private String marca;
	private String modelo;

	public Coche(int m, String ma, String mo) {
		matricula = m;
		marca = ma;
		modelo = mo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void muestraCoche() {
		System.out.println("El coche tiene:\nMatricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo);
	}

}
