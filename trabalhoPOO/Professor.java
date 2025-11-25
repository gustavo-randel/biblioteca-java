package trabalhoPOO;

public class Professor extends Usuario{

	protected String materia;
	
	public Professor(String nome, int matricula, String tipo, String materia){
		super(nome, matricula, tipo);
		this.materia = materia;
	}
	
	public double calcularMulta() {
		
		return 0;
		
	}
}
