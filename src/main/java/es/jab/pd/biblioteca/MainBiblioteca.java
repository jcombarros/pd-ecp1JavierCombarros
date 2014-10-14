package es.jab.pd.biblioteca;

import es.jab.pd.biblioteca.controller.LibroController;
import es.jab.pd.biblioteca.controller.PrestamoController;
import es.jab.pd.biblioteca.controller.UsuarioController;
import upm.jbb.IO;

public class MainBiblioteca {

	public static void main(String[] args) {
		IO.in.addController(new LibroController());
		IO.in.addController(new UsuarioController());
		IO.in.addController(new PrestamoController());
	}

}
