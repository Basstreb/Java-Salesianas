package Informaticos;

public class Programador extends InformaticoAbs {
	String lenguaje;
	public Programador(String empresa, String lenguaje) {
		super(empresa);
		this.lenguaje = lenguaje;
	}
	public double pagarSueldo(double horas) {
		return horas*6;
	}
}