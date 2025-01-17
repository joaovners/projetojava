package Classes;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {
	private int raAluno;
	private String colegio;

	public Aluno(int idPessoa, String nome, int idade, String cpf, String telefone, int raAluno, String colegio) {
		super(idPessoa, nome, idade, cpf, telefone);
		this.raAluno = raAluno;
		this.colegio = colegio;
	}

	public Aluno() {
		super();
		this.raAluno = 0;
		this.colegio = null;
	}

	public void cadastrar(List<Aluno> listaA) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				Aluno objeto = new Aluno();
				System.out.println("\nDigite o id do alune: ");
				objeto.setIdPessoa(scan.nextInt());
				System.out.println("\nDigite o nome do alune: ");
				objeto.setNome(scan.next());
				System.out.println("\nDigite a idade do alune: ");
				objeto.setIdade(scan.nextInt());
				System.out.println("\nDigite o CPF do alune: ");
				objeto.setCpf(scan.next());
				System.out.println("\nDigite o telefone do alune: ");
				objeto.setTelefone(scan.next());
				System.out.println("\nDigite o RA do alune: ");
				objeto.setRaAluno(scan.nextInt());
				System.out.println("\nDigite o col�gio do alune: ");
				objeto.setColegio(scan.next());
				listaA.add(objeto);
				System.out.println("Cadastrado com sucesso");
				break;
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}
	}

	public void consultar(List<Aluno> listaA) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index;
				System.out.println("\nQual posi��o voc� deseja consultar?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do alune: " + listaA.get(index).getIdPessoa() + "\nNome do alune: "
						+ listaA.get(index).getNome() + "\nIdade do alune: " + listaA.get(index).getIdade()
						+ "\nCPF do alune: " + listaA.get(index).getCpf() + "\nTelefone do alune: "
						+ listaA.get(index).getTelefone() + "\nRA do alune: " + listaA.get(index).getRaAluno()
						+ "\nCol�gio do alune: " + listaA.get(index).getColegio());
				System.out.println("-----------------------------------------");
				break;
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}
	}

	public void listar(List<Aluno> listaA) {
		int contador = 0;
		for (Aluno in : listaA) {
			System.out.println("-----------------------------------------");
			System.out.println("Posi��o: " + contador);
			System.out.println("Id: " + in.getIdPessoa());
			System.out.println("Nome: " + in.getNome());
			System.out.println("Idade: " + in.getIdade());
			System.out.println("RA aluno: " + in.getRaAluno());
			System.out.println("-----------------------------------------");
			contador++;
		}
	}

	public void excluir(List<Aluno> listaA) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index, i;
				System.out.println("\nQual posi��o voc� deseja remover?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do alune: " + listaA.get(index).getIdPessoa() + "\nNome do alune: "
						+ listaA.get(index).getNome() + "\nIdade do alune: " + listaA.get(index).getIdade()
						+ "\nCPF do alune: " + listaA.get(index).getCpf() + "\nTelefone do alune: "
						+ listaA.get(index).getTelefone() + "\nRA do alune: " + listaA.get(index).getRaAluno()
						+ "\nCol�gio do alune: " + listaA.get(index).getColegio());
				System.out.println("-----------------------------------------");
				System.out.println("\nDeseja remover este mesmo?");
				System.out.println("\n(1)Sim");
				System.out.println("\n(2)N�o");
				i = scan.nextInt();
				if (i == 1) {
					listaA.remove(index);
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

	public void alterar(List<Aluno> listaA) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index, i;
				System.out.println("\nQual posi��o voc� deseja alterar?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do alune: " + listaA.get(index).getIdPessoa() + "\nNome do alune: "
						+ listaA.get(index).getNome() + "\nIdade do alune: " + listaA.get(index).getIdade()
						+ "\nCPF do alune: " + listaA.get(index).getCpf() + "\nTelefone do alune: "
						+ listaA.get(index).getTelefone() + "\nRA do alune: " + listaA.get(index).getRaAluno()
						+ "\nCol�gio do alune: " + listaA.get(index).getColegio());
				System.out.println("-----------------------------------------");
				System.out.println("\nDeseja alterar este mesmo?");
				System.out.println("\n(1)Sim");
				System.out.println("\n(2)N�o");
				i = scan.nextInt();
				if (i == 1) {
					Aluno objeto = new Aluno();
					System.out.println("\nDigite o novo Id do alune: ");
					objeto.setIdPessoa(scan.nextInt());
					System.out.println("\nDigite o novo nome do alune: ");
					objeto.setNome(scan.next());
					System.out.println("\nDigite a nova idade do alune: ");
					objeto.setIdade(scan.nextInt());
					System.out.println("\nDigite o novo CPF do alune: ");
					objeto.setCpf(scan.next());
					System.out.println("\nDigite o novo telefone do alune: ");
					objeto.setTelefone(scan.next());
					System.out.println("\nDigite o novo RA do alune: ");
					objeto.setRaAluno(scan.nextInt());
					System.out.println("\nDigite o novo col�gio do alune: ");
					objeto.setColegio(scan.next());
					listaA.remove(index);
					listaA.add(objeto);
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

	public int getRaAluno() {
		return raAluno;
	}

	public void setRaAluno(int raAluno) {
		this.raAluno = raAluno;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

}
