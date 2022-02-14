import java.util.Scanner;

public class MaiorMenor2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		//Declaracao
		int 	maior = 0,
			menor = 99999999;
		int[]	array = new int[10];
		//Leitura
		for (int i = 0; i < array.length; i++){
			System.out.print("Digite um numero inteiro ["+i+"]: ");			
			array[i] = sc.nextInt();
		}
		//Execucao
		//baseado em pesquisa sequencial]
		//maior
		for (int i=0; i < array.length; i++) {
			if (array[i] > (maior)) {
				maior = array[i];
			}
		}
		//menor
		for (int i=0; i < array.length; i++) {
			if (array[i] < (menor)) {
				menor = array[i];
			}
		}
		//Apresentacao
		System.out.println("O maior valor eh: "+ maior);
		System.out.println("O menor valor eh: "+ menor);	
	}
}
