package ejercicio_13;

/**
 * Clase Alimento que nos servira para crear objetos alimento y ver sus propiedades
 * @author Dani
 *
 */
public class Alimento {

	//Atributos
	private String nombre;
	private float lipidos;
	private float hidratosCarbono;
	private float proteinas;
	private boolean origenAnimal;
	private char contenidoVitaminas;
	private char contenidoMineral;

	/**
	 * Constructor que solo pide el nombre del alimento
	 * @param n
	 */
	public Alimento(String n) {
		nombre = n;
	}

	/**
	 * Constructor que crea un objeto alimento teniendo pidiendo todos sus atributos
	 * @param n
	 * @param l
	 * @param hc
	 * @param p
	 * @param oa
	 * @param cv
	 * @param cm
	 */
	public Alimento(String n, float l, float hc, float p, boolean oa, char cv, char cm) {
		nombre = n;
		lipidos = l;
		hidratosCarbono = hc;
		proteinas = p;
		origenAnimal = oa;
		contenidoVitaminas = cv;
		contenidoMineral = cm;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getLipidos() {
		return lipidos;
	}

	public void setLipidos(float lipidos) {
		this.lipidos = lipidos;
	}

	public float getHidratosCarbono() {
		return hidratosCarbono;
	}

	public void setHidratosCarbono(float hidratosCarbono) {
		this.hidratosCarbono = hidratosCarbono;
	}

	public float getProteinas() {
		return proteinas;
	}

	public void setProteinas(float proteinas) {
		this.proteinas = proteinas;
	}

	public boolean isOrigenAnimal() {
		return origenAnimal;
	}

	public void setOrigenAnimal(boolean origenAnimal) {
		this.origenAnimal = origenAnimal;
	}

	public char getContenidoVitaminas() {
		return contenidoVitaminas;
	}

	public void setContenidoVitaminas(char contenidoVitaminas) {
		this.contenidoVitaminas = contenidoVitaminas;
	}

	public char getContenidoMineral() {
		return contenidoMineral;
	}

	public void setContenidoMineral(char contenidoMineral) {
		this.contenidoMineral = contenidoMineral;
	}

	/**
	 * Metodo que retorna true o false segun el porcentaje de lipidos y su contenido en vitaminas
	 * @return
	 */
	public boolean esDietetico() {
		if (lipidos < 20 && contenidoVitaminas != 'C') {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que devuelve una descripcion del alimentos segun los datos de sus atributos
	 * @return
	 */
	public String muestraAlimento() {

		if (origenAnimal) {
			if (contenidoMineral == 'A' && contenidoVitaminas == 'A') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Alto contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral == 'M' && contenidoVitaminas == 'A') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Alto contenido en vitaminas y un Medio contenido en minerales.";
			}
			else if (contenidoMineral == 'B' && contenidoVitaminas == 'A') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Alto contenido en vitaminas y un Bajo contenido en minerales.";
			}
			else if (contenidoMineral == 'A' && contenidoVitaminas == 'M') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Medio contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral == 'M' && contenidoVitaminas == 'M') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Medio contenido en vitaminas y un Medio contenido en minerales.";
			}
			else if (contenidoMineral == 'B' && contenidoVitaminas == 'M') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Medio contenido en vitaminas y un Bajo contenido en minerales.";
			}
			else if (contenidoMineral == 'A' && contenidoVitaminas == 'B') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Bajo contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral == 'M' && contenidoVitaminas == 'B') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Bajo contenido en vitaminas y un Medio contenido en minerales.";
			}
			else{
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Bajo contenido en vitaminas y un Bajo contenido en minerales.";
			}
		}else {
			if (contenidoMineral == 'A' && contenidoVitaminas == 'A') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Alto contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral == 'M' && contenidoVitaminas == 'A') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Alto contenido en vitaminas y un Medio contenido en minerales.";
			}
			else if (contenidoMineral == 'B' && contenidoVitaminas == 'A') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Alto contenido en vitaminas y un Bajo contenido en minerales.";
			}
			else if (contenidoMineral == 'A' && contenidoVitaminas == 'M') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Medio contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral == 'M' && contenidoVitaminas == 'M') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Medio contenido en vitaminas y un Medio contenido en minerales.";
			}
			else if (contenidoMineral == 'B' && contenidoVitaminas == 'M') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Medio contenido en vitaminas y un Bajo contenido en minerales.";
			}
			else if (contenidoMineral == 'A' && contenidoVitaminas == 'B') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Bajo contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral == 'M' && contenidoVitaminas == 'B') {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Bajo contenido en vitaminas y un Medio contenido en minerales.";
			}
			else{
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Bajo contenido en vitaminas y un Bajo contenido en minerales.";
			}
		}

	}

}
