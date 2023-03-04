package ex03;

public class Conta {
	
	double saldo;
	String usuario;
	
	double consultarSaldo() {
		return saldo;
	}
	
	void sacar (double valor) {
		
		if (valor < 0) {
			System.out.println("Valor inválido.");
			return;
		}
		
		if ( valor > saldo) {
			System.out.println("Impossível realizar a operação porque seu saldo é insuficiente.");
			return;
		}
		saldo = saldo - valor;
	}
	
	void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido.");
			return;
		}
		saldo = saldo + valor;
	}
	
}
