package Exercise2;

import java.util.ArrayList;


public class Juego {
	private ArrayList<Jugador> jugadores= new ArrayList<>();
	private RevolverDeAgua revolver;
	
	public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
		this.jugadores=jugadores;
		this.revolver=r;
		r.llenarRevolver();
	}
	
	public void ronda() {
		int ronda=0;
		int cantJugadores=jugadores.size();
		int contador=0;
		do{
			ronda++;
			System.out.println("Bienvenidos a la ronda: "+ (ronda));
			if(contador==cantJugadores) {
				contador=0;
			}
			System.out.println(jugadores.get(contador).getNombre()+ " Es tu turno");
			boolean mojado=jugadores.get(contador).disparo(revolver);
			if (!mojado) {
				contador++;
			}else {
				System.out.println("Partida finalizada");
				System.out.println(jugadores.get(contador).getNombre()+ " Terminaste empapado");
			}
		}while(verificar());	
	}
	
	private boolean verificar() {
		for (int i=0; i<jugadores.size();i++) {
			if (jugadores.get(i).isMojado()) {
				System.out.println("Ya tenemos un mojado y fue: "+ jugadores.get(i).getNombre());
				return false;
			}
		}
		return true;
	}
}
