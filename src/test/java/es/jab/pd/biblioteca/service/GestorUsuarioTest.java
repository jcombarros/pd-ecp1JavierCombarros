package es.jab.pd.biblioteca.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.jab.pd.biblioteca.model.Usuario;
import es.jab.pd.biblioteca.service.GestorUsuario;

public class GestorUsuarioTest {

	private GestorUsuario gestorUsuario;
	private Usuario primerUsuario;
	
	@Before
	public void before(){
		gestorUsuario = new GestorUsuario();
		primerUsuario = new Usuario("Javier", "Combarros", "00000A");
		gestorUsuario.darAltaUsuario(primerUsuario);
	}

	@Test
	public void darAltaUsuarioTest() {
		Usuario usuario = new Usuario("Harry","Potter", "00001B");
		gestorUsuario.darAltaUsuario(usuario);
		assertSame(usuario, gestorUsuario.getUsuarios().get(gestorUsuario.getUsuarios().size()-1));
		
	}
	
	@Test
	public void darBajaUsuarioTest() {
		Usuario usuario = new Usuario("Harry","Potter", "00001B");
		gestorUsuario.darAltaUsuario(usuario);
		
		gestorUsuario.darBajaUsuario(usuario);
		assertNotSame(usuario, gestorUsuario.getUsuarios().get(gestorUsuario.getUsuarios().size()-1));
		
	}
	
	@Test
	public void mostrarUsuariosTest() {
		Usuario usuario = new Usuario("Harry","Potter", "00001B");
		gestorUsuario.darAltaUsuario(usuario);
		
		Usuario[] arrayUsuario = new Usuario[2];
		arrayUsuario[0] = primerUsuario;
		arrayUsuario[1] = usuario;
		assertArrayEquals(arrayUsuario, (Usuario[]) gestorUsuario.getUsuarios().toArray(new Usuario[gestorUsuario.getUsuarios().size()]));
		
	}

}
