package org.ucsal.poo.pf20252.br;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Livro> livros = new ArrayList<>();
        List<Emprestimo> emprestimos = new ArrayList<>();

        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899, 1));
        livros.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 2));
        livros.add(new Livro("O Hobbit", "J.R.R. Tolkien", 1937, 3));
        livros.add(new Livro("1984", "George Orwell", 1949, 4));
        livros.add(new Livro("A Culpa é das Estrelas", "John Green", 2012, 5));

        System.out.println("Seja bem vindo a biblioteca Felicidade!");
        
        Usuario usuarioLogado = null;
        System.out.print("Digite 1 para Professor / 2 para Aluno: ");
        int tipoUser = sc.nextInt();
        sc.nextLine(); 

        if (tipoUser == 1) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Matéria: ");
            String materia = sc.nextLine();
            System.out.print("Matrícula: ");
            int matricula = sc.nextInt();
            usuarioLogado = new Professor(nome, matricula, 1, materia);
            System.out.println("Professor cadastrado!");
        } else {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Turma: ");
            String turma = sc.nextLine();
            System.out.print("Matrícula: ");
            int matricula = sc.nextInt();
            usuarioLogado = new Aluno(nome, matricula, 2, turma);
            System.out.println("Aluno cadastrado!");
        }

        int op = 0;
        do {
            System.out.println();
            System.out.println("---------MENU---------");
            System.out.println("1. Consultar livros disponíveis");
            System.out.println("2. Realizar empréstimo");
            System.out.println("3. Realizar devolução");
            System.out.println("4. Listar empréstimos");
            System.out.println("5. Trocar de usuário");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("----- LIVROS DISPONÍVEIS -----");
                    for (Livro l : livros) {
                        boolean disponivel = true;
                        for (Emprestimo e : emprestimos) {
                            if (e.isAtivo() && e.getLivro().getIsbn() == l.getIsbn()) {
                                disponivel = false;
                                break;
                            }
                        }
                        System.out.println(l.exibirDados() + " Disponível: " + (disponivel ? "SIM" : "NÃO"));
                    }
                    break;

                case 2:
                    System.out.println("----- REALIZAR EMPRÉSTIMO -----");
                    System.out.println("Livros:");
                    for (Livro l : livros) {
                        System.out.println(l.getIsbn() + " - " + l.getTitulo());
                    }
                    System.out.print("Digite o ISBN do livro que deseja emprestar: ");
                    int isbnEmp = sc.nextInt();

                    Livro escolhido = null;
                    for (Livro l : livros) {
                        if (l.getIsbn() == isbnEmp) {
                            escolhido = l;
                            break;
                        }
                    }

                    if (escolhido == null) {
                        System.out.println("Livro não encontrado!");
                        break;
                    }

                    boolean disponivel = true;
                    for (Emprestimo e : emprestimos) {
                        if (e.isAtivo() && e.getLivro().getIsbn() == escolhido.getIsbn()) {
                            disponivel = false;
                            break;
                        }
                    }

                    if (!disponivel) {
                        System.out.println("Livro indisponível no momento.");
                        break;
                    }

                    System.out.print("Digite o dia do empréstimo (ex: 1): ");
                    int dataEmp = sc.nextInt();

                    Emprestimo novo = new Emprestimo(usuarioLogado, escolhido, dataEmp);
                    emprestimos.add(novo);
                    escolhido.emprestar();
                    System.out.println("Empréstimo realizado com sucesso!");
                    break;

                case 3:
                    System.out.println("----- DEVOLUÇÃO DE LIVRO -----");
                    System.out.print("Digite o ISBN do livro a devolver: ");
                    int isbnDev = sc.nextInt();

                    Emprestimo emprestimoAtivo = null;
                    for (Emprestimo e : emprestimos) {
                        if (e.isAtivo() && e.getLivro().getIsbn() == isbnDev) {
                            emprestimoAtivo = e;
                            break;
                        }
                    }

                    if (emprestimoAtivo == null) {
                        System.out.println("Não há empréstimo ativo para esse livro.");
                        break;
                    }

                    System.out.println("Data do empréstimo: " + emprestimoAtivo.getDataEmprestimo());
                    System.out.print("Informe a data da devolução (ex: 1): ");
                    int dataDev = sc.nextInt();

                    emprestimoAtivo.setDataDevolucao(dataDev);
                    emprestimoAtivo.getLivro().devolver();
                    double multa = emprestimoAtivo.getUsuario().calcularMulta(emprestimoAtivo.getDataEmprestimo(), dataDev);
                    System.out.printf("Devolução registrada com sucesso! Multa: R$ %.2f%n", multa);
                    break;

                case 4:
                    System.out.println("----- LISTA DE EMPRÉSTIMOS -----");
                    if (emprestimos.isEmpty()) {
                        System.out.println("Nenhum empréstimo registrado.");
                    } else {
                        for (Emprestimo e : emprestimos) {
                            System.out.println(e);
                        }
                    }
                    break;
                 
                case 5:
                	System.out.print("Digite 1 para Professor / 2 para Aluno: ");
                    int tipoUser2 = sc.nextInt();
                    sc.nextLine(); 

                    if (tipoUser2 == 1) {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Matéria: ");
                        String materia = sc.nextLine();
                        System.out.print("Matrícula: ");
                        int matricula = sc.nextInt();
                        usuarioLogado = new Professor(nome, matricula, 1, materia);
                        System.out.println("Professor cadastrado!");
                    } else {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Turma: ");
                        String turma = sc.nextLine();
                        System.out.print("Matrícula: ");
                        int matricula = sc.nextInt();
                        usuarioLogado = new Aluno(nome, matricula, 2, turma);
                        System.out.println("Aluno cadastrado!");
                    }
                	break;

                case 6:
                    System.out.println("Fim do Programa");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (op != 6);

        sc.close();
    }
}