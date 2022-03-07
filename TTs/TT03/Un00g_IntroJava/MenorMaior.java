import java.util.Scanner;

class MenorMaior {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		//Declaracao
		int n1 = 0,
		    n2 = 0,
		    n3 = 0,
			maior = 0,
			menor = 0;
		//Leitura
		System.out.print("Digite o primeiro numero inteiro: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo numero inteiro: ");
		n2 = sc.nextInt();
		System.out.print("Digite o terceiro numero inteiro: ");
		n3 = sc.nextInt();
		//Execucao
		if ((n1 > n2) & (n1 > n3)) {
			maior = n1;
			if (n2 < n3)
				{ menor = n2; }
			else
				{ menor = n3; }
		}
		else if ((n2 > n1) & (n2 > n3)) {
			maior = n2;
			if (n1 < n3)
				{ menor = n1; }
			else
				{ menor = n3; }
		}
		else if ((n3 > n1) & (n3 > n2)) {
			maior = n3;
			if (n1 < n2)
				{ menor = n1; }
			else
				{ menor = n2; }
		}
		else
			{ System.out.println("ERRO!"); }
		
		//Apresentacao
		System.out.println("O maior valor eh: "+ maior);
		System.out.println("O menor valor eh: "+ menor);
	}
}
