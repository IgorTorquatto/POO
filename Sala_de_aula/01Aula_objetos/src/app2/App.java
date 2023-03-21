package app2;
import exemplo2.Conta;
import exemplo2.Cliente;

public class App {
	public static void main(String[] args) {
		//Só poderemos instanciar um objeto Conta se caso tivermos um cliente criado anteriormente;
		
		Cliente cliente = new Cliente("Igor","123");
		Conta conta = new Conta (0.0,"numeroconta",cliente);
		
		//Essa associação de cliente e conta é do tipo "composição" pois as partes (conta) não existem sem o todo "cliente".
		//Na associação de "agregação" as partes existem independente do todo (ex: parte- pessoa todo- veículo).
	}
}
