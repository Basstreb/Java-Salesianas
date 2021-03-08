package CensoUniversitario;

import java.util.Calendar;

	public class Fecha {
		//atributos
		private int año;
		private int mes;
		private int dia;
		//constructores
		public Fecha(int dia, int mes, int año) {
			this.dia = dia;
			this.mes = mes;
			this.año = año;
		}
		public Fecha(String cadenaFecha) throws FechaMal {
			String[] st = cadenaFecha.split("/");
			if (st.length < 3) {
				throw new FechaMal();
			}
			String dd = st[0];
			String mm = st[1];
			String aa = st[2];
			this.dia = Integer.parseInt(dd);
			this.mes = Integer.parseInt(mm);
			this.año = Integer.parseInt(aa);
		}
		public Fecha() {
			Calendar hoy = Calendar.getInstance();
			año = hoy.get(Calendar.YEAR);
			mes = hoy.get(Calendar.MONTH) + 1;
			dia = hoy.get(Calendar.DAY_OF_MONTH);
		}
		//métodos
		public String toString() {
			return dia + "/" + mes + "/" + año;
		}
		public int getAño() {
			return this.año;
		}
		public void setAño(int año) {
			this.año = año;
		}
		public int getDia() {
			return this.dia;
		}
		public void setDia(int dia) {
			this.dia = dia;
		}
		public int getMes() {
			return this.mes;
		}
		public void setMes(int mes) {
			this.mes = mes;
		}
}

class FechaMal extends Exception {
	public FechaMal() {
		super("FECHA INCORRECTA.");
	}
}