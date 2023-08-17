package ExtraExercise3;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private int año;
	private String numMotor;
	private String numChasis;
	private String color;
	private String tipo;
	public Vehiculo(String marca, String modelo, int año, String numMotor, String numChasis, String color,
			String tipo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.numMotor = numMotor;
		this.numChasis = numChasis;
		this.color = color;
		this.tipo = tipo;
	}
	public Vehiculo() {
		super();
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getNumMotor() {
		return numMotor;
	}
	public void setNumMotor(String numMotor) {
		this.numMotor = numMotor;
	}
	public String getNumChasis() {
		return numChasis;
	}
	public void setNumChasis(String numChasis) {
		this.numChasis = numChasis;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", numMotor=" + numMotor
				+ ", numChasis=" + numChasis + ", color=" + color + ", tipo=" + tipo + "]";
	}

}
