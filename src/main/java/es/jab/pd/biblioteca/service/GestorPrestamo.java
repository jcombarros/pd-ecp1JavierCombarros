package es.jab.pd.biblioteca.service;

import java.util.ArrayList;
import java.util.List;

import es.jab.pd.biblioteca.model.Libro;
import es.jab.pd.biblioteca.model.Prestamo;

public class GestorPrestamo {
	
	private List<Prestamo> prestamos;
	
	public GestorPrestamo(){
		this.setPrestamos(new ArrayList<Prestamo>());
	}
	
	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public void prestarLibro(Prestamo prestamo){
		
	}
	
	public void devolverLibro(Libro libro){
		
	}
	
	public List<Prestamo> mostrarPrestamos(){
		return null;
	}
	
	public Prestamo mostrarPrestamoPorLibro(Libro libro){
		return null;
	}

}
