package trabalhoPOO;

public class Livro extends Publicacao{
	
	protected int isbn;
	
	 public Livro(String titulo, String autor, int ano,int isbn){
		super(titulo, autor, ano);
		this.isbn = isbn;
	}
}
