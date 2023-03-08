package ex03;

import java.util.Scanner;

import ex04.Conta;

public class TestaConta {
	public static void main(String[] args) throws InterruptedException {
		Conta c = new Conta();
		c.saldo = 0;
		
		boolean sair;
		sair = false;
		
		while (sair != true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Digite o número da operação que você quer realizar: ");
			System.out.println("\n 1- Consultar saldo \n 2- Sacar \n 3- Depositar \n 4- Sair");
			int entrada = input.nextInt();
			
			if (entrada == 1) {
				System.out.println("Seu saldo é de: "+ c.consultarSaldo());
				Thread.sleep(2000);
			}
			
			if (entrada == 2) {
				System.out.println("Digite o valor do saque: ");
				double valor;
				valor = input.nextDouble();
				
				c.sacar(valor);
				
				Thread.sleep(2000);
			}
			
			if (entrada == 3) {
				System.out.println("Digite o valor do depósito: ");
				double valor;
				valor = input.nextDouble();
				
				c.depositar(valor);
				
				Thread.sleep(2000);
			}
			
			if (entrada == 4 ) {
				sair = true;
				input.close();
			}
			
		}
	}
}
