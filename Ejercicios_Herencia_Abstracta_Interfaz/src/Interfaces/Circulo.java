package Interfaces;

class Circulo implements FiguraGeometrica{
	int radio ;
	public Circulo (int radio) {
		this.radio = radio;
	}
	public void area () {
		System.out.println("El area del c�rculo es " + (2*Math.PI*(radio*radio)));
	}
}