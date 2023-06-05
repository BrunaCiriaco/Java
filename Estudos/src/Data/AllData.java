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
		double valueMax = Double.MAX_VALUE;
		String valueMaxTotal = "";
		double valueMin = Double.MIN_VALUE;
		double valueMinTotal = 0;
		String vendedor = "";
		String piorVendedor = "";
		
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
						 double totalPrice = dados03(data[2]);
						 if(totalPrice > valueMin) {
							 valueMin = totalPrice;	
							 valueMaxTotal = data[1];
							 vendedor = data[3];
  						 }						 
						break;		
				}

			
				if(data[0].equals("003")) {
					 double totalPrice = dados03(data[2]);
					 if(totalPrice < valueMax) {
						 valueMinTotal = totalPrice;
						 piorVendedor = data[3];
					 }

				}

			}
		}catch(IOException  e) {
			System.out.print("Erro ao Ler arquivo");
		}
		
		whiteFile(createNewPath ,sellerQuant, customerQuant, valueMaxTotal, valueMinTotal, piorVendedor, vendedor );
	}
	
	private double dados03(String item03){
		String[] item = item03.split(",");
		double total = 0;
		for (String items : item ) {
			String[] separacao = items.replaceAll("[\\[\\]]","").split("-");
			int quantity = Integer.parseInt(separacao[1]);
			double price = Double.parseDouble(separacao[2]);
			total += quantity * price;
		}
		
		return total;
	
	}
	
	
	private void whiteFile(String createNewPath, int sellerQuant, int customerQuant, String valueMaxTotal, double valueMinTotal,String piorVendedor, String vendedor ) {
		try(BufferedWriter recordd = new BufferedWriter(new FileWriter(createNewPath))){
			recordd.write("Quantidade de Vendedor no arquivo de entrada: " + sellerQuant);
			recordd.newLine();
			recordd.write("Quantidade de Cliente no arquivo de entrada: " + customerQuant);
			recordd.newLine();
			recordd.write("ID da venda mais cara : " + valueMaxTotal  + " vendedor: "  + vendedor);
			recordd.newLine();
			recordd.write("O pior vendedor: "  + piorVendedor + " Total: " +  valueMinTotal );
			
			recordd.close();
		}catch(IOException e) {
			System.out.print("Erro ao gravar Dados");
		}
		
	}
	
}
