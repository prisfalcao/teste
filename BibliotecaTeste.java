
import java.util.Scanner;

public class BibliotecaTeste {

	public static void main(String[] args) {
		
		System.out.println("Seja bem-vindo � Biblioteca �gil. Como podemos ajudar?");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		String nome = teclado.nextLine();
		System.out.println("Ol� " + nome + "!");
				
		System.out.println("Selecione uma das op��es abaixo:");
		System.out.println("1 - Retirar livro:");
		System.out.println("2 - Devolver livro:");
		System.out.println("3- Doar livro:");
		
		// Menu Principal - op��es dispon�veis
		int menu = teclado.nextInt();
		
		if (menu==1) {
		
			System.out.println("Selecione o livro que deseja retirar:");
			System.out.println("Livro 1 - As Cr�nicas de N�rnia - Autor: C.S. Lewis");
			System.out.println("Livro 2 - Eragon - Autor: Christopher Paolini");
			System.out.println("Livro 3 - A Dan�a dos Drag�es - Autor: George R.R. Martin");
			
			// Retirada de livro
			int livroRetira = teclado.nextInt();
			
			if (livroRetira==1) {
				System.out.println("Voc� escolheu As Cr�nicas de N�rnia. Prazo para devolu��o at� 15/05/2020.");
			}
			if (livroRetira==2) {
				System.out.println("Voc� escolheu Eragon. Prazo para devolu��o at� 15/05/2020.");
			}
			
			if (livroRetira==3) {
				System.out.println("Voc� escolheu A Dan�a dos Drag�es. Prazo para devolu��o at� 15/05/2020.");
			}
			while (livroRetira>=4) {
				System.out.println("Op��o inv�lida. Tente Novamente!");
			}	
		}
		
		//Devolu��o de livro
		if (menu==2) {
			 
			System.out.println("Digite o nome do livro a ser devolvido:");
			System.out.println("Livro 1 - As Cr�nicas de N�rnia - Autor: C.S. Lewis");
			System.out.println("Livro 2 - Eragon - Autor: Christopher Paolini");
			System.out.println("Livro 3 - A Dan�a dos Drag�es - Autor: George R.R. Martin");
		
			int livroDevolve = teclado.nextInt();		
			
			if (livroDevolve==1) {
				System.out.println("Voc� devolveu as Cr�nicas de N�rnia. Obrigada e volte sempre!");
			}
			
			if (livroDevolve==2) {
				System.out.println("Voc� devolveu Eragon. Obrigada e volte sempre!");
			}
			
			if (livroDevolve==3) {
				System.out.println("Voc� devolveu A Dan�a dos Drag�es! Obrigada e volte sempre!");
			}
			
			if (livroDevolve>=4) {
				System.out.println("Op��o inv�lida. Tente Novamente!");
			}
		}
		 
		// Doa��o de livro - S� Deus e os dev sabe como faz agora, pq eu n sei...
		
		
		if (menu==3) {
			System.out.println("Digite o nome do livro a ser doado:"); 
		
			Scanner nomeLivro = new Scanner(System.in);

			System.out.println("Obrigada por doar " +  nomeLivro + "� nossa biblioteca!");
			// COMO FAZ ESSA PARTE? HELP!
		
		}
		
		
		if (menu>=4) {
			System.out.println("Op��o inv�lida. Tente Novamente!");
		}
			
		}
		
		
	}
