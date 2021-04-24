import java.util.Scanner;

public class ExibirMenu {
	
	public static void menu() {
		
		String continuar;
		
		do {
			System.out.println("Digite uma das opções:");//Impressão na tela
			System.out.println("1- Inserir nome no arquivo");
			System.out.println("2- Exibir todos os nomes do arquivo");
			System.out.println("3- Apagar todo arquivo");
			
			Scanner entradaMenu = new Scanner(System.in);//Criando objeto entradaMenu
			String opcao = entradaMenu.nextLine();//Atribuindo entrada a opção
			
			
			if (opcao.equals("1")) { // Condicional de seleção conforme o valor digitado
				System.out.println("Digite um nome:");
				InserirNome.opcaoUm();
				
			} else if (opcao.equals("2")) {//Escolha da Exibir todos os nomes do arquivo
				System.out.println("Exibindo nome...\n");
				ExibirNomes.opcaoDois();
				
			}else if (opcao.equals("3")){//Escolha da opção Apagar todo arquivo
				Deletar.excluir();
			}
			
			System.out.println("Continuar?");
			System.out.println("Digite Sim ou Não!");
			continuar = entradaMenu.nextLine();
			
		}while(continuar.equals("sim") || continuar.equals("Sim"));
		
	}
}
