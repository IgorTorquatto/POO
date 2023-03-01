package PrimeiroPrograma;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		int x;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valo inteiro: ");
		x = scan.nextInt();
		scan.close();
		
		int divisor = 2;
		boolean achouDivisor = false;
		
		while(!achouDivisor && divisor < x) {
			if(x% divisor ==0) {
				achouDivisor = true;
			}else {
				divisor++;
			}
		}
		
		if (achouDivisor) {
			System.out.println("Não é um número primo.");
		}else {
			System.out.println("É um número primo");
		}
	}
}
