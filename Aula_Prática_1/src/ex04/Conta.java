package ex04;

public class Conta {
	
	public double saldo;
	public String usuario;
	
	public void cadastrarUsuario(String user) {
		usuario = user;
	}
	
	public double consultarSaldo() {
		//Importante para não haver a ocultação de informações (Hidden information)
		return saldo;
	}
	
	public void sacar (double valor) {
		
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
	
	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido.");
			return;
		}
		saldo = saldo + valor;
	}
	
}
