package org.ucsal.poo.pf20252.br;

public class Emprestimo {
	
	protected int dataEmprestimo;
	protected int dataDevolucao;
	protected boolean status;
	
	
	public Emprestimo(int dataEmprestimo, int dataDevolucao, boolean status) {
		
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.status = status;
	
	}


	public int getDataEmprestimo() {
		return dataEmprestimo;
	}


	public void setDataEmprestimo(int dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}


	public int getDataDevolucao() {
		return dataDevolucao;
	}


	public void setDataDevolucao(int dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
}
