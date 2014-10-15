package es.jab.pd.biblioteca.controller;

import java.util.List;

import upm.jbb.IO;
import es.jab.pd.biblioteca.model.Libro;
import es.jab.pd.biblioteca.service.GestorLibro;

public class LibroController {
	
	private GestorLibro gestorLibro;
	
	public LibroController(){
		this.gestorLibro = GestorLibro.getInstance();
	}
	
	public void darAltaLibro(){
		Libro libro = (Libro) IO.in.read(Libro.class, "Crear un nuevo Libro: ");
		if(libro!=null){
			gestorLibro.darAltaLibro(libro);
			IO.out.println("Libro añadido a la biblioteca.");
		}else{
			IO.out.println("Libro no guardado.");
		}
	}
	
	public void darBajaLibro(){
		Libro libro = (Libro) IO.in.select((Libro[])gestorLibro.getLibros().toArray(new Libro[gestorLibro.getLibros().size()]), "Seleccionar un libro para eliminar: ");
		if(gestorLibro.darBajaLibro(libro)){
			IO.out.println("Libro eliminado de la biblioteca.");
		}
		else{
			IO.out.println("Libro no encontrado.");
		}
		
	}
	
	public void mostrarLibros(){
		List<Libro> libros = gestorLibro.mostrarLibros(); 
		boolean hayLibros = false;
		if(libros!=null){
			for(Libro libro : libros){
				hayLibros = true;
				IO.out.println("Libro: " + libro.toString());
			}
		}
		if(!hayLibros){
			IO.out.println("Biblioteca sin libros.");
		}
	}
	
	public void mostrarLibro(){
		//suponemos que recuperamos el isbn para usar el servicio de mostrarLibro() por isbn
		String isbn = ((Libro) IO.in.select((Libro[])gestorLibro.getLibros().toArray(new Libro[gestorLibro.getLibros().size()]), "Seleccionar un libro para eliminar: ")).getIsbn();
		Libro libro = gestorLibro.mostrarLibro(isbn);
		if(libro != null){
			IO.out.println("Libro seleccionado: " + libro.toString());
		}
		else{
			IO.out.println("Libro no encontrado.");
		}
	}

}
