package Exercise2;

public class Jugador {
	private static int id=1;
	private String nombre="Jugador "+id;
	private boolean mojado=false;
	
	public Jugador() {
		Jugador.id++;
	}

	public boolean disparo(RevolverDeAgua r) {
		mojado=r.mojar();
		return mojado;
	}

	public boolean isMojado() {
		return mojado;
	}

	public String getNombre() {
		return nombre;
	}
	
}
