package es.jab.pd.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class GestorPrestamo {
	
	private List<Prestamo> prestamos;
	
	public GestorPrestamo(){
		this.prestamos = new ArrayList<Prestamo>();
	}
	
	public void prestarLibro(){
		
	}
	
	public void devolverLibro(Libro libro){
		
	}
	
	public List<Prestamo> mostrarPrestamos(){
		return null;
	}
	
	public Prestamo mostrarPrestamoPorLibro(String isbn){
		return null;
	}

}
