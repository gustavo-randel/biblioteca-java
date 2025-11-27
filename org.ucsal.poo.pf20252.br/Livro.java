package org.ucsal.poo.pf20252.br;

public class Livro extends Publicacao implements Emprestavel{
	
	protected int isbn;
	
	 public Livro(String titulo, String autor, int ano,int isbn){
		super(titulo, autor, ano);
		this.isbn = isbn;
		
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String exibirDados() {
		 return  "| " + this.titulo + " | " + this.autor + " | "  + this.ano + " | ISBN: "  + this.isbn + " |" ;
	}
	 
}
