package trabalhoPOO;

public abstract class Usuario {
	
	protected String nome;
	protected int matricula;
	protected String tipo;
	
	public Usuario(String nome, int matricula, String tipo) {
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
	}

	public double calcularMulta() {
		
		return 0;
		
	}
}
