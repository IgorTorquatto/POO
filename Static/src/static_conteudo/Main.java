package static_conteudo;

public class Main {
	public static void main(String[] args) {
		//Com o método estático não precisamos instânciar/ criar o objeto para ter acesso a suas funções
		
		//Quando temos um método estático ele só consegue acessar outro métodos ou variáveis que também sejam estáticos
		System.out.println("Área quadrado lado 2: " + String.valueOf(Static.AreaQuadrado(2)));
	}
}
