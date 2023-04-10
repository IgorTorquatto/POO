package animais;

public class Dragao extends Animal{
	private int pessoasDevoradas;
	
	public Dragao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
		pessoasDevoradas = 10;
	}
	
	public void soltarFogo() {
		System.out.printf("%s soltou fogo \n", this.getNome());
	}
	
	public void voar() {
		System.out.printf("%s voou \n", this.getNome());
	}

	public int getPessoasDevoradas() {
		return pessoasDevoradas;
	}

	public void devorarPessoas() {
		pessoasDevoradas++;
	}
	
}
