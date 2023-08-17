package ExtraExercise2;

import java.util.Arrays;

public class FuncionDeCine {
	private Pelicula pelicula;
	private double precio;
	private String[][] sala = new String[8][6];
	
	
	
	public FuncionDeCine() {
		super();
		generarsala();
	}
	public FuncionDeCine(Pelicula pelicula, double precio) {
		super();
		generarsala();
		this.pelicula = pelicula;
		this.precio = precio;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String[][] getSala() {
		return sala;
	}
	
	
	public void setSala(String[][] sala) {
		this.sala = sala;
	}
	@Override
	public String toString() {
		return "FuncionDeCine [pelicula=" + pelicula + ", precio=" + precio + ", sala=" + Arrays.toString(sala) + "]";
	}
	
	private void generarsala() {
		int valor=9;
		for (int i=0; i< 8;i++) {
			valor--;
			for (int j=0; j<6;j++) {
				switch (j) {
				case 0:
					sala[i][j]=(valor+" A "+"O |");
					break;
				case 1:
					sala[i][j]=(valor+" B "+"O |");
					break;
				case 2:
					sala[i][j]=(valor+" C "+"O |");
					break;
				case 3:
					sala[i][j]=(valor+" D "+"O |");
					break;
				case 4:
					sala[i][j]=(valor+" E "+"O |");
					break;
				case 5:
					sala[i][j]=(valor+" F "+"O |");
					break;
				}
			}
		}
	}
	
	public void imprimirsala() {
		for (int i=0; i< 8;i++) {
			for (int j=0; j<6;j++) {
				System.out.print(sala[i][j]);
			}
			System.out.println();
		}
	}
	
	
	


}
