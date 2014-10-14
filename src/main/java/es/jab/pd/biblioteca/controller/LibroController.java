package es.jab.pd.biblioteca.controller;

import java.util.List;

import upm.jbb.IO;
import es.jab.pd.biblioteca.model.Libro;
import es.jab.pd.biblioteca.service.GestorLibro;

public class LibroController {
	
	private GestorLibro gestorLibro;
	
	public LibroController(){
		this.gestorLibro = new GestorLibro();
	}
	
	public void darAltaLibro(){
		Libro libro = (Libro) IO.in.read(Libro.class, "Crear un nuevo Libro: ");
		gestorLibro.darAltaLibro(libro);
		IO.out.println("Libro añadido a la biblioteca.");
	}
	
	public void darBajaLibro(){
		Libro libro = (Libro) IO.in.select((Libro[])gestorLibro.getLibros().toArray(), "Seleccionar un libro para eliminar: ");
		gestorLibro.darBajaLibro(libro);
		IO.out.println("Libro eliminado de la biblioteca.");
		
	}
	
	public void mostrarLibros(){
		List<Libro> libros = gestorLibro.mostrarLibros();
		for(Libro libro : libros){
			IO.out.println("Libro: " + libro);
		}
	}
	
	public void mostrarLibro(){
		//suponemos que recuperamos el isbn para usar el servicio de mostrarLibro() por isbn
		String isbn = ((Libro) IO.in.select((Libro[])gestorLibro.getLibros().toArray(), "Seleccionar un libro para eliminar: ")).getIsbn();
		Libro libro = gestorLibro.mostrarLibro(isbn);
		IO.out.println("Libro seleccionado: " + libro.toString());
	}

}
