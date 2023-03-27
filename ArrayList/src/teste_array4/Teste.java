package teste_array4;

import java.util.ArrayList;
import java.util.Collections;

public class Teste {
	public static void main(String[] args) {
		//Ordenar um array Integer:
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(38);
		numeros.add(288);
		numeros.add(-38);
		numeros.add(8);
		
		//sort -> ordenar
		
		Collections.sort(numeros);
		
		//For each para imprimir
		
		// variavel que itera e captura cada elemento do array : array
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
	}
}
