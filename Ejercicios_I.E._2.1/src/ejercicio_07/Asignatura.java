package ejercicio_07;

public class Asignatura {
	
	private String nombreAsignatura;
	private float nota;
	
	public Asignatura(String a, float n){
		nombreAsignatura = a;
		nota = n;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}	
	
	public String calificacion() {
		if (nota >= 5) {
			return "Aprobado";
		}else {
			return "Suspenso";
		}
	}
	
	public String asignatura() {
		return nombreAsignatura;
		
	}
}
