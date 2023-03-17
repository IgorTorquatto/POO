package main;
import festa.*;

public class Main {
	public static void main(String[] args) {
		//Como qtdcafe está private não podemos alterá-lo por aqui.
		//Só temos acesso ao entrar já que é o único que está public.
		//A intenção é fazer com que só métodos importantes sejam exibos fora da classe do nosso objeto.
		Festa festa = new Festa();
		festa.entrar();
	}
}
