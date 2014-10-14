package es.jab.pd.biblioteca;

import upm.jbb.IO;

public class MainBiblioteca {

	public static void main(String[] args) {
		IO.in.addController(new LibroController());
		IO.in.addController(new UsuarioController());
		IO.in.addController(new PrestamoController());
	}

}
