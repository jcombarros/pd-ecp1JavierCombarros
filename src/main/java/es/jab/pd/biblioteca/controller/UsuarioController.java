package es.jab.pd.biblioteca.controller;

import java.util.List;

import upm.jbb.IO;
import es.jab.pd.biblioteca.model.Libro;
import es.jab.pd.biblioteca.model.Usuario;
import es.jab.pd.biblioteca.service.GestorUsuario;

public class UsuarioController {
	
	private GestorUsuario gestorUsuario;
	
	public UsuarioController(){
		this.gestorUsuario = new GestorUsuario();
	}
	
	public void darAltaUsuario(){
		Usuario usuario = (Usuario) IO.in.read(Usuario.class, "Dar de alta a un nuevo Usuario: ");
		if(usuario!=null){
			gestorUsuario.darAltaUsuario(usuario);
			IO.out.println("Usuario dado de alta en el sistema.");
		}
		else{
			IO.out.println("Usuario no guardado.");
		}
	}
	
	public void darBajaUsuario(){
		Usuario usuario = (Usuario) IO.in.select((Usuario[])gestorUsuario.getUsuarios().toArray(new Usuario[gestorUsuario.getUsuarios().size()]), "Seleccionar un usuario a eliminar: ");
		if(gestorUsuario.darBajaUsuario(usuario)){
			IO.out.println("Usuario dado de baja en el sistema.");
		}
		else{
			IO.out.println("Usuario no encontrado.");
		}
	}
	
	public void mostrarUsuarios(){
		List<Usuario> usuarios = gestorUsuario.mostrarUsuarios(); 
		boolean hayUsuarios = false;
		for(Usuario usuario : usuarios){
			hayUsuarios = true;
			IO.out.println("Usuario: " + usuario.toString());
		}
		if(!hayUsuarios){
			IO.out.println("No hay usuarios en el sistema.");
		}
	}


}
