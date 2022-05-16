package Classes;

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

	public void cadastrar(Aluno objeto, List<Object> listaA) {
		Scanner scan = new Scanner(System.in);
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
	}

	public void imprimirInfo(Aluno objeto) {
		System.out.println("\nId do alune: "+objeto.getIdPessoa()+"\nNome do alune: " + objeto.getNome() + "\nIdade do alune: " + objeto.getIdade()
				+ "\nCPF do alune: " + objeto.getCpf() + "\nTelefone do alune: " + objeto.getTelefone()
				+ "\nRA do alune: " + objeto.getRaAluno() + "\nCol�gio do alune: " + objeto.getColegio());
	}

	@Override
	public void listar(List<Object> listaA) {
		for (int i = 0; i < listaA.size(); i++) {
			System.out.println("\nAlune " + (i + 1) + ": " + listaA.get(i));
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
