package exemplo1;

public class Conta {
	//Atributos
	 private String numero;
	 private double saldo;
	 
	//Construtor
	public Conta(String num,double saldo) {
		this.numero = num;
		this.saldo = saldo;
	}
	
	//Métodos geters and seters
	public void setNumero (String num) {
		this.numero = num;
	}
	
	public String getNumero () {
		return this.numero;
	}
	
	public void setSaldo(double num) {
		this.saldo = saldo + num;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
