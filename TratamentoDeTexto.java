package desafios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map.Entry;

public class resenhasF {
	
	public static void main(String[] args) {
		
		try {
			FileReader stop = new FileReader("C:\\Users\\Lord\\Desktop\\Faculdade\\stopwords.txt");
			BufferedReader stop_reader = new BufferedReader(stop);
			ArrayList<String> stop_list = new ArrayList<String>();
			String stop_palavra = stop_reader.readLine();
			while(stop_palavra != null) {
				stop_list.add(stop_palavra);
				stop_palavra = stop_reader.readLine();
			}
			
			FileReader corpus = new FileReader("C:\\Users\\Lord\\Desktop\\Faculdade\\corpus.txt");
			BufferedReader corpus_reader = new BufferedReader(corpus);
			String linha = corpus_reader.readLine();
			String[] s;
			
			FileReader qualidades = new FileReader("C:\\Users\\Lord\\Desktop\\Faculdade\\qualidades.txt");
			BufferedReader qualidades_reader = new BufferedReader(qualidades);
			ArrayList<String> qualidades_list = new ArrayList<String>();
			String filter_qualidades = qualidades_reader.readLine();
			while(filter_qualidades != null) {
				qualidades_list.add(filter_qualidades);
				filter_qualidades = qualidades_reader.readLine();
			}
			
			FileReader defeitos = new FileReader("C:\\Users\\Lord\\Desktop\\Faculdade\\defeitos.txt");
			BufferedReader defeitos_reader = new BufferedReader(defeitos);
			ArrayList<String>defeitos_list = new ArrayList<String>();
			String filter_defeitos = defeitos_reader.readLine();
			while(filter_defeitos != null) {
				defeitos_list.add(filter_defeitos);
				filter_defeitos = defeitos_reader.readLine();	
			}
			
			HashMap<String, Integer> mapa_de_palavras = new HashMap<String, Integer>();
			int totalStop = 0, total=0, totQualidades = 0, totDefeitos = 0;
			while(linha != null) {
				s = linha.toLowerCase().split(" ");
			
				for(String palavra : s) {
					total+=1;
					if(!stop_list.contains(palavra)) {
						totalStop +=1;
	
						if(qualidades_list.contains(palavra)) {
							totQualidades += 1;	
						}
						if(defeitos_list.contains(palavra)) {
							totDefeitos += 1;
						}
						if(mapa_de_palavras.get(palavra) == null) {
							mapa_de_palavras.put(palavra, 1);
						}
						else {
							int valor = mapa_de_palavras.get(palavra);
							mapa_de_palavras.put(palavra, valor + 1);
						}
					}
				}
				linha = corpus_reader.readLine();
		
		for(Entry<String, Integer> entrada : mapa_de_palavras.entrySet()) {
			System.out.println(entrada.getKey() + " = " + entrada.getValue());
		}
		}
			System.out.println("O total de palavras (com stopwords): "+totalStop);
			System.out.println("O total de palavras em geral: "+ total);
			System.out.println("Quantidade de adjetivos positivos: " + totQualidades);
			System.out.println("Quantidade de adjetivos negativos: " + totDefeitos);
		stop_reader.close();
		corpus_reader.close();
		}	
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
