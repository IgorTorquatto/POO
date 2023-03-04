package conta;

public class Conta {
	//Vamos começar a orientação a objetos com esse exemplo:
	
	//Atributos:
	String numero;
	double saldo;
	String nome, sobrenome;
	
	//Métodos:
	double consultarSaldo() {
		return saldo;
	}
	
	void creditar (double v) {
		saldo += v;
	}
	
	void debitar (double v) {
		saldo -= v;
	}
	
}

