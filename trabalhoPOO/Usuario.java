package trabalhoPOO;

public abstract class Usuario {
	
	protected String nome;
	protected int matricula;
	protected int tipo;
	
	public Usuario(String nome, int matricula, int tipo) {
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
	}

	public double calcularMulta(int dia1, int dia2) {
		
		return 0;
		
	}
}
