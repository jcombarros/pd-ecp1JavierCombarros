package es.jab.pd.biblioteca;

import upm.jbb.IO;

public class MainBiblioteca {

	public static void main(String[] args) {
		IO.in.addController(new GestorLibro());
		IO.in.addController(new GestorUsuario());
		IO.in.addController(new GestorPrestamo());
	}

}
