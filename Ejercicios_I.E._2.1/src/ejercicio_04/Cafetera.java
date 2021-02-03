package ejercicio_04;

/**
 * Clase Cafetera que nos permite crear cafeteras segun tamaÒo y contenido de
 * estas y vaciarlas o llenarlas.
 * 
 * @author Dani
 *
 */
public class Cafetera {

	// Atributos
	private int _capacidadMaxima;
	private int _cantidadActual;

	/**
	 * Constructor por defecto que crea una cafetera fija
	 */
	Cafetera() {
		this._cantidadActual = 0;
		this._capacidadMaxima = 1000;
	}

	/**
	 * Constructor que crea una cafetera llena a su maxima capacidad
	 * 
	 * @param _capacidadMaxima
	 */
	Cafetera(int _capacidadMaxima) {
		this._capacidadMaxima = _capacidadMaxima;
		this._cantidadActual = _capacidadMaxima;
	}

	/**
	 * Constructor que crea una cafetera y podremos elegir tamaÒo de esta y cantidad
	 * de cafe
	 * 
	 * @param _capacidadMaxima
	 * @param _cantidadActual
	 */
	Cafetera(int _capacidadMaxima, int _cantidadActual) {
		this._capacidadMaxima = _capacidadMaxima;

		if (_cantidadActual > _capacidadMaxima) {
			this._cantidadActual = _capacidadMaxima;
		} else if (_cantidadActual < 0) {
			this._cantidadActual = 0;
		} else {
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

	/**
	 * Metodo que llena la cafetera a maxima capacidad
	 */
	public void llenarCafetera() {
		this._cantidadActual = this._capacidadMaxima;
	}

	/**
	 * Metodo que vacia la taza segun la cantidad que elijamos
	 * 
	 * @param taza
	 */
	public void servirTaza(int taza) {
		if (taza > this._cantidadActual) {
			System.out.println("Se han servido " + this._cantidadActual + "ml ya que no hab√≠a m√°s en la cafetera");
			this._cantidadActual -= this._cantidadActual;
		} else {
			System.out.println("Se han servido " + taza + "ml");
			this._cantidadActual -= taza;
		}
	}

	/**
	 * Metodo que vacia la cafetera seleccionada
	 */
	public void vaciarCafetera() {
		this._cantidadActual = 0;
	}

	/**
	 * Metodo que agrega cafe a una cafetera
	 * 
	 * @param cafe
	 */
	public void agregarCafe(int cafe) {
		if (this._capacidadMaxima < (this._cantidadActual + cafe)) {
			System.out.println("Casi llenamos mas de la cuenta la cafetera, te han sobrado "
					+ ((this._cantidadActual + cafe) - this._capacidadMaxima) + "ml");
			this._cantidadActual = this._capacidadMaxima;
		} else {
			this._cantidadActual += cafe;
		}
	}

}
