package ExtraExercise3;

public class Cliente {
	private String nombre;
	private String apellido;
	private String documento;
	private String email;
	private String ciudad;
	private String telefono;
		
	public Cliente() {
		super();
	}
	public Cliente(String nombre, String apellido, String documento, String email, String ciudad, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.email = email;
		this.ciudad = ciudad;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", email=" + email
				+ ", ciudad=" + ciudad + ", telefono=" + telefono + "]";
	}
	
}
