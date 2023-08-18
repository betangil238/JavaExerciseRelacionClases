package ExtraExercise4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Simulador {
	ArrayList<String> nombresCompletos = new ArrayList<>();
	ArrayList<String> DNIS = new ArrayList<>();
	ArrayList<Alumno> alumnos = new ArrayList<>();
	ArrayList<Alumno> alumnosQueVotaron= new ArrayList<>();
	ArrayList<Voto> registroVotos= new ArrayList<>();
	Scanner leer = new Scanner(System.in);
	
	private String generarNombre(){
		String[] nombres = {"Ana", "Juan", "Maria", "Carlos", "Laura", "David", "Sofia", "Alejandro", "Isabella", "Diego", "Valentina", "Andres", "Camila", "Luis", "Gabriela", "Sergio", "Natalia", "Javier", "Martina", "Miguel", "Paula", "Eduardo", "Ana Sofia", "Rafael", "Valeria", "Daniel", "Andrea", "Pedro", "Lucia", "Cristian"};
		String[] apellidos= {"Martínez", "González", "Rodríguez", "Hernández", "López", "Pérez", "García", "Ramírez", "Flores", "Torres", "Díaz", "Vargas", "Rojas", "Mendoza", "Sánchez", "Cruz", "Ramos", "Morales", "Ortega", "Reyes", "Gómez", "Álvarez", "Fernández", "Silva", "Chávez", "Herrera", "Mejía", "Pacheco", "Jiménez", "Ríos"};
		int numNombre= (int) Math.floor(Math.random()*(0-30)+30);
		int numApellido= (int) Math.floor(Math.random()*(0-30)+30);
		return (nombres[numNombre]+" "+apellidos[numApellido]);
	}
	
	private String generarDNI(){
		String DNI="";
		for (int i=0; i<3;i++) {
			String numero= String.valueOf(((int) Math.floor(Math.random()*(0-10)+10))) ;
			DNI+=numero;
		}
		return DNI;
	}
	
	private ArrayList<Alumno> generarAlumnos(){
		System.out.println("Bienvenido al generador de alumnos, cuantos alumnos son");
		int cantidadAlumnos= leer.nextInt();
		boolean respuesta;
		for( int i=0; i<cantidadAlumnos;i++) {
			String nombre = generarNombre();
			nombresCompletos.add(nombre);
			String DNI;
			do {
				DNI = generarDNI();
				respuesta=verificarDNI(DNI);
			}while (respuesta);
			DNIS.add(DNI);
			Alumno alumno = new Alumno(nombre,DNI);
			alumnos.add(alumno);	
		}
		return alumnos;
		
	}
	
	private boolean verificarDNI(String DNIV) {
		for (String dni: DNIS) {
			if(dni.equals(DNIV)) {
				return true;	
			}
		}
		return false;
	}
	
	private void imprimir() {
		if(alumnos.size()!=0) {
			int index=0;
			for( Alumno alumnos: alumnos) {
				System.out.println(index+ ") "+alumnos);
				index++;
			}
		}else {
			System.out.println("Cree el curso con los alumnos");
		}
		
	}

	public void Menu() {
		int opcion;
		do {
		System.out.println("BIENVENIDO AL MENU");
		System.out.println("Elija una opcion");
		System.out.println("1) Crear curso ");
		System.out.println("2) Mostrar alumnos");
		System.out.println("3) Votar");
		System.out.println("4) Mostrar alumnos con su respectivo voto");
		System.out.println("5) Cantidad de votos dados");
		System.out.println("6) Mostrar Facilitadores");
		System.out.println("0) Salir");
		opcion = leer.nextInt();
			switch (opcion) {
			case 1:
				generarAlumnos();
				break;
			case 2:
				imprimir();
				break;
			case 3:
				votar();
				break;
			case 4:
				votos();
				break;
			case 5:
				recuentovotos();
				break;
			case 6:
				facilitadores();
				break;
			case 0:
				System.out.println("Muchas gracias");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}while(opcion!=0);	
	}

	private void facilitadores() {
		if(alumnos.size()!=0) {
			int contador=0;
			int contadorSup=0;
			alumnos.sort(compararVotos);
			if (alumnos.size()<=5) {
				System.out.println("El grupo de alumnos es muy reducido, no existen suplentes, estos son los facilitadores");
				for (Alumno alumno: alumnos) {
					contador++;
					System.out.println(contador+") "+alumno);
				}
			}
			
			if(alumnos.size()>5 && alumnos.size()<=9 ) {
				System.out.println("El grupo de alumnos tiene los 5 facilitadores y algunos suplentes");
				System.out.println("FACILITADORES");
				for (int i=0; i<5;i++) {
					contador++;
					System.out.println(contador+") "+alumnos.get(i));
				}
				System.out.println("SUPLENTES");
				for (int i=5; i<alumnos.size();i++) {
					contadorSup++;
					System.out.println(contadorSup+") "+alumnos.get(i));
				}
			}
			
			if(alumnos.size()>9 ) {
				System.out.println("aqui estan los suplentes y facilitadores");
				System.out.println("FACILITADORES");
				for (int i=0; i<5;i++) {
					contador++;
					System.out.println(contador+") "+alumnos.get(i));
				}
				System.out.println("SUPLENTES");
				for (int i=5; i<10;i++) {
					contadorSup++;
					System.out.println(contadorSup+") "+alumnos.get(i));
				}
			}
			
		}else {
			System.out.println("Se debe crear el grupo de alumnos");
		}
		
	}
	
	private static Comparator<Alumno> compararVotos = new Comparator<Alumno>() {
		@Override
		public int compare(Alumno o1, Alumno o2) {
			return o2.getVotos().compareTo(o1.getVotos());
		}
	};

	private void recuentovotos() {
		if (registroVotos.size()!=0) {
			int cantidad=0;
			for (Alumno alumno: alumnos) {
				cantidad+=alumno.getVotos();
			}
			System.out.println("El recuento de votos es: "+ cantidad);
			
		}else {
			System.out.println("No se han realizado votos");
		}
		
	}

	private void votos() {
		if(registroVotos.size()!=0) {
			for (Voto voto: registroVotos) {
				System.out.println(voto);
			}
		}else {
			System.out.println("No se ha registrado votos");
		}

	}

	private void votar() {
		if(alumnos.size()!=0) {
			System.out.println("Ingrese la posicion del estudiante");
			int pos= leer.nextInt(); // Implementar un try catch, para el error java.lang.IndexOutOfBoundsException
			if(verificarVotante(alumnos.get(pos))) {
				ArrayList<Alumno> alumnosVotados= new ArrayList<>();
				alumnosQueVotaron.add(alumnos.get(pos));
				while(alumnosVotados.size()<3) {
					int numero= (int) Math.floor(Math.random()*(0-alumnos.size())+alumnos.size());
					if(numero!=pos && verificarvoto(alumnos.get(numero),alumnosVotados)) {
						alumnos.get(numero).sumarVoto();
						alumnosVotados.add(alumnos.get(numero));
					}
				}
				Voto voto = new Voto(alumnos.get(pos),alumnosVotados);
				registroVotos.add(voto);		
			}
		}else {
			System.out.println("Cree primero el curso con los alumnos");
		}
	}
	
	private boolean verificarvoto(Alumno alumno,ArrayList<Alumno> alumnosVotados) {
		for (Alumno alum : alumnosVotados) {
			if(alumno.equals(alum)) {
				return false;
			}
		}
		return true;
	}

	private boolean verificarVotante(Alumno alumno) {
		for (Alumno alum : alumnosQueVotaron) {
			if(alumno.equals(alum)) {
				System.out.println("Lo sentimos, este alumno ya voto");
				return false;
			}
		}
		return true;
	}
}
