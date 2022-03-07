import java.util.Scanner;

class IfElse {
	public static void main (String[] agrs) {
		int num;
		Scanner entrada = new Scanner(System.in);
		//
		System.out.print("Digite um numero: ");
		num = entrada.nextInt();
		//
		if (num < 0)
			System.out.println("O numero "+num+" eh negativo.");
		else
			if (num == 0)
				System.out.println("O numero "+num+" eh zero/nulo.");
			else
				System.out.println("O numero "+num+" eh positivo.");
		//
		entrada.close();
	}
}
