package desafios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class atv_avaliativa_1918704 {

	public static void main(String[] args) {
		String caminhoArqCsv = "C:\\Users\\Lord\\Desktop\\Faculdade\\movimento.csv";
		String caminhoArqTxt = "C:\\Users\\Lord\\Desktop\\Faculdade\\Saldos_filiais.txt";
			
		try {
			FileReader arquivoCsv = new FileReader(caminhoArqCsv);
			BufferedReader leitorCsv = new BufferedReader(arquivoCsv);
			FileWriter arqSaldos = new FileWriter(caminhoArqTxt, true);
			PrintWriter gravador = new PrintWriter(arqSaldos);
			
			String[] s;
			String linha = ",";
			HashMap<String, Integer> listaValores = new HashMap<String, Integer>();
			
			linha = leitorCsv.readLine();
			while(linha != null) {
				s = linha.split(",");
					if(listaValores.get(s[0]) == null ) {
						listaValores.put(s[0], Integer.parseInt(s[1]));
					}
					else {
						listaValores.put(s[0],(listaValores.get(s[0])+ Integer.parseInt(s[1])));
					}
				linha = leitorCsv.readLine();
			}		
			
		for(Entry<String, Integer> filiaisEntry : listaValores.entrySet()) {
			gravador.write("Filial n° " + filiaisEntry.getKey() + "\t Soma do caixa: " + filiaisEntry.getValue() + System.lineSeparator());
			System.out.println(("FIlial n° " + filiaisEntry.getKey() + "\t Soma do caixa: " + filiaisEntry.getValue() + System.lineSeparator()));;
		}
		
		arquivoCsv.close();
		leitorCsv.close();
		arqSaldos.flush(); 
		arqSaldos.close();
		gravador.close(); 
	}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage()+ "\n Por favor, verifique se o nome do arquivo está correto.\n Ou se ele existe na pasta.");
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		} finally {
		}

	}

}
