package trabalhoPOO;

public abstract class Publicacao{

	protected String titulo;
	protected String autor;
	protected int ano;
	
	public Publicacao(String titulo, String autor, int ano){
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	
}
