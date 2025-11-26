package org.ucsal.poo.pf20252.br;

public class Professor extends Usuario{

	protected String materia;
	
	public Professor(String nome, int matricula, int tipo, String materia){
		super(nome, matricula, tipo);
		this.materia = materia;
	
	}
	
	
	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public double calcularMulta(int dia1, int dia2) {
		double multa = 0;
		
		if(dia2 - dia1 > 14){
			multa = 5 * (dia2 - dia1 - 14);
		}
		
		return multa;
		
	}
}
