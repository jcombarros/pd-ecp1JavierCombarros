package es.jab.pd.biblioteca.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.jab.pd.biblioteca.model.Libro;
import es.jab.pd.biblioteca.service.GestorLibro;

public class GestorLibroTest {
	
	private GestorLibro gestorLibro;
	private Libro primerLibro;
	
	@Before
	public void before(){
		gestorLibro = new GestorLibro();
		primerLibro = new Libro("0000", "Harry Potter", "JK Rowling");
		gestorLibro.darAltaLibro(primerLibro);
	}

	@Test
	public void darAltaLibroTest() {
		Libro libro = new Libro("0001","The Lord of the Rings", "RR Tolkien");
		gestorLibro.darAltaLibro(libro);
		assertSame(libro, gestorLibro.getLibros().get(gestorLibro.getLibros().size()-1));
		
	}
	
	@Test
	public void darBajaLibroTest() {
		Libro libro = new Libro("0001","The Lord of the Rings", "RR Tolkien");
		gestorLibro.darAltaLibro(libro);
		
		gestorLibro.darBajaLibro(libro);
		assertNotSame(libro, gestorLibro.getLibros().get(gestorLibro.getLibros().size()-1));
		
	}
	
	@Test
	public void mostrarLibrosTest() {
		Libro libro = new Libro("0001","The Lord of the Rings", "RR Tolkien");
		gestorLibro.darAltaLibro(libro);
		
		Libro[] arrayLibro = new Libro[2];
		arrayLibro[0] = primerLibro;
		arrayLibro[1] = libro;
		assertArrayEquals(arrayLibro, (Libro[]) gestorLibro.getLibros().toArray(new Libro[gestorLibro.getLibros().size()]));
		
	}

	@Test
	public void mostrarLibroTest() {
		Libro libro = new Libro("0001","The Lord of the Rings", "RR Tolkien");
		gestorLibro.darAltaLibro(libro);
		
		assertEquals(libro, gestorLibro.mostrarLibro("0001"));
		
	}
	
}
