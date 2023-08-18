package ExtraExercise4;

import java.util.ArrayList;

public class Voto {
	private Alumno alumno;
	private ArrayList<Alumno> alumnosVotados;
	public Voto(Alumno alumno, ArrayList<Alumno> alumnosVotados) {
		super();
		this.alumno = alumno;
		this.alumnosVotados = alumnosVotados;
	}
	public Voto() {
		super();
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public ArrayList<Alumno> getAlumnosVotados() {
		return alumnosVotados;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public void setAlumnosVotados(ArrayList<Alumno> alumnosVotados) {
		this.alumnosVotados = alumnosVotados;
	}
	@Override
	public String toString() {
		return "Voto [alumno=" + alumno + ", alumnosVotados=" + alumnosVotados + "]";
	}
	
	
	
}
