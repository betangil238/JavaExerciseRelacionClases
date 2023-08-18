package ExtraExercise4;

public class Alumno {
	private String nombre ;
	private String DNI;
	private Integer votos;
	
	public Alumno() {
		super();
		this.votos = 0;
	}

	public Alumno(String nombre, String dNI) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.votos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public Integer getVotos() {
		return votos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	public void sumarVoto() {
		this.votos+=1;
	}

	@Override
	public String toString() {
		return "[nombre: " + nombre + ", DNI:" + DNI + ", votos=" + votos + "]";
	}
	
	
}
