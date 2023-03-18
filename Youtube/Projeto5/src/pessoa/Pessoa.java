package pessoa;

public class Pessoa {
	//Atributos:
	private String nome;
	private int idade;
	private float altura;
	
	//Método construtor:
	//<visibilidade> <nome classe> (){}
	
	public Pessoa(String nome,int idade,float altura) {
		//Primeiro método a ser executado
		//Definimos nos atributos os valores iniciais de um objeto.
		//Por convenção usar no máximo três ou quatro parâmetros, se precisar de mais fazemos métodos set.
		System.out.println("Pessoa criada com sucesso.");
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		imprimirDados();
		
	}
	
	//Métodos get e setters:
	
	public int getIdade() {
		return idade;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Outros Métodos:
	public void imprimirDados() {
		System.out.printf("Nome: %s, idade: %d, altura: %.2f \n",
				getNome(),
				getIdade(),
				getAltura());
	}
	
}
