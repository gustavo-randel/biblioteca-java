package org.ucsal.poo.pf20252.br;

import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899, 1);
		Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 2);
		Livro livro3 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937, 3);
		Livro livro4 = new Livro("1984", "George Orwell", 1949, 4);
		Livro livro5 = new Livro("A Culpa é das Estrelas", "John Green", 2012, 5);
		System.out.println(livro1.exibirDados());
		Emprestimo emp1 = new Emprestimo(0, 0, false);
		Emprestimo emp2 = new Emprestimo(0, 0, false);
		Emprestimo emp3 = new Emprestimo(0, 0, false);
		Emprestimo emp4 = new Emprestimo(0, 0, false);
		Emprestimo emp5 = new Emprestimo(0, 0, false);

		int dataEmp = 0, dataDev = 0;
				
		int tipoUsuario;
		String nome, materia = null, turma;
		int matricula;
		int op;  
		String menu = """
				---------MENU---------
				1. Consultar livros disponiveis
				2. Empréstimos
				3. Devoluções
				4. sair
				""";
		System.out.println("Seja bem vindo a biblioteca Felicidade! ");

		System.out.println("Digite 1 para Professor / 2 para Aluno: ");
        int tipoUser = sc.nextInt();

        if (tipoUser == 1) {
            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("Matéria: ");
            materia = sc.next();
            System.out.print("Matrícula: ");
            matricula = sc.nextInt();
            Professor p1 = new Professor(nome, matricula, 1, materia);
            System.out.println("Professor cadastrado!");
        } else {
            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("Turma: ");
            turma = sc.next();
            System.out.print("Matrícula: ");
           matricula = sc.nextInt();
            Aluno a1 = new Aluno(nome, matricula, 2, materia);
            System.out.println("Aluno cadastrado!");
        }
        	
		do { System.out.println(menu);
			op=sc.nextInt();
			
			switch (op) {
				case 1:
					
					System.out.println("----- LIVROS DISPONÍVEIS -----");
					System.out.println(livro1.exibirDados());
					System.out.println(livro2.exibirDados());
					System.out.println(livro3.exibirDados());
					System.out.println(livro4.exibirDados());
					System.out.println(livro5.exibirDados());

					break;
				case 2:
					
				    System.out.println("----- REALIZAR EMPRÉSTIMO -----");

				    System.out.println("----- LIVROS DISPONÍVEIS -----");
				    System.out.println(livro1.getTitulo() + "" + livro1.getIsbn());
				    System.out.println(livro2.getTitulo() + "" + livro2.getIsbn());
				    System.out.println(livro3.getTitulo() + "" + livro3.getIsbn());
				    System.out.println(livro4.getTitulo() + "" + livro4.getIsbn());
				    System.out.println(livro5.getTitulo() + "" + livro5.getIsbn());


				    System.out.println("Digite o ISBN do livro que deseja emprestar:");
				    int idLivro = sc.nextInt();

				    Livro escolhido = null;

				    if (idLivro == livro1.getIsbn()) escolhido = livro1;
				    else if (idLivro == livro2.getIsbn()) escolhido = livro2;
				    else if (idLivro == livro3.getIsbn()) escolhido = livro3;
				    else if (idLivro == livro4.getIsbn()) escolhido = livro4;
				    else if (idLivro == livro5.getIsbn()) escolhido = livro5;

				    if (escolhido == null) {
				        System.out.println("Livro não encontrado!");
				        break;
				    }
				    System.out.println("Digite o dia do empréstimo (ex: 1):");
				    dataEmp = sc.nextInt();

				    emp1.setDataEmprestimo(dataEmp);
				    emp1.setStatus(true);
				    emp1.setDataDevolucao(0);

				    System.out.println("Empréstimo realizado com sucesso!");
				    System.out.println("Livro: " + escolhido.getTitulo());
				    break;
				case 3:
					System.out.println("----- DEVOLUÇÃO DE LIVRO -----");

				    if (!emp1.isStatus()) {
				        System.out.println("Nenhum livro está emprestado no momento.");
				        break;
				    }

				    System.out.println("Livro emprestado no momento: ");
				    System.out.println("Data do empréstimo: " + emp1.getDataEmprestimo());
				    System.out.println("Informe a data da devolução (ex: 1):");
				    dataDev = sc.nextInt();

				    emp1.setDataDevolucao(dataDev);
				    emp1.setStatus(false);

				    if (tipoUser == 1) {
						Aluno a1 = null;
						double Multa = a1.calcularMulta(dataEmp, dataDev);
			        } else {
			        	Professor p1 = null;
						double Multa = p1.calcularMulta(dataEmp, dataDev);
			        }

				    System.out.println("Devolução registrada com sucesso!");
				    System.out.println("Data da devolução: " + dataDev);
				    break;

				case 4:
					System.out.println("Fim do Programa");
					break;
			} 
		} while (op!=4);
	}
}
