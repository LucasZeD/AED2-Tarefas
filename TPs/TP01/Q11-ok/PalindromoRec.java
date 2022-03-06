class PalindromoRec {
    /**
    Encontrar fim
    @param  s       - String a testar
    @return true    - fim     encontrado
    *       false   - fim nao encontrado
    */
    public static boolean isFim (String s){
        return (s.length()==3 && s.charAt(0)=='F'&& s.charAt(1)=='I'&& s.charAt(2)=='M');
    }
    /**
    Testa se Palindromo
    @param  s       -  string a testar
    @param  start   -  primeira posicao
    @param  last    -  ultima posicao
    @return true    - se     for palindromo
    *       false   - se nao for palindromo
    */
    public static boolean isPalindromo (String s, int start, int last){
        //se fim da string
        //  fim atual da string
        int lastAtual = s.length();
        //  funcao logaritmica - 1
        if(((lastAtual/2)-1)==last){
            //fim da string
            return true;
        }
        //testar se nao palindromo
        if(s.charAt(start) == s.charAt(last)){
            //  teste
            //MyIO.println(s.charAt(start)+" - "+s.charAt(last));
            return isPalindromo(s, start+1, last-1);
        }
        //nao palindromo
        return false;
    }
    /**
    Main
    */
    public static void main (String[] args){
        //Variaveis de entrada
        String[] entrada = new String[1000];
        int numEntrada=0;
        //Leitura da entrada padrao
        // while not 'FIM'
        do{
            entrada[numEntrada]=MyIO.readLine();
            //If para impedir e entrada da palavra fim
            if (isFim(entrada[numEntrada])==false)
                //Se palindromo print SIM/NAO
                if(isPalindromo(entrada[numEntrada], 0, entrada[numEntrada].length()-1)==true)
                    MyIO.println("SIM");
                else
                    MyIO.println("NAO");
        } while (isFim(entrada[numEntrada++])==false);
        numEntrada--;   //Desconsidera a linha da palavra FIM
    }
}
