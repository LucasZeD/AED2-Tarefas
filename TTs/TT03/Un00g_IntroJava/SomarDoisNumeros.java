import java.util.*;

class SomarDoisNumeros {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		//Declaracao de variaveis
		int num1, num2, soma;
		//Leituras
		System.out.println("Digite um numero ");
		num1 = sc.nextInt();
		
		System.out.println("Digite outro numero ");
		num2 = sc.nextInt();
		//Somar
		soma = num1 + num2;
		//Mostrar resultado
		System.out.println("Soma: "+ soma);
	}
}