package main;
import java.util.Scanner;

import pessoa.Pessoa;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		String nome;
		int idade;
		
		System.out.println("Insira seu nome: ");
		nome = input.next();
		System.out.println("Insira sua idade: ");
		idade = input.nextInt();
		
		pessoa.cadastrar(nome, idade);
	}
}
