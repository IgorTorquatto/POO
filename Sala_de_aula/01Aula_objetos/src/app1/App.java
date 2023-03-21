package app1;
import exemplo1.Conta;

public class App {
	
	public static void main(String[] args) {
		//Instânciando:
		Conta a = new Conta("123",0);
		Conta b = a;
		
		//Aliasing (como não estamos criando o objeto b, e sim apenas copiando, ao mudar os valores em b mudaremos em a também)
		b.setSaldo(20);
		
		//Se criarmos o objeto b ele será != de a
		
		System.out.printf("Saldo de a: %.2f \n \n",a.getSaldo());
		
		//Imutabilidade de Strings:
		String velha_string = "Maria";
		String nova_string = velha_string;
		
		velha_string += " outra coisa";
		
		System.out.printf("Velha String: %s \n Nova String: %s \n \n",velha_string,nova_string);
		
		//Entendendo um pouco melhor Strings:
		String s1 ="casa";
		String s2 = "casa";
		String s3 = new String("casa");
		
		System.out.printf("s1 == s2: %b \n",s1==s2);
		System.out.printf("s1 == s3 sem usar método equals: %b \n",s1==s3);
		System.out.printf("s1==s3 usando método equals que compara o valor da string e não a referência: %b \n",s1.equals(s3));
	}
}
