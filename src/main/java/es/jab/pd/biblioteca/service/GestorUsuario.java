package es.jab.pd.biblioteca.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.jab.pd.biblioteca.model.Libro;
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
		this.usuarios.add(usuario);
	}
	
	public boolean darBajaUsuario(Usuario usuario){
		boolean borrado = false;
		for(Iterator<Usuario> it = this.usuarios.iterator(); it.hasNext(); ){ 
			Usuario myUsuario = (Usuario) it.next();
			if(myUsuario.equals(usuario)){
				it.remove();
				borrado = true;
			}
		}
		return borrado;
	}
	
	public List<Usuario> mostrarUsuarios(){
		return this.getUsuarios();
	}

}
