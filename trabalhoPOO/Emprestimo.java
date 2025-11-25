package trabalhoPOO;

public class Emprestimo {
	
	protected String dataEmprestimo;
	protected String dataDevolucao;
	protected boolean status;
	
	
	public Emprestimo(String dataEmprestimo, String dataDevolucao, boolean status) {
		
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.status = status;
		
	}
}
