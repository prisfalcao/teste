
import java.util.Scanner;

public class BibliotecaTeste {

	public static void main(String[] args) {
		
		System.out.println("Seja bem-vindo à Biblioteca Ágil. Como podemos ajudar?");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		String nome = teclado.nextLine();
		System.out.println("Olá " + nome + "!");
				
		System.out.println("Selecione uma das opções abaixo:");
		System.out.println("1 - Retirar livro:");
		System.out.println("2 - Devolver livro:");
		System.out.println("3- Doar livro:");
		
		// Menu Principal - opções disponíveis
		int menu = teclado.nextInt();
		
		if (menu==1) {
		
			System.out.println("Selecione o livro que deseja retirar:");
			System.out.println("Livro 1 - As Crônicas de Nárnia - Autor: C.S. Lewis");
			System.out.println("Livro 2 - Eragon - Autor: Christopher Paolini");
			System.out.println("Livro 3 - A Dança dos Dragões - Autor: George R.R. Martin");
			
			// Retirada de livro
			int livroRetira = teclado.nextInt();
			
			if (livroRetira==1) {
				System.out.println("Você escolheu As Crônicas de Nárnia. Prazo para devolução até 15/05/2020.");
			}
			if (livroRetira==2) {
				System.out.println("Você escolheu Eragon. Prazo para devolução até 15/05/2020.");
			}
			
			if (livroRetira==3) {
				System.out.println("Você escolheu A Dança dos Dragões. Prazo para devolução até 15/05/2020.");
			}
			while (livroRetira>=4) {
				System.out.println("Opção inválida. Tente Novamente!");
			}	
		}
		
		//Devolução de livro
		if (menu==2) {
			 
			System.out.println("Digite o nome do livro a ser devolvido:");
			System.out.println("Livro 1 - As Crônicas de Nárnia - Autor: C.S. Lewis");
			System.out.println("Livro 2 - Eragon - Autor: Christopher Paolini");
			System.out.println("Livro 3 - A Dança dos Dragões - Autor: George R.R. Martin");
		
			int livroDevolve = teclado.nextInt();		
			
			if (livroDevolve==1) {
				System.out.println("Você devolveu as Crônicas de Nárnia. Obrigada e volte sempre!");
			}
			
			if (livroDevolve==2) {
				System.out.println("Você devolveu Eragon. Obrigada e volte sempre!");
			}
			
			if (livroDevolve==3) {
				System.out.println("Você devolveu A Dança dos Dragões! Obrigada e volte sempre!");
			}
			
			if (livroDevolve>=4) {
				System.out.println("Opção inválida. Tente Novamente!");
			}
		}
		 
		// Doação de livro - Só Deus e os dev sabe como faz agora, pq eu n sei...
		
		
		if (menu==3) {
			System.out.println("Digite o nome do livro a ser doado:"); 
		
			Scanner nomeLivro = new Scanner(System.in);

			System.out.println("Obrigada por doar " +  nomeLivro + "à nossa biblioteca!");
			// COMO FAZ ESSA PARTE? HELP!
		
		}
		
		
		if (menu>=4) {
			System.out.println("Opção inválida. Tente Novamente!");
		}
			
		}
		
		
	}
