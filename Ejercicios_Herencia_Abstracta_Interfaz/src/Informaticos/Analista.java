package Informaticos;

public class Analista extends InformaticoAbs {
	String especialidad;
	public Analista(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}
	public double pagarSueldo(double horas) {
		return horas*12;
	}
}