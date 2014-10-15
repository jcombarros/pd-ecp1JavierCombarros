package es.jab.pd.biblioteca.controller;

import java.util.List;

import upm.jbb.IO;
import es.jab.pd.biblioteca.model.Libro;
import es.jab.pd.biblioteca.model.Prestamo;
import es.jab.pd.biblioteca.model.Usuario;
import es.jab.pd.biblioteca.service.GestorLibro;
import es.jab.pd.biblioteca.service.GestorPrestamo;
import es.jab.pd.biblioteca.service.GestorUsuario;

public class PrestamoController {
	
	private GestorPrestamo gestorPrestamo;
	
	public PrestamoController(){
		this.gestorPrestamo = GestorPrestamo.getInstance();
	}
	
	public void prestarLibro(){
		List<Libro> libros = GestorLibro.getInstance().getLibros();
		Libro[] librosArray = libros.toArray(new Libro[libros.size()]);
		Libro libro =  (Libro) IO.in.select(librosArray, "Seleccionar un libro para realizar el prestamo: ");
		
		List<Usuario> usuarios = GestorUsuario.getInstance().getUsuarios();
		Usuario usuario = (Usuario) IO.in.select((Usuario[])usuarios.toArray(new Usuario[usuarios.size()]), "Seleccionar el usuario: ");
		
		String fechaInicio = (String) IO.in.readString("Introduzca la fecha de inicio del prestamo: ");
		String fechaFin = (String) IO.in.readString("Introduzca la fecha de inicio del prestamo: ");
		
		Prestamo prestamo = new Prestamo(libro, usuario, fechaInicio, fechaFin);
		if(prestamo!=null){
			gestorPrestamo.prestarLibro(prestamo);
			IO.out.println("Prestamo realizado correctamente.");
		}

	}
	
	public void devolverLibro(){
		List<Libro> libros = GestorLibro.getInstance().getLibros();
		Libro libro = (Libro) IO.in.select((Libro[])libros.toArray(new Libro[libros.size()]), "Seleccionar un libro para realizar el prestamo: ");
		if(gestorPrestamo.devolverLibro(libro)){
			IO.out.println("Se ha realizado la devolución correctamente.");
		}
		else{
			IO.out.println("No se ha podido realizar la devolución, el libro no está prestado.");
		}
	}
	
	public void mostrarPrestamos(){
		List<Prestamo> prestamos = gestorPrestamo.mostrarPrestamos();
		boolean hayPrestamos = false;
		if(prestamos!=null){
			for(Prestamo prestamo : prestamos){
				hayPrestamos = true;
				IO.out.println("Prestamo: " + prestamo.toString());
			}
		}
		if(!hayPrestamos){
			IO.out.println("No hay libros prestados.");
		}
	}
	
	public void mostrarPrestamoPorLibro(){
		List<Libro> libros = GestorLibro.getInstance().getLibros();
		Libro libro = (Libro) IO.in.select((Libro[])libros.toArray(new Libro[libros.size()]), "Seleccionar un libro para visualizar su estado: ");
		Prestamo prestamo = gestorPrestamo.mostrarPrestamoPorLibro(libro);
		if(prestamo != null){
			IO.out.println("Prestamo: " + prestamo.toString());

		}
		else{
			IO.out.println("El libro no se encuentra prestado");
		}
	}

}
