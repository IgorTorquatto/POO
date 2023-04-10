package poupança;

import conta.Conta;

//Child from "Conta"
//Herda tudo de Conta e adiciona novos atributos e métodos

public class Poupanca extends Conta {
	 private int taxa;
	 
	public Poupanca (String n , double v, int t) {
		super(n,v);
		this.taxa = t;
	}

	public int getTaxa() {
		return taxa;
	}

	public void setTaxa(int taxa) {
		this.taxa = taxa;
	}
	
	
}
