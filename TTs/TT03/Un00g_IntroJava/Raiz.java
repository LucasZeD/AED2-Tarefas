import java.util.Scanner;

class Raiz {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		//Declaracao
		double  n1    = 0.0,
			n2    = 0.0,
			maior = 0.0,
			menor = 0.0,
			raiz  = 0.0,
			log   = 0.0;
		//Leitura
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o segundo numero : ");
		n2 = sc.nextDouble();
		//Execucao
		//maior
		if (n1>n2) {
			maior = n1;
			menor = n2;
		}
		else {
			maior = n2;
			menor = n1;
		}
		//raiz
		raiz = Math.cbrt(menor);
		//log
		log  = Math.log(menor)/Math.log(maior);
		//Resultado
		System.out.println("Raiz do menor valor: "+ raiz);
		System.out.println("Log  do menor/maior: "+ log);
		
	}
}
/*
Leia dois números reais e imprima a raiz cúbica do menor e o logaritmo do
menor considerando o maior como a base desse logaritmo.
*/
