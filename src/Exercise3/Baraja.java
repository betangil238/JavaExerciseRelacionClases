package Exercise3;

import java.util.ArrayList;
import java.util.Scanner;
//Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
//y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//contener un método toString() que retorne el número de carta y el palo. La baraja estará
//compuesta por un conjunto de cartas, 40 exactamente.
//Las operaciones que podrá realizar la baraja son:
//• barajar(): cambia de posición todas las cartas aleatoriamente.
//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
public class Baraja {
	Scanner leer = new Scanner(System.in);
	private int numeros[] = {1,2,3,4,5,6,7,10,11,12};
	private String[] palos = {"espadas"," bastos", "oros", "copas"};
	private ArrayList<Carta> baraja = new ArrayList<>();
	private ArrayList<Carta> cartasUsadas = new ArrayList<>();
	
	
	private void barajar() {
			baraja.clear();
			cartasUsadas.clear();
		for (int i=0;i<40;i++) {
			int numCarta= (int) Math.floor(Math.random()*(0-10)+10);
			int paloCarta= (int) Math.floor(Math.random()*(0-4)+4);
			baraja.add(new Carta(numeros[numCarta],palos[paloCarta]));
		}
	}
	
	private void siguienteCarta() {
		if (baraja.size()==0) {
			System.out.println("Debe barajar nuevamente el mazo");
		}else {
			Carta carta = baraja.get(0);
			baraja.remove(0);
			System.out.println("La carta obtenida es: "+ carta);
			cartasUsadas.add(carta);
		}
			
	}
	
	private void cartasDisponibles() {
		System.out.println("Aun se pueden repartir: "+ baraja.size() + " cartas");
	}
	
	private void darcartas() {
		System.out.println("Ingrese la cantidad de cartar a dar");
		int cantidad = leer.nextInt();
		if(cantidad<=baraja.size()) {
			for (int i=0; i<cantidad;i++) {
				siguienteCarta();
			}
		}else {
			System.out.println("Lo sentimos, no hay una cantidad suficiente para repartir");
		}
	}
	private void cartasMonton() {
		if (cartasUsadas.size()==0) {
			System.out.println("No se ha dado ninguna carta");
		}else {
			for (Carta carta: cartasUsadas) {
				System.out.println(carta);
			}
		}
	}
	
	private void mostrarBaraja() {
		System.out.println("ESTA ES SU BARAJA");
		int contador =0;
		if (baraja.size()==0) {
			System.out.println("Ya se saco todo el mazo");
		}else {
			for(Carta carta : baraja) {
				contador++;
				System.out.println(contador+") "+carta);
		}
		}
	}
	
	public void Menu() {
		barajar();
		int opcion;
		do {
		System.out.println("BIENVENIDO AL MENU");
		System.out.println("Elija una opcion");
		System.out.println("1) Barajar/reiniciar baraja ");
		System.out.println("2) Dar 1 carta");
		System.out.println("3) Consultar cantidad disponible");
		System.out.println("4) Dar varias cartas");
		System.out.println("5) Consultar cartas sacadas");
		System.out.println("6) Consultar cartas sin sacar");
		System.out.println("0) Salir");
		opcion = leer.nextInt();
			switch (opcion) {
			case 1:
				barajar();
				break;
			case 2:
				siguienteCarta();
				break;
			case 3:
				cartasDisponibles();
				break;
			case 4:
				darcartas();
				break;
			case 5:
				cartasMonton();
				break;
			case 6:
				mostrarBaraja();
				break;
			case 0:
				System.out.println("Muchas gracias por jugar");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}while(opcion!=0);
		
	}

}
