package exercicio01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Veiculo {
	
	String modelo;
	String placa;
	int ano_veiculo;
	double valor;
	
	void cadastrar_ano (int ano) {
		ano_veiculo = ano;
	}
	
	void cadastrar_placa(String p) {
		placa = p;
	}
	
	void cadastrar_valor(double v) {
		valor = v;
	}
	
	void cadastrar_modelo(String m) {
		modelo = m;
	}
	
	void mostrar_idade () {
		int ano_atual;
		int resultado;
		
		Calendar cal = GregorianCalendar.getInstance();
		ano_atual = cal.get(Calendar.YEAR);
		
		resultado = ano_atual - ano_veiculo;
		
		System.out.println("O veículo possui aproximadamente " + resultado + " ano(s).");
	}
	
	String mostrar_placa() {
		return placa;
	}
	
	String mostrar_modelo() {
		return modelo;
	}
	
	void reducao (double valor_atual) {
		double aux;
		aux = valor - valor_atual;
		
		System.out.printf("O veículo %s ", modelo);
		System.out.printf("foi vendido a %.2f R$",valor);
		System.out.printf(" hoje ele custa %.2f R$",valor_atual);
		System.out.printf(" é uma redução de aproximadamente %.2f R$. \n",aux);
	}
	
}
