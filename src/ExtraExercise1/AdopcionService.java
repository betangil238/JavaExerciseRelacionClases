package ExtraExercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class AdopcionService {
	Scanner leer= new Scanner(System.in);
	
	private ArrayList<Persona> personas = new ArrayList<>();
	private ArrayList<Perro> perros = new ArrayList<>();
	private ArrayList<Perro> perrosAdoptados = new ArrayList<>();
	
	private void precarga() {
		personas.add(new Persona("Daniel", "Betancur", 28, "101722"));
		personas.add(new Persona("Juan Pablo", "Betancur", 26, "1032152"));
		personas.add(new Persona("Paola", "Rios", 26, "103665"));
		personas.add(new Persona("Stella ", "Giraldo", 58, "4301"));
		personas.add(new Persona("Joaquin", "Betancur",60, "71586"));
		
		perros.add(new Perro("Lucas", "criollo", 11, "mediano"));
		perros.add(new Perro("Kira", "Husky", 3, "grande"));
		perros.add(new Perro("huellitas", "criollo", 1, "pequeño"));
		perros.add(new Perro("lorenzo", "pastor", 5, "mediano"));
		perros.add(new Perro("gregorio", "gran danes", 2, "grande"));
	
	}
	
	private void anadirPersona() {
		System.out.println("Ingrese un nombre");
		String nombre = leer.next();
		System.out.println("Ingrese el apellido");
		String apellido = leer.next();
		System.out.println("Ingrese la edad");
		int edad = leer.nextInt();
		System.out.println("Ingrese el documento");
		String documento = leer.next();
		personas.add(new Persona(nombre, apellido, edad, documento));
	}
	
	private void anadirPerro() {
		System.out.println("Ingrese un nombre");
		String nombre = leer.next();
		System.out.println("Ingrese la raza");
		String raza = leer.next();
		System.out.println("Ingrese la edad");
		int edad = leer.nextInt();
		System.out.println("Ingrese el tamano");
		String tamano = leer.next();
		perros.add(new Perro(nombre, raza, edad, tamano));
	}
	
	public void Menu() {
		precarga();
		int opcion;
		do {
		System.out.println("BIENVENIDO AL MENU");
		System.out.println("Elija una opcion");
		System.out.println("1) añadir persona ");
		System.out.println("2) añadir perro");
		System.out.println("3) generar una adopcion");
		System.out.println("4) imprimir usuarios con adopciones");
		System.out.println("0) Salir");
		opcion = leer.nextInt();
			switch (opcion) {
			case 1:
				anadirPersona();
				break;
			case 2:
				anadirPerro();
				break;
			case 3:
				generarAdopcion();
				break;
			case 4:
				imprimir();
				break;
			case 0:
				System.out.println("Muchas gracias por usar el servicio de adopcion");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}while(opcion!=0);
		
	}

	private void imprimir() {
		System.out.println("Perros adoptados con su respectivo dueño");
		if (perrosAdoptados.size()==0) {
			System.out.println("No hay perros adoptados aun");
		}else {
			for (Persona persona : personas) {
				for (Perro perro: perrosAdoptados) {
					if (persona.getPerro()!=null) {
						if(persona.getPerro().equals(perro)) {
							System.out.println(persona);
						}
					}
					
				}
			}
		}
		
	}

	private void generarAdopcion() {
		
		int contador=0;
		System.out.println("Por favor confirme los datos del adoptande");
		for (Persona persona: personas) {
			contador++;
			System.out.println(contador+") "+persona);
		}
		System.out.println("Si el dato se encuentra registrado ingrese su numero, sino 0");
		int opcionPersona = leer.nextInt()-1;
		if(opcionPersona==-1) {
			System.out.println("Vamos a generar el registro");
			anadirPersona(); // tambien puede redirigir al menu con un mensaje de agradecimiento
			System.out.println("Usuario registrado");
		}
		System.out.println("Estos son los perros disponibles");
		contador=0;
		for (Perro perro: perros) {
			contador++;
			System.out.println(contador+") "+perro.getNombre());
		}
		System.out.println("digite el numero del perro a adoptar, en caso de no estar digite 0");
		int opcionPerro = leer.nextInt()-1;
		if(opcionPerro==-1) {
			System.out.println("Lastimosamente el perro no esta disponible");
			Menu();  // En este caso no se puede crear un nuevo perro porque no existe
		}else {
			if( personas.get(opcionPersona).getPerro()==null) {
				personas.get(opcionPersona).setPerro(perros.get(opcionPerro));
				Perro perroadoptado= perros.get(opcionPerro);
				perros.remove(opcionPerro);
				perrosAdoptados.add(perroadoptado);
				System.out.println("Perro adoptado con exito");
			}else {
				System.out.println("Ya tiene un perro adoptado el cual es:");
				System.out.println(personas.get(opcionPersona).getPerro());
			}
		}
		
		
	}
}
