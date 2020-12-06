package ejercicio_13;

public class Alimento {

	private String nombre;
	private float lipidos;
	private float hidratosCarbono;
	private float proteinas;
	private boolean origenAnimal;
	private String contenidoVitaminas;
	private String contenidoMineral;

	public Alimento(String n) {
		nombre = n;
	}

	public Alimento(String n, float l, float hc, float p, boolean oa, String cv, String cm) {
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

	public String getContenidoVitaminas() {
		return contenidoVitaminas;
	}

	public void setContenidoVitaminas(String contenidoVitaminas) {
		this.contenidoVitaminas = contenidoVitaminas;
	}

	public String getContenidoMineral() {
		return contenidoMineral;
	}

	public void setContenidoMineral(String contenidoMineral) {
		this.contenidoMineral = contenidoMineral;
	}

	public boolean esDietetico() {
		if (lipidos < 20 && !this.contenidoVitaminas.equals("C")) {
			return true;
		} else {
			return false;
		}
	}

	public String muestraAlimento() {

		if (origenAnimal) {
			if (contenidoMineral.equals("A") && contenidoVitaminas.equals("A")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Alto contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral.equals("M") && contenidoVitaminas.equals("A")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Alto contenido en vitaminas y un Medio contenido en minerales.";
			}
			else if (contenidoMineral.equals("B") && contenidoVitaminas.equals("A")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Alto contenido en vitaminas y un Bajo contenido en minerales.";
			}
			else if (contenidoMineral.equals("A") && contenidoVitaminas.equals("M")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Medio contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral.equals("M") && contenidoVitaminas.equals("M")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Medio contenido en vitaminas y un Medio contenido en minerales.";
			}
			else if (contenidoMineral.equals("B") && contenidoVitaminas.equals("M")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Medio contenido en vitaminas y un Bajo contenido en minerales.";
			}
			else if (contenidoMineral.equals("A") && contenidoVitaminas.equals("B")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas es de origen animal y tiene un Bajo contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral.equals("M") && contenidoVitaminas.equals("B")) {
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
			if (contenidoMineral.equals("A") && contenidoVitaminas.equals("A")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Alto contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral.equals("M") && contenidoVitaminas.equals("A")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Alto contenido en vitaminas y un Medio contenido en minerales.";
			}
			else if (contenidoMineral.equals("B") && contenidoVitaminas.equals("A")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Alto contenido en vitaminas y un Bajo contenido en minerales.";
			}
			else if (contenidoMineral.equals("A") && contenidoVitaminas.equals("M")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Medio contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral.equals("M") && contenidoVitaminas.equals("M")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Medio contenido en vitaminas y un Medio contenido en minerales.";
			}
			else if (contenidoMineral.equals("B") && contenidoVitaminas.equals("M")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Medio contenido en vitaminas y un Bajo contenido en minerales.";
			}
			else if (contenidoMineral.equals("A") && contenidoVitaminas.equals("B")) {
				return "El " + nombre + " es un alimento que contiene " + lipidos + "% de lipidos, ademas de un "
						+ hidratosCarbono + "% de hidratos de carbono y un " + proteinas
						+ "% de proteinas.\nAdemas no es de origen animal y tiene un Bajo contenido en vitaminas y un Alto contenido en minerales.";
			}
			else if (contenidoMineral.equals("M") && contenidoVitaminas.equals("B")) {
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
