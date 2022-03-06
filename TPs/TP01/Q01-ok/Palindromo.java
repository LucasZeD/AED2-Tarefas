/** TP
-1pt -> metodos nao comentados ou comentario inutil

Nao usar metodos das classes ->
*               String, Integer, Double

Metodos permitidos ->
*               charAt(int) int length() -> classe String

Se num int vazio ou nao numero -> recebe zero

Para contar letras considerar ASCII -> A-Z, a-z

Java -> nao utilizar classes IO/Scanner

! charset dos arquivos in/out
*/
/** Questao
Crie um metodo iterativo que recebe uma string como parametro e
*   retorna true se essa é um palı́ndromo.
Na saı́da padrão, para cada linha de entrada,
*   escreva uma linha de saı́da com SIM/NÃO indicando se a linha é um palı́ndromo
A entrada termina com a leitura de FIM
*/

class Palindromo {
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
    Testa se Palindromo
    @param  String a testar
    @param  true -> se     for palindromo
    *       false-> se nao for palindromo
    */
    public static boolean isPalindromo (String s){
        //last -> tamanho da palavra -1 = ultima posicao
        int last = s.length()-1;
        //testa enquanto i < que ultima letra
        for(int i=0; i<last; i++, last--){
            //testar se nao palindromo
            if(s.charAt(i) != s.charAt(last)){
                return false;
            }
        }
        //Se nao encontrado problema
        return true;
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
                if(isPalindromo(entrada[numEntrada])==true)
                    MyIO.println("SIM");
                else
                    MyIO.println("NAO");
        } while (isFim(entrada[numEntrada++])==false);
        numEntrada--;   //Desconsidera a linha da palavra FIM
    }
}
