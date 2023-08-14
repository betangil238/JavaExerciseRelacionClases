package Exercise1;

public class MainAdopcion {
	public static void main(String[] args) {
		Perro perro1 = new Perro("Lucas", "Criollo",11,"mediano");
		Perro perro2 = new Perro("Kira","Husky",3,"Grande");
		Persona persona1= new Persona("Daniel","Betancur",28,"101722",perro2);
		Persona persona2= new Persona("Juan Pablo","Betancur",26,"10366",perro1);
		System.out.println(persona1.getNombre()+" Tiene como  "+persona1.getPerro()+ "sus datos son: "+persona1);
		System.out.println(persona2.getNombre()+" Tiene como  "+persona2.getPerro()+ "sus datos son: "+persona2);
	}
}
