package org.ucsal.poo.pf20252.br;

public class Livro extends Publicacao implements Emprestavel {

    private int isbn;

    public Livro(String titulo, String autor, int ano, int isbn) {
        super(titulo, autor, ano);
        this.isbn = isbn;
    }

    public int getIsbn() { return isbn; }
    public void setIsbn(int isbn) { this.isbn = isbn; }

    @Override
    public String exibirDados() {
        return "| " + this.titulo + " | " + this.autor + " | " + this.ano + " | ISBN: " + this.isbn + " |";
    }

    @Override
    public void emprestar() {
        System.out.println("Livro \"" + this.titulo + "\" (ISBN " + this.isbn + ") emprestado.");
    }

    @Override
    public void devolver() {
        System.out.println("Livro \"" + this.titulo + "\" (ISBN " + this.isbn + ") devolvido.");
    }
}
