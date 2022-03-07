import java.util.*;

class ExemploIf {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		//Declaracao
		int nota;
		//Leitura
		System.out.print("Digite a nota do aluno: ");
		nota = sc.nextInt();
		/* por algum motivo não funcionou
		while (nota > 100 && nota < 0) {
		System.out.print("Por favor, Digite uma nota valida: ");
		nota = sc.nextInt();
		}
		*/
		//Teste
		if(nota >= 80) {
			System.out.println("Parabés, muito bom!");
		}
		else if(nota >= 70 && nota < 80) {
			System.out.println("Parabés, aprovado!");
		}
		else {
			System.out.println("Infelizmente, reprovado.");
		}
	}	
}
