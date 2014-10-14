package es.jab.pd.biblioteca.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.jab.pd.biblioteca.model.Libro;
import es.jab.pd.biblioteca.model.Prestamo;
import es.jab.pd.biblioteca.model.Usuario;
import es.jab.pd.biblioteca.service.GestorPrestamo;

public class GestorPrestamoTest {

	private GestorPrestamo gestorPrestamo;
	private Prestamo primerPrestamo;
	private Libro primerLibro;
	private Usuario usuario;
	
	@Before
	public void before(){
		gestorPrestamo = new GestorPrestamo();
		
		primerLibro = new Libro("0000", "Harry Potter", "JK Rowling");
		usuario = new Usuario("Javier", "Combarros", "00000A");
		primerPrestamo = new Prestamo(primerLibro, usuario, "23/10/2014", "23/11/2014");
		
		gestorPrestamo.prestarLibro(primerPrestamo);
	}

	@Test
	public void prestarLibroTest() {
		Libro libro = new Libro("0001","The Lord of the Rings", "RR Tolkien");
		Prestamo prestamo = new Prestamo(libro, usuario, "23/10/2014", "23/11/2014");
		gestorPrestamo.prestarLibro(primerPrestamo);
		
		assertSame(prestamo, gestorPrestamo.getPrestamos().get(gestorPrestamo.getPrestamos().size()));
		
	}
	
	@Test
	public void devolverLibroTest() {
		Libro libro = new Libro("0001","The Lord of the Rings", "RR Tolkien");
		Prestamo prestamo = new Prestamo(libro, usuario, "23/10/2014", "23/11/2014");
		gestorPrestamo.prestarLibro(primerPrestamo);
		
		gestorPrestamo.devolverLibro(libro);
		assertNotSame(prestamo, gestorPrestamo.getPrestamos().get(gestorPrestamo.getPrestamos().size()));
		
	}
	
	@Test
	public void mostrarPrestamosTest() {
		Libro libro = new Libro("0001","The Lord of the Rings", "RR Tolkien");
		Prestamo prestamo = new Prestamo(libro, usuario, "23/10/2014", "23/11/2014");
		gestorPrestamo.prestarLibro(primerPrestamo);
		
		Prestamo[] arrayPrestamos = new Prestamo[2];
		arrayPrestamos[0] = primerPrestamo;
		arrayPrestamos[1] = prestamo;
		assertArrayEquals(arrayPrestamos, (Prestamo[]) gestorPrestamo.getPrestamos().toArray(new Prestamo[gestorPrestamo.getPrestamos().size()]));
		
	}

	@Test
	public void mostrarPrestamoPorLibroTest() {
		Libro libro = new Libro("0001","The Lord of the Rings", "RR Tolkien");
		Prestamo prestamo = new Prestamo(libro, usuario, "23/10/2014", "23/11/2014");
		gestorPrestamo.prestarLibro(primerPrestamo);
		
		assertEquals(prestamo, gestorPrestamo.mostrarPrestamoPorLibro(libro));
		
	}

}
