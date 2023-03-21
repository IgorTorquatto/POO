package exemplo2;
import exemplo2.Cliente;

public class Conta {
	//Atributos e usando a classe Cliente
	private double saldo;
	private String numero;
	private Cliente cliente;
	
	public Conta(double num, String nume,Cliente c) {
		this.saldo = num;
		this.numero= nume;
		this.cliente = c;
	}
	
	
}
