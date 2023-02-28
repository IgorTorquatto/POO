
public class EstruturasCondicionais {
	
	public static void main(String[] args) {
		
		int time = 22;
		if (time < 10) {
		  System.out.println("Bom dia.");
		} else if (time < 18) {
		  System.out.println("Boa tarde.");
		} else {
		  System.out.println("Boa noite.");
		}
		
		//Operador ternário:
		String result = (time < 18) ? "Bom dia." : "Boa tarde.";
		System.out.println(result);
		
		//Switch:
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Segunda");
		    break;
		  case 2:
		    System.out.println("Terça");
		    break;
		  case 3:
		    System.out.println("Quarta");
		  case 4:
		    System.out.println("Quinta");
		    break;
		  case 5:
		    System.out.println("Sexta");
		    break;
		  case 6:
		    System.out.println("Sábado");
		    break;
		  case 7:
		    System.out.println("Domingo");
		    break;
		  default:
			System.out.println("Dia da Semana");
		}
	}
	
}
