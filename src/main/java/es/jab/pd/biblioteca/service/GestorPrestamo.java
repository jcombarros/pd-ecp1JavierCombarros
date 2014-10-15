package es.jab.pd.biblioteca.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.jab.pd.biblioteca.model.Libro;
import es.jab.pd.biblioteca.model.Prestamo;
import es.jab.pd.biblioteca.model.Usuario;

public class GestorPrestamo {
	
	private static GestorPrestamo gestorPrestamo = null;
	
	private List<Prestamo> prestamos;
	
	public GestorPrestamo(){
		this.setPrestamos(new ArrayList<Prestamo>());
	}
	
	public static GestorPrestamo getInstance(){
		if(GestorPrestamo.gestorPrestamo == null){
			GestorPrestamo.gestorPrestamo = new GestorPrestamo(); 
		}
		return GestorPrestamo.gestorPrestamo;
	}
	
	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public void prestarLibro(Prestamo prestamo){
		this.prestamos.add(prestamo);
	}
	
	public boolean devolverLibro(Libro libro){
		boolean devuelto = false;
		for(Iterator<Prestamo> it = this.prestamos.iterator(); it.hasNext(); ){ 
			Prestamo myPrestamo = (Prestamo) it.next();
			if(myPrestamo.getLibro().esIgual(libro)){
				it.remove();
				devuelto = true;
			}
		}
		return devuelto;	
	}
	
	public List<Prestamo> mostrarPrestamos(){
		return this.getPrestamos();
	}
	
	public Prestamo mostrarPrestamoPorLibro(Libro libro){
		Prestamo prestamo = null;
		for(Iterator<Prestamo> it = this.prestamos.iterator(); it.hasNext(); ){ 
			Prestamo myPrestamo = (Prestamo) it.next();
			if(myPrestamo.getLibro().esIgual(libro)){
				prestamo = myPrestamo;
			}
		}
		return prestamo;
	}

}
