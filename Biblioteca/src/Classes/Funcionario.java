package Classes;

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

	public void cadastrar(Funcionario objeto, List<Object> listaF) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nDigite o id do funcion�rie: ");
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
	}

	public void imprimirInfo(Funcionario objeto) {
		System.out.println("\nId do funcion�rie: " + objeto.getIdPessoa() + "\nNome do funcion�rie: " + objeto.getNome()
				+ "\nIdade do funcion�rie: " + objeto.getIdade() + "\nCPF do funcion�rie: " + objeto.getCpf()
				+ "\nTelefone do funcion�rie: " + objeto.getTelefone() + "\nSetor do funcion�rie: " + objeto.getSetor()
				+ "\nSal�rio do funcionarie: " + objeto.getSalario());

	}

	@Override
	public void listar(List<Object> listaF) {
		for (int i = 0; i < listaF.size(); i++) {
			System.out.println("\nFuncionare " + (i + 1) + ": " + listaF.get(i));
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