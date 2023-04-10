package br.ufca.serie;

public class App {
	public static void main(String[] args) {
		Serie serie = new Serie("The last of Us", 1, 2023);
		
		//O método toString tem chamada implícita
		//Assim imprimimos todos os atrbutos da classe
		System.out.println(serie);
	}
}
