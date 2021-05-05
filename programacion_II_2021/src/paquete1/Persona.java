package paquete1;

public class Persona {
	
	private String apellido;
	private String nombre;

	
	public Persona(String apellido, String nombre) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [apellido=" + apellido + ", nombre=" + nombre + "]";
	}
	
	
}
