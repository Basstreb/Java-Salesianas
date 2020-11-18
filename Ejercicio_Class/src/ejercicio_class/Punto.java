package ejercicio_class;

public class Punto {
	
	//Attributes
	private float x;
	private float y;
	
	//Constructors
	Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	Punto(){}

	//Methods
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	
}
