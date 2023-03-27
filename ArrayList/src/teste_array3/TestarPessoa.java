package teste_array3;

import java.util.ArrayList;

public class TestarPessoa {
	public static void main(String[] args) {
		//Criar um arrayList de um objeto:
		
		Pessoa joao = new Pessoa("João",89);
		Pessoa maria = new Pessoa("Maria",17);
		Pessoa carlos = new Pessoa("Carlos",35);
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(joao);
		pessoas.add(carlos);
		pessoas.add(maria);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}
	}
}
