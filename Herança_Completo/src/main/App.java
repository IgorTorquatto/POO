package main;

import animais.*;

public class App {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Caramelo");
		Gato gato = new Gato("Snowbell");
		Dragao dragao = new Dragao("Bangela");
		
		//Child cachorro da superclasse animal:
		
		cachorro.beber();
		cachorro.lamber();
		cachorro.latir();
		
		//Child gato da superclasse animal:
		
		gato.miar();
		
		//Child dragão da superclasse animal:
		
		dragao.voar();
		dragao.soltarFogo();
	}
}
