import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InserirNome {
	
	public static boolean opcaoUm() {
		
		try{
			FileWriter arquivo = new FileWriter("/home/bruno/Documentos/TrabalhoPoo/Arquivo.txt", true);//Apontando para o arquivo. Caminho do arquivo que iremos armazenar as informações
			PrintWriter gravarArquivo = new PrintWriter(arquivo);//Comando para escrever no aquivo apontado acima
			Scanner teclado = new Scanner(System.in);//Classe Scanner, criando um novo objeto
			String texto = teclado.nextLine();//Entrada de dados, usando o metodo nextLine do objeto teclado
			gravarArquivo.println(texto);//Gravando informação no arquivo usando o metodo println da objeto, e atribuindo texto como parameto. Print salva tudo como string
			
			String pularLinha = "\n";
			gravarArquivo.println(pularLinha);
			
			gravarArquivo.close();//salva as informações digitadas
			return true;
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
