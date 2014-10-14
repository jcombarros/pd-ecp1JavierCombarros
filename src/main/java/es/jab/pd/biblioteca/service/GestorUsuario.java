package es.jab.pd.biblioteca.service;

import java.util.ArrayList;
import java.util.List;

import es.jab.pd.biblioteca.model.Usuario;

public class GestorUsuario {
	
private List<Usuario> usuarios;
	
	public GestorUsuario(){
		this.setUsuarios(new ArrayList<Usuario>());
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void darAltaUsuario(Usuario usuario){
		
	}
	
	public void darBajaUsuario(Usuario usuario){
		
	}
	
	public void mostrarUsuarios(){
		
	}

}
