package teste_array1;

import java.util.ArrayList;

public class Teste1 {
	public static void main(String[] args) {
		//Formas de criar um array:
		//Primeira:
		String[] nomes_estatico = new String[3];
		for(int i=0;i < 3;i++) {
			nomes_estatico[i] = "Nome" + String.valueOf(i+1);
			System.out.println(nomes_estatico[i]);
		}
		
		//Segunda:
		
		String[] nomes2 = {"Joao","Maria\n"};
		System.out.printf(nomes2[0]);
		System.out.printf(nomes2[1]);
		
		//Tamanho com length
		
		/*
		 O array tem um problema de que a declaração estática limita bastante em alguns casos;
		 por isso surgiu o arraylist;
		*/
		
		
		
		//ArrayList<Tipo> nome = new ArrayList<Tipo> ()
		
		//Classe ArrayList , usamos métodos para manipular elementos
		//Expansível
		//Quando adicionamos um elemento novo cria novo array +50% do array anterior
		
		ArrayList<String> nomes_dinamico = new ArrayList<String>();
		
		nomes_dinamico.add("Goku"); //indice 0
		nomes_dinamico.add("Naruto"); //indice 1
		
		for(int i = 0;i<nomes_dinamico.size();i++) {
			System.out.printf(nomes_dinamico.get(i));
		}
		
		//Tamanho com size, para pegar o conteudo não é com o índice como no estático.
		//Usamos métodos, nesse caso o "get" e passamos no método get o índice.
		
		
		//Remove:
		
		//remove por índice
		
		nomes_dinamico.remove(1);
		System.out.printf("\n %s \n \n",nomes_dinamico);
		
		//Clear
		
		//exclui tudo e limpa o array
		
		nomes_dinamico.clear();
		
		
		ArrayList <String> arrayDinamico = new ArrayList<String>();
		
		for (int i = 0; i < 5 ; i++) {
			arrayDinamico.add("Nome" + String.valueOf(i+1));
		}
		
		//ForEach para percorrer ArrayList:
		
		// Extrai cada elemento do array e cria como a variável "nome":
		
		for(String nome: arrayDinamico) {
			System.out.println(nome);
		}
	}
}
