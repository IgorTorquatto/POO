package exemplo;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		float base,altura,resultado;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do retângulo: ");
		base = input.nextFloat();
		
		System.out.println("Digite o valor da altura do retângulo: ");
		altura = input.nextFloat();
		
		resultado = base * altura ;
		
		System.out.println("A área será: " + resultado);
			
		input.close();
	}
}
