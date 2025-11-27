package org.ucsal.poo.pf20252.br;

public class Emprestimo {

    private Usuario usuario;
    private Livro livro;
    private int dataEmprestimo;
    private Integer dataDevolucao;
    private boolean ativo;

    public Emprestimo(Usuario usuario, Livro livro, int dataEmprestimo) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = null;
        this.ativo = true;
    }

    public Usuario getUsuario() { return usuario; }
    public Livro getLivro() { return livro; }

    public int getDataEmprestimo() { return dataEmprestimo; }

    public Integer getDataDevolucao() { return dataDevolucao; }
    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
        this.ativo = false;
    }

    public boolean isAtivo() { return ativo; }

    @Override
    public String toString() {
        return "Emprestimo{ usuario=" + usuario.getNome() +
               ", livro=" + livro.getTitulo() +
               ", dataEmp=" + dataEmprestimo +
               ", dataDev=" + (dataDevolucao == null ? "-" : dataDevolucao) +
               ", ativo=" + ativo + " }";
    }
}