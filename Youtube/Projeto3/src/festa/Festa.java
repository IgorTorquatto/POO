package festa;

public class Festa {
	//<modificador> <tipo> <variavel>
	private int qtdcafe = 100;
	private String nome = "Festa Dev";
	
	private int beberCafe() {
		return qtdcafe--;
	}
	
	private void imprimirNome() {
		System.out.println(nome);
	}
	
	public void entrar () {
		imprimirNome();
		beberCafe();
		System.out.println(qtdcafe);
	}
}
