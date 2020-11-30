package ejercicio_04;

public class Cafetera {

	// Atributos
	private int _capacidadMaxima;
	private int _cantidadActual;

	// Constructores
	Cafetera() {
		this._cantidadActual = 0;
		this._capacidadMaxima = 1000;
	}

	Cafetera(int _capacidadMaxima) {
		this._capacidadMaxima = _capacidadMaxima;
		this._cantidadActual = _capacidadMaxima;
	}

	Cafetera(int _capacidadMaxima, int _cantidadActual) {
		this._capacidadMaxima = _capacidadMaxima;

		if (_cantidadActual > _capacidadMaxima) {
			this._cantidadActual = _capacidadMaxima;
		} else if (_cantidadActual < 0) {
			this._cantidadActual = 0;
		}
		else {
			this._cantidadActual = _cantidadActual;
		}
	}

	// Metodos
	public int get_capacidadMaxima() {
		return _capacidadMaxima;
	}

	public void set_capacidadMaxima(int _capacidadMaxima) {
		this._capacidadMaxima = _capacidadMaxima;
	}

	public int get_cantidadActual() {
		return _cantidadActual;
	}

	public void set_cantidadActual(int _cantidadActual) {
		this._cantidadActual = _cantidadActual;
	}

	public void llenarCafetera() {
		this._cantidadActual = this._capacidadMaxima;
	}

	public void servirTaza(int taza) {
		if (taza > this._cantidadActual) {
			System.out.println("Se han servido " + this._cantidadActual + "ml ya que no había más en la cafetera");
			this._cantidadActual -= this._cantidadActual;
		} else {
			System.out.println("Se han servido " + taza + "ml");
			this._cantidadActual -= taza;
		}
	}

	public void vaciarCafetera() {
		this._cantidadActual = 0;
	}

	public void agregarCafe(int cafe) {
		if (this._capacidadMaxima < (this._cantidadActual + cafe)) {
			System.out.println("Casi llenamos mas de la cuenta la cafetera, te han sobrado "
					+ ((this._cantidadActual + cafe) - this._capacidadMaxima) + "ml");
			this._cantidadActual = this._capacidadMaxima;
		}
		else {
			this._cantidadActual += cafe;
		}
	}

}
