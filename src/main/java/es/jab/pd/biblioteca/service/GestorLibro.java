package es.jab.pd.biblioteca.service;

import java.util.ArrayList;
import java.util.List;

import es.jab.pd.biblioteca.model.Libro;

public class GestorLibro {
	
	private List<Libro> libros;
	
	public GestorLibro(){
		this.setLibros(new ArrayList<Libro>());
	}
	
	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public void darAltaLibro(Libro libro){
		
	}
	
	public void darBajaLibro(Libro libro){
		
	}
	
	public List<Libro> mostrarLibros(){
		return null;
	}
	
	public Libro mostrarLibro(String isbn){
		return null;
	}

}