package Classes;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Doador extends Pessoa {
	private String tipoLivro;
	private int qtdLivro;
	private String nomeLivro;

	public Doador(int idPessoa, String nome, int idade, String cpf, String telefone, String tipoLivro, int qtdLivro,
			String nomeLivro) {
		super(idPessoa, nome, idade, cpf, telefone);
		this.tipoLivro = tipoLivro;
		this.qtdLivro = qtdLivro;
		this.nomeLivro = nomeLivro;
	}

	public Doador() {
		super();
		this.tipoLivro = null;
		this.qtdLivro = 0;
		this.nomeLivro = null;
	}

	public void cadastrar(List<Doador> listaD) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				Doador objeto = new Doador();
				System.out.println("\nDigite o id do doadore: ");
				objeto.setIdPessoa(scan.nextInt());
				System.out.println("\nDigite o nome do doadore: ");
				objeto.setNome(scan.next());
				System.out.println("\nDigite a idade do doadore: ");
				objeto.setIdade(scan.nextInt());
				System.out.println("\nDigite o CPF do doadore: ");
				objeto.setCpf(scan.next());
				System.out.println("\nDigite o telefone do doadore: ");
				objeto.setTelefone(scan.next());
				System.out.println("\nDigite o nome do livro: ");
				objeto.setNomeLivro(scan.next());
				System.out.println("\nDigite o tipo do livro: ");
				objeto.setTipoLivro(scan.next());
				System.out.println("\nDigite a quantidade de livros nesta doa��o: ");
				objeto.setQtdLivro(scan.nextInt());
				listaD.add(objeto);
				System.out.println("Cadastrado com sucesso");
				break;
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}
	}

	public void consultar(List<Doador> listaD) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index;
				System.out.println("\nQual posi��o voc� deseja consultar?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do doadore: " + listaD.get(index).getIdPessoa() + "\nNome do doadore: "
						+ listaD.get(index).getNome() + "\nIdade do doadore: " + listaD.get(index).getIdade()
						+ "\nCPF do doadore: " + listaD.get(index).getCpf() + "\nTelefone do doadore: "
						+ listaD.get(index).getTelefone() + "\nNome do livro: " + listaD.get(index).getNomeLivro()
						+ "\nTipo de livro: " + listaD.get(index).getTipoLivro() + "\nQuantidade de livros: "
						+ listaD.get(index).getQtdLivro());
				System.out.println("-----------------------------------------");
				break;
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}
	}

	public void listar(List<Doador> listaD) {
		int contador = 0;
		for (Doador in : listaD) {
			System.out.println("-----------------------------------------");
			System.out.println("Posi��o: " + contador);
			System.out.println("Id: " + in.getIdPessoa());
			System.out.println("Nome: " + in.getNome());
			System.out.println("Idade: " + in.getIdade());
			System.out.println("Telefone: " + in.getTelefone());
			System.out.println("-----------------------------------------");
			contador++;
		}
	}

	public void excluir(List<Doador> listaD) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index, i;
				System.out.println("\nQual posi��o voc� deseja remover?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do doadore: " + listaD.get(index).getIdPessoa() + "\nNome do doadore: "
						+ listaD.get(index).getNome() + "\nIdade do doadore: " + listaD.get(index).getIdade()
						+ "\nCPF do doadore: " + listaD.get(index).getCpf() + "\nTelefone do alune: "
						+ listaD.get(index).getTelefone() + "\nNome do livro: " + listaD.get(index).getNomeLivro()
						+ "\nTipo de livro: " + listaD.get(index).getTipoLivro() + "\nQuantidade de livros: "
						+ listaD.get(index).getQtdLivro());
				System.out.println("-----------------------------------------");
				System.out.println("\nDeseja remover este mesmo?");
				System.out.println("\n(1)Sim");
				System.out.println("\n(2)N�o");
				i = scan.nextInt();
				if (i == 1) {
					listaD.remove(index);
					System.out.println("Exclu�do com sucesso");
					break;
				} else if (i != 1 && i != 2) {
					System.out.println("\nOp��o inv�lida.");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}

	}

	public void alterar(List<Doador> listaD) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index, i;
				System.out.println("\nQual posi��o voc� deseja alterar?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do doadore: " + listaD.get(index).getIdPessoa() + "\nNome do doadore: "
						+ listaD.get(index).getNome() + "\nIdade do doadore: " + listaD.get(index).getIdade()
						+ "\nCPF do doadore: " + listaD.get(index).getCpf() + "\nTelefone do alune: "
						+ listaD.get(index).getTelefone() + "\nNome do livro: " + listaD.get(index).getNomeLivro()
						+ "\nTipo de livro: " + listaD.get(index).getTipoLivro() + "\nQuantidade de livros: "
						+ listaD.get(index).getQtdLivro());
				System.out.println("-----------------------------------------");
				System.out.println("\nDeseja alterar este mesmo?");
				System.out.println("\n(1)Sim");
				System.out.println("\n(2)N�o");
				i = scan.nextInt();
				if (i == 1) {
					Doador objeto = new Doador();
					System.out.println("\nDigite o novo Id do doadore: ");
					objeto.setIdPessoa(scan.nextInt());
					System.out.println("\nDigite o novo nome do doadore: ");
					objeto.setNome(scan.next());
					System.out.println("\nDigite a nova idade do doadore: ");
					objeto.setIdade(scan.nextInt());
					System.out.println("\nDigite o novo CPF do doadore: ");
					objeto.setCpf(scan.next());
					System.out.println("\nDigite o novo telefone do doadore: ");
					objeto.setTelefone(scan.next());
					System.out.println("\nDigite o nome do livro: ");
					objeto.setNomeLivro(scan.next());
					System.out.println("\nDigite o tipo do livro: ");
					objeto.setTipoLivro(scan.next());
					System.out.println("\nDigite a quantidade de livros nesta doa��o: ");
					objeto.setQtdLivro(scan.nextInt());
					listaD.remove(index);
					listaD.add(objeto);
					System.out.println("Alterado com sucesso");
					break;
				} else if (i != 1 && i != 2) {
					System.out.println("\nOp��o inv�lida.");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}

	}

	public String getTipoLivro() {
		return tipoLivro;
	}

	public void setTipoLivro(String tipoLivro) {
		this.tipoLivro = tipoLivro;
	}

	public int getQtdLivro() {
		return qtdLivro;
	}

	public void setQtdLivro(int qtdLivro) {
		this.qtdLivro = qtdLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

}
