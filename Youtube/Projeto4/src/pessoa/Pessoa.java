package pessoa;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int idade;
	Scanner input = new Scanner(System.in);
	
	// get -> pegar  	getNomeVariável
	// set -> alterar   setNomeVariável
	
	public void cadastrar (String nome,int idade) {
		getNome(nome);
		getIdade(idade);
		mostrarDados();
		System.out.println("Deseja alterar o nome? [s/n]");
		String resposta = input.next();
		
		if (resposta.equals("s")) {
			setNome();
			mostrarDados();
		}else {
			System.out.println("Nenhum dado alterado");
		}
		
		
	}
	
	private void getNome(String nome) {
		//O this se refere ao nome da classe Pessoa e não ao do parâmetro.
		this.nome = nome;
	}
	
	private void getIdade(int idade) {
		this.idade = idade;
	}
	
	private void mostrarDados() {
		System.out.printf("Seu nome é %s e sua idade é %d.\n",nome,idade);
	}
	
	private void setNome() {
		System.out.println("Digite o novo nome: \n");
		String novoNome= input.next();
		this.nome = novoNome;
	}
}
