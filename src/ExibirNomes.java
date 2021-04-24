import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class ExibirNomes {
	
	public static void opcaoDois() {
		
		Path caminho = Paths.get("/home/bruno/Documentos/TrabalhoPoo/Arquivo.txt");
		
		try {
			byte [] texto = Files.readAllBytes(caminho);//Passando todas as informações do arquivo para o tipo byte
			String leitura = new String(texto);// Passando as informções para String
			
			JOptionPane.showMessageDialog(null, leitura);//Comando para leitura do arquivo
			
		} catch(Exception erro) {
			System.out.println("Erro!");
		}
		
	}
}
