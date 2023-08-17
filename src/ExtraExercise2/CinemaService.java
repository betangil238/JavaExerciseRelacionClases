package ExtraExercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class CinemaService {
	FuncionDeCine funcion= new FuncionDeCine();
	ArrayList<Espectador> espectadores= new ArrayList<>();
	Scanner leer= new Scanner(System.in);
	private void precarga() {
		int cantidadEspectadores= (int) Math.floor(Math.random()*(1-30)+30);
		crearFuncion();
		for (int i=0; i<cantidadEspectadores;i++) {
			String[][] distribucion= funcion.getSala();
			boolean flag= true;
			espectadores.add(new Espectador(("Espectador"+(i+1)), 28+i ,2000000));
			String asiento;
			while(flag) {
				int posFila= (int) Math.floor(Math.random()*(0-8)+8);
				int posColumna= (int) Math.floor(Math.random()*(0-6)+6);
				asiento=distribucion[posFila][posColumna];
				if(String.valueOf(asiento.charAt(4)).equals("O")) {
					distribucion[posFila][posColumna]=asiento.substring(0, 4) + "X" + asiento.substring(4 + 1);
					flag=false;
				}
			}
		}
	}
	
	private void crearFuncion() {
		System.out.println("Ingrese el precio de la pelicula");
		funcion.setPrecio(leer.nextDouble());
		System.out.println("Cual es la pelicula que se dara en la funcion");
		String nombre = leer.next();
		System.out.println("Ingrese la edad minima de ingreso");
		int edad = leer.nextInt();
		Pelicula pelicula = new Pelicula(nombre,0,edad,null);
		funcion.setPelicula(pelicula);
	}
	
	private void mostrarAsientos() {
		funcion.imprimirsala();
	}
	
	private void agregarEspectador() {
		System.out.println("Ingrese el nombre del espectador");
		String nombre = leer.next();
		System.out.println("Ingrese la edad");
		int edad = leer.nextInt();
		System.out.println("Ingrese el dinero que posee");
		double dinero = leer.nextDouble();
		Espectador espectador = new Espectador(nombre, edad, dinero);
		if(espectador.getDinero()>funcion.getPrecio() && espectador.getEdad()>=funcion.getPelicula().getEdadMinima()) {
			espectadores.add(espectador);
			boolean flag = true;
			int j=6;
			int i = 8;
			while(flag) {
				System.out.println("Esta es la disponibilidad de asientos");
				mostrarAsientos();
				System.out.println("Ingrese el # de asiento acompañado de la letra");
				String silla= leer.next();
				String numero = String.valueOf(silla.charAt(0));
				String letra = String.valueOf(silla.charAt(1));
				
				if(letra.equals("A")) {
					j=0;
				}else if (letra.equals("B")) {
					j=1;
				}else if (letra.equals("C")) {
					j=2;
				}else if (letra.equals("D")) {
					j=3;
				}else if (letra.equals("E")) {
					j=4;
				}else if (letra.equals("F")) {
					j=5;
				}else {
					System.out.println("Asiento ingresado incorrectamente");
				}
				
				if (numero.equals("1")) {
					i=7;
				}else if (numero.equals("2")) {
					i=6;
				}else if (numero.equals("3")) {
					i=5;
				}else if (numero.equals("4")) {
					i=4;
				}else if (numero.equals("5")) {
					i=3;
				}else if (numero.equals("6")) {
					i=2;
				}else if (numero.equals("7")) {
					i=1;
				}else if (numero.equals("8")) {
					i=0;
				}else if(j>6){
					System.out.println("Asiento ingresado incorrectamente");
				}

				if (j!=6 && i!=8) {
					String[][] distribucion= funcion.getSala();
					String asiento=distribucion[i][j];
					boolean disponible = String.valueOf(asiento.charAt(4)).equals("O");
					if (disponible) {
						distribucion[i][j]=asiento.substring(0, 4) + "X" + asiento.substring(4 + 1);
						System.out.println("Asiento reservado exitosamente");
						flag=false;
					}else {
						System.out.println("El asiento ingresado ya se encuentra ocupado");
					}
				}
			}
		}else {
			System.out.println("Lo sentimos el usuario no cumple con los parametros de dinero y/o edad de la pelicula");
		}
		
	}
	
	public void Menu() {
		precarga();
		int opcion;
		do {
		System.out.println("BIENVENIDO AL MENU");
		System.out.println("Elija una opcion");
		System.out.println("1) añadir Espectador ");
		System.out.println("2) Mostrar sala");
		System.out.println("0) Salir");
		opcion = leer.nextInt();
			switch (opcion) {
			case 1:
				agregarEspectador();
				break;
			case 2:
				mostrarAsientos();
				break;
			case 0:
				System.out.println("Muchas gracias Disfrute su pelicula");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}while(opcion!=0);	
	}
}
