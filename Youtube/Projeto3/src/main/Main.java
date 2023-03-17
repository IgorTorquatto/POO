package main;
import festa.*;

public class Main {
	public static void main(String[] args) {
		//Como qtdcafe está private não podemos alterá-lo por aqui.
		//Só temos acesso ao entrar já que é o único que está public.
		Festa festa = new Festa();
		festa.entrar();
	}
}
