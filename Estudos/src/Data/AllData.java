package Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AllData {
	
	public void processFile(File file, String createNewPath) {
		int customerQuant = 0;
		int sellerQuant = 0;
		
		try(BufferedReader readeFile = new BufferedReader(new FileReader(file))){
			String line;
			while((line = readeFile.readLine()) != null) {
				String[] data = line.split("ç");
				switch(data[0]) {
					case "001":
						sellerQuant++;
						break;
					case "002":
						customerQuant++;
						break;
					case "003":
						dados03(data[2]);
						break;		
				}	
			}
		}catch(IOException  e) {
			System.out.print("Erro ao Ler arquivo");
		}
		
		whiteFile(createNewPath ,sellerQuant, customerQuant );
	}
	
	private void dados03(String item03){
		String[] t = item03.split("-");
		String quantity = t[1];
		System.out.print(t);
		
	}
	
	
	private void whiteFile(String createNewPath, int sellerQuant, int customerQuant) {
		try(BufferedWriter recordd = new BufferedWriter(new FileWriter(createNewPath))){
			recordd.write("Quantidade de Vendedor no arquivo de entrada: " + sellerQuant);
			recordd.newLine();
			recordd.write("Quantidade de Cliente no arquivo de entrada: " + customerQuant);
			recordd.newLine();
			recordd.write("ID da venda mais cara : " );
			recordd.newLine();
			recordd.write("O pior vendedor : " );
			
			recordd.close();
		}catch(IOException e) {
			System.out.print("Erro ao gravar Dados");
		}
		
	}
	
}
