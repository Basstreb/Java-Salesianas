package enumeraciones;

public enum Madera {

	PINO(53), CEDRO(46), ARCE(44), HAYA(34), NOGAL(14), CEREZO(56), ROBLE(98);

	private final int dureza;

	private Madera(int dureza) {
		this.dureza = dureza;
	}

	public int getPaises() {
		return dureza;
	}
}
