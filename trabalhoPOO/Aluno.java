package trabalhoPOO;

public class Aluno extends Usuario{
	
	protected String turma;
	
	Aluno(String nome, int matricula, int tipo, String turma){
		super(nome, matricula, tipo);
		this.turma = turma;
		
	}
	
	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public double calcularMulta(int dia1, int dia2) {
		double multa = 0;
		
		if(dia2 - dia1 > 14){
			multa = 2.50 * (dia2 - dia1 - 14);
		}
		
		return multa;
		
	}
	
}
