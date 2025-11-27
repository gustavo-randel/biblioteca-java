package org.ucsal.poo.pf20252.br;

public class Professor extends Usuario {

    private String materia;

    public Professor(String nome, int matricula, int tipo, String materia) {
        super(nome, matricula, tipo);
        this.materia = materia;
    }

    public String getMateria() { return materia; }
    public void setMateria(String materia) { this.materia = materia; }

    @Override
    public double calcularMulta(int diaEmprestimo, int diaDevolucao) {
        double multa = 0.0;
        int dias = diaDevolucao - diaEmprestimo;
        if (dias > 14) {
            multa = 5.0 * (dias - 14);
        }
        return multa;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + " | Matrícula: " + matricula + " | Matéria: " + materia;
    }
}