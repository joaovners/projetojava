package Classes;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Funcionario extends Pessoa {
	private String setor;
	private double salario;

	public Funcionario(int idPessoa, String nome, int idade, String cpf, String telefone, int idFuncionario,
			String setor, double salario) {
		super(idPessoa, nome, idade, cpf, telefone);
		this.setor = setor;
		this.salario = salario;
	}

	public Funcionario() {
		super();
		this.setor = null;
		this.salario = 0;
	}

	public void cadastrar(List<Funcionario> listaF) {
		while (true) {
			try {
				Funcionario objeto = new Funcionario();
				Scanner scan = new Scanner(System.in);
				System.out.println("\nDigite o id do funcionarie: ");
				objeto.setIdPessoa(scan.nextInt());
				System.out.println("\nDigite o nome do funcion�rie: ");
				objeto.setNome(scan.next());
				System.out.println("\nDigite a idade do funcion�rie: ");
				objeto.setIdade(scan.nextInt());
				System.out.println("\nDigite o CPF do funcion�rie: ");
				objeto.setCpf(scan.next());
				System.out.println("\nDigite o telefone do funcion�rie: ");
				objeto.setTelefone(scan.next());
				System.out.println("\nDigite o setor do funcion�rie: ");
				objeto.setSetor(scan.next());
				System.out.println("\nDigite o sal�rio do funcion�rie: ");
				objeto.setSalario(scan.nextDouble());
				listaF.add(objeto);
				System.out.println("Cadastrado com sucesso");
				break;
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}
	}

	public void consultar(List<Funcionario> listaF) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index;
				System.out.println("\nQual posi��o voc� deseja consultar?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do funcionarie: " + listaF.get(index).getIdPessoa() + "\nNome do funcionarie: "
						+ listaF.get(index).getNome() + "\nIdade do funcionarie: " + listaF.get(index).getIdade()
						+ "\nCPF do funcionarie: " + listaF.get(index).getCpf() + "\nTelefone do funcionarie: "
						+ listaF.get(index).getTelefone() + "\nSetor: " + listaF.get(index).getSetor() + "\nSal�rio: "
						+ listaF.get(index).getSalario());
				System.out.println("-----------------------------------------");
				break;
			} catch (InputMismatchException ex) {
				System.err.println("Caractere n�o v�lido, digite um n�mero.");
				continue;
			}
		}
	}

	public void listar(List<Funcionario> listaF) {
		int contador = 0;
		for (Funcionario in : listaF) {
			System.out.println("-----------------------------------------");
			System.out.println("Posi��o: " + contador);
			System.out.println("Id: " + in.getIdPessoa());
			System.out.println("Nome: " + in.getNome());
			System.out.println("Idade: " + in.getIdade());
			System.out.println("Setor: " + in.getSetor());
			System.out.println("-----------------------------------------");
			contador++;
		}
	}

	public void excluir(List<Funcionario> listaF) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index, i;
				System.out.println("\nQual posi��o voc� deseja remover?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do funcionarie: " + listaF.get(index).getIdPessoa() + "\nNome do funcionarie: "
						+ listaF.get(index).getNome() + "\nIdade do funcionarie: " + listaF.get(index).getIdade()
						+ "\nCPF do funcionarie: " + listaF.get(index).getCpf() + "\nTelefone do funcionarie: "
						+ listaF.get(index).getTelefone() + "\nSetor: " + listaF.get(index).getSetor() + "\nSal�rio: "
						+ listaF.get(index).getSalario());
				System.out.println("-----------------------------------------");
				System.out.println("\nDeseja remover este mesmo?");
				System.out.println("\n(1)Sim");
				System.out.println("\n(2)N�o");
				i = scan.nextInt();
				if (i == 1) {
					listaF.remove(index);
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

	public void alterar(List<Funcionario> listaF) {
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				int index, i;
				System.out.println("\nQual posi��o voc� deseja alterar?");
				index = scan.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("\nId do funcionarie: " + listaF.get(index).getIdPessoa() + "\nNome do funcionarie: "
						+ listaF.get(index).getNome() + "\nIdade do funcionarie: " + listaF.get(index).getIdade()
						+ "\nCPF do funcionarie: " + listaF.get(index).getCpf() + "\nTelefone do funcionarie: "
						+ listaF.get(index).getTelefone() + "\nSetor: " + listaF.get(index).getSetor() + "\nSal�rio: "
						+ listaF.get(index).getSalario());
				System.out.println("-----------------------------------------");
				System.out.println("\nDeseja alterar este mesmo?");
				System.out.println("\n(1)Sim");
				System.out.println("\n(2)N�o");
				i = scan.nextInt();
				if (i == 1) {
					Funcionario objeto = new Funcionario();
					System.out.println("\nDigite o id do funcionarie: ");
					objeto.setIdPessoa(scan.nextInt());
					System.out.println("\nDigite o nome do funcion�rie: ");
					objeto.setNome(scan.next());
					System.out.println("\nDigite a idade do funcion�rie: ");
					objeto.setIdade(scan.nextInt());
					System.out.println("\nDigite o CPF do funcion�rie: ");
					objeto.setCpf(scan.next());
					System.out.println("\nDigite o telefone do funcion�rie: ");
					objeto.setTelefone(scan.next());
					System.out.println("\nDigite o setor do funcion�rie: ");
					objeto.setSetor(scan.next());
					System.out.println("\nDigite o sal�rio do funcion�rie: ");
					objeto.setSalario(scan.nextDouble());
					listaF.remove(index);
					listaF.add(objeto);
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

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
