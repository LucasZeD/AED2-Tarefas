import java.util.Scanner;

class Futebol {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		//Declaracao
		//m-mandante
		//v-visitante
		int m, v;
		//Leitura
		System.out.print("Digite o numero de gols do mandante: ");
		m = sc.nextInt();
		System.out.print("Digite o numero de gols do visitante: ");
		v = sc.nextInt();
		//Execucao
		if (m>v)
			{ System.out.println("Vitoria do mandante!"); }
		else if (m<v)
			{ System.out.println("Vitoria do visitante!"); }
		else if (m==v)
			{ System.out.println("Empate."); }
		else
			{ System.out.println("ERRO !");	}
	}
}
