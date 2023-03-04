package conta;

public class TestaConta {
	public static void main(String[] args) {
		
		Conta c = new Conta();
		c.saldo = 30;
		c.numero = "111";
		c.creditar(10);
		System.out.println(c.consultarSaldo());
		System.out.println("Número do cliente: "+c.numero);

	}
}
