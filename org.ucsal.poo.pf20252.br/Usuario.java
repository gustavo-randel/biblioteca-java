package org.ucsal.poo.pf20252.br;

public abstract class Usuario {

    protected String nome;
    protected int matricula;
    protected int tipo;

    public Usuario(String nome, int matricula, int tipo) {
        this.nome = nome;
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public int getTipo() { return tipo; }
    public void setTipo(int tipo) { this.tipo = tipo; }

    public abstract double calcularMulta(int diaEmprestimo, int diaDevolucao);
}