import java.io.FileWriter;
import java.io.Writer;

public class Deletar {
	public static void excluir() {
		try {
			Writer out = new FileWriter("/home/bruno/Documentos/TrabalhoPoo/Arquivo.txt");//Criando o objeto out e passando o caminho do arquivo
			out.write("");//Usando o metodo write do objeto out e excrevendo vazio nele
		    out.flush();//apagando as informações
		    out.close();
		}catch(Exception erro) {
			System.out.println("Erro!");
		}
	}
}
