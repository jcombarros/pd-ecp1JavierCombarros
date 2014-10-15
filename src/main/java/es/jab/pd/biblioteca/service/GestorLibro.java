package es.jab.pd.biblioteca.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.jab.pd.biblioteca.model.Libro;

public class GestorLibro {
	
	private static GestorLibro gestorLibro = null;
	
	private List<Libro> libros;
	
	public GestorLibro(){
		this.setLibros(new ArrayList<Libro>());
	}
	
	public static GestorLibro getInstance(){
		if(GestorLibro.gestorLibro == null){
			GestorLibro.gestorLibro = new GestorLibro(); 
		}
		return GestorLibro.gestorLibro;
	}
	
	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public void darAltaLibro(Libro libro){
		this.libros.add(libro);
	}
	
	public boolean darBajaLibro(Libro libro){
		boolean borrado = false;
		for(Iterator<Libro> it = this.libros.iterator(); it.hasNext(); ){ 
			Libro myLibro = (Libro) it.next();
			if(myLibro.equals(libro)){
				it.remove();
				borrado = true;
			}
		}
		return borrado;
		
	}
	
	public List<Libro> mostrarLibros(){
		return this.getLibros();
	}
	
	public Libro mostrarLibro(String isbn){
		Libro libroAMostrar = null;
		for(Iterator<Libro> it = this.libros.iterator(); it.hasNext(); ){ 
			Libro myLibro = (Libro) it.next();
			String myIsbn = myLibro.getIsbn();
			if(myIsbn.equals(isbn)){
				libroAMostrar = myLibro;
			}
		}
		return libroAMostrar;
	}
}
