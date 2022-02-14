/*
O banco do Zé abriu uma linha de crédito para os seus clientes. O valor
máximo da prestação não poderá ultrapassar 40% do salário bruto. Fazer
um algoritmo que permita entrar com o salário bruto e o valor da prestação
e informar se o empréstimo será concedido.
*/
import java.util.Scanner;

public class Banco {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		//Declaracao
		double 	max   = 0.0,
				sal   = 0.0,
				prest = 0.0;
		boolean resp  = false;
		//Leitura
		System.out.print("Digite o salario: ");
		sal = sc.nextDouble();
		System.out.print("Digite o valor da prestacao: ");
		prest   = sc.nextDouble();
		//Execucao
		//40%
		max = ( 0.4 * sal );
		if (prest > max)
			{ resp = false; }
		else if (prest < max)
			{ resp = true; }
		else
			{ System.out.println("ERRO!"); }
		//Apresentacao
		System.out.println("\nStatus da liberacao do emprestimo: "+ resp);
		if (resp == true) {
			System.out.println("\ntrue  -> emprestimo liberado");
		}
		else {
			System.out.println("\nfalse -> emprestimo barrado");
		}
	}
}
