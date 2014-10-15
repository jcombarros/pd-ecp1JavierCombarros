package es.jab.pd.biblioteca.model;

public class Prestamo {
	
	private Libro libro;
	private Usuario usuario;
	private String fechaInicio;
	private String fechaFin;

	public Prestamo(Libro libro, Usuario usuario, String fechaInicio, String fechaFin) {
		this.setLibro(libro);
		this.setUsuario(usuario);
		this.setFechaInicio(fechaInicio);
		this.setFechaFin(fechaFin);
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public String toString(){
		return "Prestamo de" + this.libro.getTitulo() 
				+ ", a " + this.usuario.getNombre() + ". Desde: " + this.fechaInicio + " hasta " + this.fechaFin;
	}
	
	public boolean esIgual(Object obj){
		return this.libro.esIgual(((Prestamo)obj).libro) 
				&& this.usuario.esIgual(((Prestamo)obj).usuario)
				&& this.fechaInicio == ((Prestamo) obj).fechaInicio
				&& this.fechaFin == ((Prestamo) obj).fechaFin;
	}

}
