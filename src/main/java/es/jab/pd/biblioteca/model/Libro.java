package es.jab.pd.biblioteca.model;

public class Libro {
	
	private String isbn = "";
	private String titulo = "";
	private String autor = "";

	public Libro(String isbn, String titulo, String autor) {
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setAutor(autor);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString(){
		return this.isbn + ": " + this.titulo + ". By: " + this.autor;
	}
	
	public boolean equals(Object obj){
		return this.isbn == ((Libro) obj).isbn
				&& this.titulo == ((Libro) obj).titulo
				&& this.autor == ((Libro) obj).autor;
	}

}
