class LAB01Q01Aquecimento {
   public static boolean isMaiuscula (char c){
      return (c >= 'A' && c <= 'Z');
   }

   public static boolean isFim(String s){
      return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
   }

   /*
    Metodo recusivo e deveria estar iterativo
   public static int contarLetrasMaiusculas (String s, int pos){
      int resp = 0; 
      if(pos < s.length()){
         if(isMaiuscula(s.charAt(pos)) == true){
            resp = 1 + contarLetrasMaiusculas (s, pos + 1);
         } else {
            resp = contarLetrasMaiusculas (s, pos + 1);
         }
      }
      return resp;
   }
   */
   
   //Transformando o metodo acima em iterativo
   //public static int contarLetrasMaiusculas (String s, int pos){
   public static int contarLetrasMaiusculas (String s){
	int resp = 0; 
	for (int pos=0; pos<s.length(); pos++){
		if(isMaiuscula(s.charAt(pos))==true){
			resp++;
		}
		else{
			//nothing, antes era a recursao,
			// agora nao faz nada pois se nao for maiuscula
			// nao eh necessario fazer recursao pois temos uma iteracao
		}
	}
	return resp;
   }

   public static void main (String[] args){
      String[] entrada = new String[1000];
      int numEntrada = 0;

      //Leitura da entrada padrao
      do {
         entrada[numEntrada] = MyIO.readLine();
      } while (isFim(entrada[numEntrada++]) == false);
      numEntrada--;   //Desconsiderar ultima linha contendo a palavra FIM

      //Para cada linha de entrada, gerando uma de saida contendo o numero de letras maiusculas da entrada
      for(int i = 0; i < numEntrada; i++){
         //MyIO.println(contarLetrasMaiusculas(entrada[i], 0));
         MyIO.println(contarLetrasMaiusculas(entrada[i]));
      }
   }
}
