package ejercicio_class;

public class Coche {
	
	private String marca;
	private String modelo;
	Coche(){
	marca="Ford";
	modelo="Focus";
	}
	Coche(String mar, String mod){
	marca=mar;
	modelo=mod;
	}
	public void setMarca(String mar){
	marca=mar;
	}
	public void setModelo(String mod){
	modelo=mod;
	}
	public String getMarca(){
	return marca;
	}
	public String getModelo(){
	return modelo;
	}
}