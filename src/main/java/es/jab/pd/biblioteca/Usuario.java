package es.jab.pd.biblioteca;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private String dni;

	public Usuario(String nombre, String apellido, String dni) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String toString(){
		return this.nombre + " " + this.apellido + ": " + this.dni;
	}
	
	public boolean equals(Object obj){
		return this.nombre == ((Usuario) obj).nombre
				&& this.apellido == ((Usuario) obj).apellido
				&& this.dni == ((Usuario) obj).dni;
	}

}
