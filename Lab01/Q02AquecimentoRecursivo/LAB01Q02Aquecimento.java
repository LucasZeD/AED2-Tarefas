class LAB01Q02Aquecimento {
	// testa se maiuscula
	// se dentro do intervalo de maiusculas
	public static boolean isMaiuscula (char c)
	{ return (c >='A' && c <= 'Z'); }

	/*
	  Testa se chegou o fim do arquivo
	  Recebe string s
	   testa se string possui tamanho de 3
	   testa se char na pos 0 -> F
	                    pos 1 -> I
	                    pos 2 -> M

	  Retorna positivo se fim
	*/
	public static boolean isFim(String s)
	{ return (s.length()==3 && s.charAt(0)=='F' && s.charAt(1)=='I' && s.charAt(2)=='M'); }

	// aparentemente o metodo ja esta recursivo, nao entandi por que este metodo esta no
	//  LAB01Q01, deveriamos entao alterar o Q01, alterarei ele para fazer iterativo.
	//
	// resp=1+contarLetrasMaiusculas (s, pos+1);
	//  isso é um metodo recursivo, nao ?
	// Fiquei horas pensando e tentando encontrar uma solucao, creio que o lab01q01 esta
	//  com a solucao recursiva em vez de iterativa.
	public static int contarLetrasMaiusculas (String s, int pos){
      		int resp = 0; 
      		if(pos < s.length()){
         		if(isMaiuscula(s.charAt(pos)) == true){
				resp = 1 + contarLetrasMaiusculas (s, pos + 1);
         		}
			else {
            			resp = contarLetrasMaiusculas (s, pos + 1);
         		}
      		}
      		return resp;
   	}	

	//
	public static void main (String[] args) {
		String[] entrada = new String[1000];
		int numEntrada = 0;

		// Leitura da entrada padrao ate encontrar fim
		do {
			// entrada[index no array]
			// =
			// leitura (IO read line, nao usar Scanner)
			entrada[numEntrada]=MyIO.readLine();

			// enquanto isFim for false, rodará.
			// isFim(entrada->string s + index do array)
			// 
			// Nao entendi o [numEntrada++], por que '++' ?
		} while (isFim(entrada[numEntrada++])==false);
		// Desconsidera utltima linha contendo 'FIM'
		numEntrada--;

		// Para cada linha de entrada, gerando uma de saida contendo o
		//  numero de letras maiusculas da entrada ??
		// Por que i<numEntrada ?
		for (int i=0; i<numEntrada; i++) {
			MyIO.println(contarLetrasMaiusculas(entrada[i], 0));
		}
		
	}
}
