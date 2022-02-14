import java.util.Scanner;

class Maior {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		//Declaracao
		int maior = 0;
		int[] array = new int[10];
		//Leitura
		for (int i = 0; i < array.length; i++){
			System.out.print("Digite um numero inteiro ["+i+"]: ");			
			array[i] = sc.nextInt();
		}
		//Execucao
		//baseado em pesquisa sequencial
		for (int i=0; i < array.length; i++) {
			if (array[i] > (maior)) {
				maior = array[i];
			}
		}
		//Apresentacao
		System.out.println("O maior valor eh: "+ maior);
	
	}
}
