package trabalhoPOO;

public class Aluno extends Usuario{
	
	protected String turma;
	
	Aluno(String nome, int matricula, String tipo, String turma){
		super(nome, matricula, tipo);
		this.turma = turma;
		
	}

	public String calcularMulta(int dias) {
		double multa = 0;
		
		if(dias > 14){
			
		}
		
		return "Sua multa é: " + multa + " $";
		
	}
	
}
