package Classes;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Decidir {
	public void dCadastrar(List<Aluno> listaA, List<Doador> listaD, List<Funcionario> listaF, List<Livro> listaL) {
		int x;
		while (true) {
			System.out.println("\nEscolha uma op��o para cadastrar entre 1 � 4.\n" + "1-Cadastro do Alune.\n"
					+ "2-Cadastro do Doador.\n" + "3-Cadastro do Funcion�rio.\n" + "4-Cadastro do Livro.\n"
					+ "0-Voltar.\n");
			try {
				Scanner scan = new Scanner(System.in);
				x = scan.nextInt();
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
			if (x == 0) {
				break;
			} else {
				switch (x) {
				case 1:
					Aluno oAluno = new Aluno();
					oAluno.cadastrar(listaA);
					break;
				case 2:
					Doador oDoador = new Doador();
					oDoador.cadastrar(listaD);
					break;
				case 3:
					Funcionario oFuncionario = new Funcionario();
					oFuncionario.cadastrar(listaF);
					break;
				case 4:
					Livro oLivro = new Livro();
					oLivro.cadastrar(listaL);
					break;
				default:
					if (x != 0)
						System.out.println("Op��o inv�lida!");
				}
			}
		}
	}

	public void dLista(List<Aluno> listaA, List<Doador> listaD, List<Funcionario> listaF, List<Livro> listaL) {
		int x;
		while (true) {
			System.out.println("\nEscolha uma op��o de listar entre 1 � 4.\n" + "1-Listar Alunes.\n"
					+ "2-Listar Doadores.\n" + "3-Listar Funcion�ries.\n" + "4-Listar Livro.\n" + "0-Voltar.\n");
			try {
				Scanner scan = new Scanner(System.in);
				x = scan.nextInt();
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
			if (x == 0) {
				break;
			} else {
				switch (x) {
				case 1:
					Aluno oAluno = new Aluno();
					oAluno.listar(listaA);
					break;
				case 2:
					Doador oDoador = new Doador();
					oDoador.listar(listaD);
					break;
				case 3:
					Funcionario oFuncionario = new Funcionario();
					oFuncionario.listar(listaF);
					break;
				case 4:
					Livro oLivro = new Livro();
					oLivro.listar(listaL);
					break;
				default:
					if (x != 0)
						System.out.println("Op��o inv�lida!");
				}
			}
		}
	}

	public void dConsultar(List<Aluno> listaA, List<Doador> listaD, List<Funcionario> listaF, List<Livro> listaL) {
		int x;
		while (true) {
			System.out.println("\nEscolha uma op��o para consultar entre 1 � 4.\n" + "1-Consulta do Alune.\n"
					+ "2-Consulta do Doador.\n" + "3-Consulta do Funcion�rio.\n" + "4-Consulta do Livro.\n"
					+ "0-Voltar.\n");
			try {
				Scanner scan = new Scanner(System.in);
				x = scan.nextInt();
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
			if (x == 0) {
				break;
			} else {
				switch (x) {
				case 1:
					Aluno oAluno = new Aluno();
					oAluno.consultar(listaA);
					break;
				case 2:
					Doador oDoador = new Doador();
					oDoador.consultar(listaD);
					break;
				case 3:
					Funcionario oFuncionario = new Funcionario();
					oFuncionario.consultar(listaF);
					break;
				case 4:
					Livro oLivro = new Livro();
					oLivro.consultar(listaL);
					break;
				default:
					if (x != 0)
						System.out.println("Op��o inv�lida!");
				}
			}
		}
	}

	public void dAlterar(List<Aluno> listaA, List<Doador> listaD, List<Funcionario> listaF, List<Livro> listaL) {
		int x;
		while (true) {
			System.out.println("\nEscolha uma op��o para alterar entre 1 � 4.\n" + "1-Alterar Alunes.\n"
					+ "2-Alterar Doadores.\n" + "3-Alterar Funcion�ries.\n" + "4-Alterar Livro.\n" + "0-Voltar.\n");
			try {
				Scanner scan = new Scanner(System.in);
				x = scan.nextInt();
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
			if (x == 0) {
				break;
			} else {
				switch (x) {
				case 1:
					Aluno oAluno = new Aluno();
					oAluno.alterar(listaA);
					break;
				case 2:
					Doador oDoador = new Doador();
					oDoador.alterar(listaD);
					break;
				case 3:
					Funcionario oFuncionario = new Funcionario();
					oFuncionario.alterar(listaF);
					break;
				case 4:
					Livro oLivro = new Livro();
					oLivro.alterar(listaL);
					break;
				default:
					if (x != 0)
						System.out.println("Op��o inv�lida!");
				}
			}
		}

	}

	public void dExcluir(List<Aluno> listaA, List<Doador> listaD, List<Funcionario> listaF, List<Livro> listaL) {
		int x;
		while (true) {
			System.out.println("\nEscolha uma op��o para exlcuir entre 1 � 4.\n" + "1-Exlcuir Alune.\n"
					+ "2-Exlcuir Doador.\n" + "3-Exlcuir Funcion�rio.\n" + "4-Exlcuir Livro.\n" + "0-Voltar.\n");
			try {
				Scanner scan = new Scanner(System.in);
				x = scan.nextInt();
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
			if (x == 0) {
				break;
			} else {
				switch (x) {
				case 1:
					Aluno oAluno = new Aluno();
					oAluno.excluir(listaA);
					break;
				case 2:
					Doador oDoador = new Doador();
					oDoador.excluir(listaD);
					break;
				case 3:
					Funcionario oFuncionario = new Funcionario();
					oFuncionario.excluir(listaF);
					break;
				case 4:
					Livro oLivro = new Livro();
					oLivro.excluir(listaL);
					break;
				default:
					if (x != 0)
						System.out.println("Op��o inv�lida!");
				}
			}
		}
	}
}