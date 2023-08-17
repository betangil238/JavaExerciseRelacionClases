package ExtraExercise3;

import java.util.Date;

public class Cuota {
	private String numCuota;
	private double montoAPagar;
	private boolean pagada;
	private Date fechaVencimiento;
	private String formaDePago;
	public Cuota(String numCuota, double montoAPagar, boolean pagada, Date fechaVencimiento, String formaDePago) {
		super();
		this.numCuota = numCuota;
		this.montoAPagar = montoAPagar;
		this.pagada = pagada;
		this.fechaVencimiento = fechaVencimiento;
		this.formaDePago = formaDePago;
	}
	public Cuota() {
		super();
	}
	public String getNumCuota() {
		return numCuota;
	}
	public double getMontoAPagar() {
		return montoAPagar;
	}
	public boolean isPagada() {
		return pagada;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public String getFormaDePago() {
		return formaDePago;
	}
	public void setNumCuota(String numCuota) {
		this.numCuota = numCuota;
	}
	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}
	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	
}
