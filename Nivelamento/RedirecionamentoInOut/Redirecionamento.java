//Qual a funcao dos metodos
//	System.out.println()
//	MyIo.println()
//	IO.println()
//	IO.readInt()
//	MyIO.readInt()
//
//	Fazem leitura  do dispositivo padrao de entrada	-> Read / Scan
//				ou
//	      escrevem no dispositivo padrao de saida	-> Print
//
//	E possivel alteralos por meio de redirecionamentos de entrada e saida durante a execucao
//		"  < e >  "
//		<	->	le o arquivo
//		>	->	escreve no arquivo


// Para executar esse programa, compile:
//  javac Redirecionamento.java
// Faca a execucao do programa redirecionando a entrada e saida dos arquivos in.txt e out.txt
//  java Redirecionamento < in.txt > out.txt
// Note que a pre-existencia do out.txt nao se faz necessaria, enquanto a do in.txt se faz.
	class Redirecionamento {
		public static void main (String[] args){
			String	str		= MyIO.readString("Entre com uma palavra: ");
			int	inteiro 	= MyIO.readInt("Entre com um inteiro: ");
			double	real		= MyIO.readDouble("Entre com um real: ");
			char	caractere	= MyIO.readChar("Entre com um caractere: ");
			//
			MyIO.println("Sua string: "+str);
			MyIO.println("Seu inteiro: "+inteiro);
			MyIO.println("Seu real: "+real);
			MyIO.println("Seu caractere: "+caractere);
		}
	}

