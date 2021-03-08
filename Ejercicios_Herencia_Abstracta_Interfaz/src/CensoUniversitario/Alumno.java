package CensoUniversitario;

	public class Alumno extends Persona {
		private String titulacion;
		private String asignaturas;
		//constructor
		public Alumno(String p_dni, String p_nombre, Fecha p_fecnac,
				String p_direccion, int p_tfno, String titulacion, String asignaturas) {
			super(p_dni, p_nombre, p_fecnac, p_direccion, p_tfno);
			this.titulacion = titulacion;
			this.asignaturas = asignaturas;
		}
		//métodos
		public String getTitulacion() {
			return this.titulacion;
		}
		public void setTitulacion(String titulacion) {
			this.titulacion = titulacion;
		}
		public String getAsignaturas() {
			return this.asignaturas;
		}
		public void setAsignaturas(String asignaturas) {
			this.asignaturas = asignaturas;
		}
		public String toString() {
			return super.toString()+" # Alumno # - Titulación: "+ this.titulacion;
		}
}