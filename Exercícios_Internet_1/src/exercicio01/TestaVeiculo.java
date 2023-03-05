package exercicio01;

public class TestaVeiculo {
	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		Veiculo veiculo2 = new Veiculo();
		
		//Cadastro veiculo1: 
		
		veiculo.cadastrar_ano(2010);
		veiculo.cadastrar_modelo("Fiat Palio");
		veiculo.cadastrar_placa("BRA2E19");
		veiculo.cadastrar_valor(50000);
		
		System.out.println("Placa do veículo: "+veiculo.mostrar_placa());
		System.out.println("Modelo do veículo: "+veiculo.mostrar_modelo());
		veiculo.reducao(15000);
		veiculo.mostrar_idade();
		System.out.println("\n");
		
		//Cadastro veiculo2:
		veiculo2.cadastrar_ano(2013);
		veiculo2.cadastrar_modelo("Hyundai HB20");
		veiculo2.cadastrar_placa("BRA1E16");
		veiculo2.cadastrar_valor(48755);
		
		
		System.out.println("Placa do veículo: "+veiculo2.mostrar_placa());
		System.out.println("Modelo do veículo: "+veiculo2.mostrar_modelo());
		veiculo2.reducao(35000);
		veiculo2.mostrar_idade();
		System.out.println("\n");
	}
}
