package animais;

public class Animal {
	private String nome;
	
	//Construtor:
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void comer() {
		//<Nome> comeu
		String mensagem = String.format("%s comeu", this.nome);
		System.out.println(mensagem);
	}
	
	public void beber() {
		System.out.printf("%s bebeu \n",this.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
