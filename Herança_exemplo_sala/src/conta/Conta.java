package conta;

public class Conta {

	protected String nome; 
	protected double saldo; //Childs têm acesso


	public Conta(String nome, double saldo){
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
