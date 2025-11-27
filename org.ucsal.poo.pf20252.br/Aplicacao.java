package org.ucsal.poo.pf20252.br;

import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Professor prof = new Professor(null, 0, 1, null);
		Aluno aluno = new Aluno(null, 0, 2, null);
		Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899, 1);
		Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 2);
		Livro livro3 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937, 3);
		Livro livro4 = new Livro("1984", "George Orwell", 1949, 4);
		Livro livro5 = new Livro("A Culpa é das Estrelas", "John Green", 2012, 5);
		Emprestimo emp = new Emprestimo(null, null, false);
				
		int tipoUsuario;
		String nome, materia, turma;
		int matricula;
		int op;  
		String menu = """
				---------MENU---------
				1. Cadastro de usuários
				2. Consultar livros disponiveis
				3. Empréstimos
				4. Devoluções
				5. Consultas gerais
				6. sair
				""";
		
		do { System.out.println(menu);
			op=sc.nextInt();
			
			switch (op) {
				case 1:
					System.out.println("Qual o tipo do Usuario?\n1. Professor\n2. Aluno");
					tipoUsuario=sc.nextInt();
					if (tipoUsuario==1) {
						System.out.println("Realize o cadastro e coloque as seguintes informações:"
								+ "\n1. Nome do professor:\n2. Matricula:\n3. Materia: ");
						prof.nome = nome=sc.next();
						do {
							matricula = sc.nextInt();

							if (matricula == prof.matricula || matricula == aluno.matricula) {
								System.out.println("ERRO: matrícula já cadastrada! Digite outra.");
							}
						} while (matricula == prof.matricula || matricula == aluno.matricula);
						prof.matricula = matricula;
						materia=sc.next();
						prof.setMateria(materia);
						System.out.println("cadastro realizado!");
						} else {
							if(tipoUsuario==2) {
								System.out.println("Realize o cadastro e coloque as seguintes informações:"
										+ "\n1. Nome do Aluno:\n2. Matricula:\n3. Turma: ");
								aluno.nome = nome=sc.next();
								do {
									matricula = sc.nextInt();
									if (matricula == prof.matricula || matricula == aluno.matricula) {
										System.out.println("ERRO: matrícula já cadastrada! Digite outra.");
									}
								} while (matricula == prof.matricula || matricula == aluno.matricula);
								aluno.matricula = matricula;
								turma=sc.next();
								aluno.setTurma(turma);
								System.out.println("cadastro realizado!");
							}
						}
					break;
				case 2:
					System.out.println("----- LIVROS DISPONÍVEIS -----");
					System.out.println(livro1.getTitulo()+" | "+livro1.getAutor()+" | "+livro1.getAno()+" | ISBN: "+livro1.getIsbn());
					System.out.println(livro2.getTitulo()+" | "+livro2.getAutor()+" | "+livro2.getAno()+" | ISBN: "+livro2.getIsbn());
					System.out.println(livro3.getTitulo()+" | "+livro3.getAutor()+" | "+livro3.getAno()+" | ISBN: "+livro3.getIsbn());
					System.out.println(livro4.getTitulo()+" | "+livro4.getAutor()+" | "+livro4.getAno()+" | ISBN: "+livro4.getIsbn());
					System.out.println(livro5.getTitulo()+" | "+livro5.getAutor()+" | "+livro5.getAno()+" | ISBN: "+livro5.getIsbn());
					break;
				case 3:
				    System.out.println("----- REALIZAR EMPRÉSTIMO -----");

		
				    System.out.println("Quem está pegando o livro?");
				    System.out.println("1. Professor (" + prof.nome + ")");
				    System.out.println("2. Aluno (" + aluno.nome + ")");
				    int tipo = sc.nextInt();

				    if ((tipo == 1 && prof.nome == null) || (tipo == 2 && aluno.nome == null)) {
				        System.out.println("Usuário não cadastrado! Realize o cadastro primeiro.");
				        break;
				    }

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
				    System.out.println("Digite a data do empréstimo (ex: 10/11/2025):");
				    String dataEmp = sc.next();

				    emp.setDataEmprestimo(dataEmp);
				    emp.setStatus(true);
				    emp.setDataDevolucao(null); 

				    System.out.println("Empréstimo realizado com sucesso!");
				    System.out.println("Usuário: " + (tipo == 1 ? prof.nome : aluno.nome));
				    System.out.println("Livro: " + escolhido.getTitulo());
				    break;
				case 4:
				    System.out.println("----- DEVOLUÇÃO DE LIVRO -----");

				    
				    if (!emp.isStatus()) {
				        System.out.println("Nenhum livro está emprestado no momento.");
				        break;
				    }

				    
				    System.out.println("Livro emprestado no momento:");
				    System.out.println("Data do empréstimo: " + emp.getDataEmprestimo());

				    System.out.println("Informe a data da devolução (ex: 15/11/2025):");
				    String dataDev = sc.next();

				    
				    emp.setDataDevolucao(dataDev);
				    emp.setStatus(false);

				    System.out.println("Devolução registrada com sucesso!");
				    System.out.println("Data da devolução: " + dataDev);
				    break;
				case 5:
					break;
				case 6: 
					break;
			} 
		} while (op!=6);
	}
}

