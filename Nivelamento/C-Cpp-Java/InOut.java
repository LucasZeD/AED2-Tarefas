//saida   -> System.out.print() ; System.out.println()

//entrada -> É necessario criar um objeto do tipo scanner, portando deve-se instanciar o objeto scanner
//	     Scanner teclado = new Scanner(System.in);
//	     	tipo scanner, objeto TECLADO, sendo o nome teclado arbitrario.
//	     String s = teclado.nextLine();
//	     	leitura de string, sendo TECLADO, referente ao nome dado.
//	     int num = teclado.nextInt();
//	     	leitura de inteiro
//	     float num2 = teclado.nextFloat();
//	     	leitura de float


//importar classe scanner para fazer a entrada de dados
import java.util.Scanner;

class InOut {
	public static void main (String[] args) {
		String	nome;
		int	idade;
		float	altura;
		// instanciar objeto scanner
		Scanner entrada = new Scanner(System.in);
		//
		System.out.print("Digite seu primeiro nome: ");
		//entrada de linha -> nextLine();
		nome	= entrada.nextLine();
		System.out.print("Digite sua idade: ");
		//entrada de inteiro -> nextInt();
		idade	= entrada.nextInt();
		System.out.print("Digite sua altura em metros: ");
		//entrada de float -> nextFloat();
			//Exception in thread "main" java.util.InputMismatchException
			//at java.base/java.util.Scanner.throwFor(Scanner.java:939)
			//at java.base/java.util.Scanner.next(Scanner.java:1594)
			//at java.base/java.util.Scanner.nextFloat(Scanner.java:2496)
			//at InOut.main(InOut.java:33)
			//
			//Erro encontrado e resolvido.
			//Neste caso Ouve um Mismatch, quando o input entregue nao coincidiu com o 
			//formato de input, nesse caso, meu sistema utiliza "." como float mas o java
			//utilizou o ",".
			//Quando e escrita a altura com0 1.78, apresenta este erro.
			//Quando e escrita a altura como 1,78, o mesmo nao aparece e o resultado ainda
			// sim e apresentado "e mede 1.78", mesmo que tenha sido escrito 1,78.
			//
			//Para corrigir uma sugestao encontrada no stackoverlow e
			//	Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
			//	ainda a testar e conferir com o professor.

		altura	= entrada.nextFloat();
		//
		System.out.println(nome+" tem "+idade+" anos de idade e mede "+altura+"m.");
		// fechar objeto entrada
		entrada.close();
	}
}
