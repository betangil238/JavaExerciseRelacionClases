package ExtraExercise3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Poliza {
	Scanner leer = new Scanner(System.in);
	private Vehiculo vehiculo; // Important
	private Cliente cliente;   // Important
	private String numPoliza;  // Important
	private Date fechaInicio;
	private Date fechaFinal;
	private int cantidadCuotas; // Important
	private ArrayList<Cuota> cuotas = new ArrayList<>();
	private int formaDePago;
	private int montoAsegurado;
	private boolean granizo;
	private int montoMaximoGranizo= (granizo==false)  ?  0 : leer.nextInt() ;
	private String tipoCobertura;

	public Poliza() {
		super();
	}
	public Poliza(Scanner leer, Vehiculo vehiculo, Cliente cliente, String numPoliza, int cantidadCuotas) {
		super();
		this.leer = leer;
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.numPoliza = numPoliza;
		this.cantidadCuotas = cantidadCuotas;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public int getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(int formaDePago) {
		this.formaDePago = formaDePago;
	}
	public int getMontoAsegurado() {
		return montoAsegurado;
	}
	public void setMontoAsegurado(int montoAsegurado) {
		this.montoAsegurado = montoAsegurado;
	}
	public boolean isGranizo() {
		return granizo;
	}
	public void setGranizo(boolean granizo) {
		this.granizo = granizo;
	}
	public int getMontoMaximoGranizo() {
		return montoMaximoGranizo;
	}
	public void setMontoMaximoGranizo(int montoMaximoGranizo) {
		this.montoMaximoGranizo = montoMaximoGranizo;
	}
	public String getTipoCobertura() {
		return tipoCobertura;
	}
	public void setTipoCobertura(String tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getNumPoliza() {
		return numPoliza;
	}
	public void setNumPoliza(String numPoliza) {
		this.numPoliza = numPoliza;
	}
	public int getCantidadCuotas() {
		return cantidadCuotas;
	}
	public void setCantidadCuotas(int cantidadCuotas) {
		this.cantidadCuotas = cantidadCuotas;
	}
	
	
}
