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
		Emprestimo emp = new Emprestimo(0, 0, false);	
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
					break;
				case 2:
					break;
				case 3:
				    break;
				case 4:
				    break;
				case 5:
					break;
				case 6: 
					break;
			} 
		} while (op!=6);
	}
}

