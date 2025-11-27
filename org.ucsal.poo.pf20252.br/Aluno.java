package org.ucsal.poo.pf20252.br;

public class Aluno extends Usuario {

    private String turma;

    public Aluno(String nome, int matricula, int tipo, String turma) {
        super(nome, matricula, tipo);
        this.turma = turma;
    }

    public String getTurma() { return turma; }
    public void setTurma(String turma) { this.turma = turma; }

    @Override
    public double calcularMulta(int diaEmprestimo, int diaDevolucao) {
        double multa = 0.0;
        int dias = diaDevolucao - diaEmprestimo;
        if (dias > 14) {
            multa = 2.50 * (dias - 14);
        }
        return multa;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Matrícula: " + matricula + " | Turma: " + turma;
    }
}



