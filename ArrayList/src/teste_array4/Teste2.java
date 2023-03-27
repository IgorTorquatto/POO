package teste_array4;

import java.util.ArrayList;
import java.util.Collections;

public class Teste2 {
	public static void main(String[] args) {
		//Ordenar array de Strings:
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Eva");
		nomes.add("Adão");
		nomes.add("Lugi");
		nomes.add("Zack");
		
		//sort -> Ordenar
		
		Collections.sort(nomes);
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
