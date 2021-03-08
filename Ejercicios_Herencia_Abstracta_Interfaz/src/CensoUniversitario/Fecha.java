package CensoUniversitario;

import java.util.Calendar;

	public class Fecha {
		//atributos
		private int a�o;
		private int mes;
		private int dia;
		//constructores
		public Fecha(int dia, int mes, int a�o) {
			this.dia = dia;
			this.mes = mes;
			this.a�o = a�o;
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
			this.a�o = Integer.parseInt(aa);
		}
		public Fecha() {
			Calendar hoy = Calendar.getInstance();
			a�o = hoy.get(Calendar.YEAR);
			mes = hoy.get(Calendar.MONTH) + 1;
			dia = hoy.get(Calendar.DAY_OF_MONTH);
		}
		//m�todos
		public String toString() {
			return dia + "/" + mes + "/" + a�o;
		}
		public int getA�o() {
			return this.a�o;
		}
		public void setA�o(int a�o) {
			this.a�o = a�o;
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