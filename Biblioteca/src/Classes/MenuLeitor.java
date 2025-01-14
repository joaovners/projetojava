package Classes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuLeitor {

	public static void main(String[] args) {
		List<Livro> listaL = new ArrayList<Livro>();
		Livro oLivro = new Livro();
		int op = 1;
		while (true) {
			Scanner leia = new Scanner(System.in);
			System.out.println("=== Seja Bem Vinde a Biblioteca G3 ===");
			try {
				System.out.println("\nLeitor, selecione uma op��o que deseja fazer:");
				System.out.println("\n1- Listar livros");
				System.out.println("\n2- Consultar livro");
				System.out.println("\n0- Sair");
				System.out.println("=======================================");
				op = leia.nextInt();
				if (op == 0) {
					break;
				} else {
					switch (op) {
					case 1:
						oLivro.listar(listaL);
						break;
					case 2:
						oLivro.consultar(listaL);
						break;
					default:
						System.out.println("-------Op��o inv�lida!!!-------");
					}
				}
			} catch (InputMismatchException e) {
				System.err.println("\nDigite um n�mero.");
			}
		}
	}
}
