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


	public String getDataEmprestimo() {
		return dataEmprestimo;
	}


	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}


	public String getDataDevolucao() {
		return dataDevolucao;
	}


	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
}
