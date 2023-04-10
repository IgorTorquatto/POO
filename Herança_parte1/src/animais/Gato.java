package animais;

public class Gato extends Animal{ //subclasse Gato herda da superclasse Animal
	
	//construtor:
	public Gato(String nome) {
		super(nome); // os argumentos que eu passar aqui serão usados nos parâmetros do construtor da superclasse
		//super precisa ser a primeira linha do construtor da subclasse
	}
	
	//Métodos específicos da classe gato:
	public void miar() {
		System.out.printf("%s miou \n", this.getNome());
	}
}
