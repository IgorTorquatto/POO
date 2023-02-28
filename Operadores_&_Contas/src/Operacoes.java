
public class Operacoes {

	public static void main(String[] args) {
		//Operadores Aritméticos:
		// + - * / % ++ =-
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 % num2);
		
		//Operadores de Comparação:
		// == !=  >  <  >= <=
		
		System.out.println(num1 != num2);
		
		//Operadores Lógicos:
		//&& || !
		
		if ((num1==10)&&(num2==5)) {
			System.out.println("Verdadeiro");
		}
		
		//JAVA MATH
		
		System.out.println(Math.sqrt(9));
		System.out.println(Math.max(3,5));
		System.out.println(Math.random() * 100);
	}
}
