class CiframentoRec {
    /**
    Encontrar fim
    @param  String a testar
    @return true -> fim     encontrado
    *       false-> fim nao encontrado
    */
    public static boolean isFim (String s){
        return (s.length()==3 && s.charAt(0)=='F'&& s.charAt(1)=='I'&& s.charAt(2)=='M');
    }
    /**
    Cifrador
    @param  s       -> string a ser cifrada
    @param  chave   -> chave de cifra
    @return cifrada -> string cifrada
    *
    * 1st error - tempo de exec. muito longo
    */
    public static String cifrador (String s, int i, String cifrada){
        //operating
        if(i == s.length()){
            return cifrada;
        }
        else{
            cifrada += (char)((int)s.charAt(i) + 3);
        }
        //retornar resposta
        return cifrador(s, i+1, cifrada);
    }
    /**
    Main
    */
    public static void main (String[] args){
        //Variaveis de entrada
        String[] entrada = new String[1000];
        int numEntrada=0;
        //variaveis para ciframento
        String cifrada = "";
        //Leitura da entrada padrao
        // while not 'FIM'
        do{
            entrada[numEntrada]=MyIO.readLine();
            //If para impedir e entrada da palavra fim
            if (isFim(entrada[numEntrada])==false)
                //Cifrador
                MyIO.println(cifrador(entrada[numEntrada], 0, cifrada));
        } while (isFim(entrada[numEntrada++])==false);
        numEntrada--;   //Desconsidera a linha da palavra FIM
    }
}
