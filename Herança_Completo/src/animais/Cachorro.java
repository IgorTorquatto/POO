package animais;

public class Cachorro extends Animal {  //Herda todas as informações de Animal
	//Não tem visibilidade ao atributo "nome"
	
	//construtor:
	public Cachorro(String nome) {
		super(nome); // os argumentos que eu passar aqui serão usados nos parâmetros do construtor da superclasse
		//super precisa ser a primeira linha do construtor da subclasse
	}
	
	//Métodos específicos da classe cachorro:
	public void latir() {
		System.out.printf("%s latiu \n",this.getNome());
	}
	
	public void lamber() {
		System.out.printf("%s lambeu \n",this.getNome());
	}
}
