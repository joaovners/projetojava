package Classes;

import java.util.Scanner;

public class MenuFunc2 {
public static void main(String args[]) {
		
	    String nome;
		int x=0;
		int numero;
		Scanner leia = new Scanner(System.in);
		System.out.println("\n****Menu do Funcion�rio****");
		System.out.println("\nEscolha uma op��o de cadastramento entre 1 � 4.\n"
				+ "1-Cadastro do Alune.\n"
				+ "2-Cadastro do Doador.\n"
				+ "3-Cadastro do Funcion�rio.\n"
				+ "4-Cadastro do Livro.\n");
		x = leia.nextInt();

		if(x==1)
		{
			System.out.println("\nCadastrar Alune");
			switch (x)
			{
			case 1:
				System.out.println("Nome do Alune: \n"
						+"Idade do Alune: \n"
						+"CPF do Alune: \n"
						+"Telefone do Alune: \n");
				break;
			
			}
		}
		else if (x==2)
		{
			System.out.println("\nCadastrar Doador");
			switch (x)
			{
			case 1:
				System.out.println("Nome do Doador: \n"
						+"Idade do Doaodr: \n"
						+"CPF do Doador: \n"
						+"Telefone do Doador: \n");
				break;
			}
		}
		else if (x==3) 
		{
			System.out.println("\nCadastrar Funcion�rio");
			switch (x)
			{
			case 1:
				System.out.println("Nome do Funcion�rio: \n"
						+"Idade do Funcion�rio: \n"
						+"CPF do Funcion�rio: \n"
						+"Telefone do Funcion�rio: \n");
				break;
			}
		}
		else if(x==4)
		{
			System.out.println("\nCadastrar Livro");
			switch(x)
			{
			case 1:
				System.out.println("Nome do Livro: \n"
						+"Ano de publica��o: \n"
						+"Editora: \n"
						+"Autor: \n");
				break;	
			}
		}
		else 
		{
			System.out.println("\nErro no programa!!!");
		}
	}

	
	

}