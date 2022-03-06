    /**
Crie um método iterativo que recebe uma string contendo uma expressão booleana e
*   o valor de suas entradas e
*   retorna um booleano indicando se a expressão é verdadeira ou falsa.
Cada string de entrada é composta por um número inteiro n indicando o número de entradas da expressão booleana corrente.
Em seguida, a string contém n valores binários (um para cada entrada) e a expressão booleana.
Na saı́da padrão, para cada linha de entrada, escreva uma linha de saı́da com SIM / NÃO indicando se a expressão corrente é verdadeira ou falsa
*/
public class Algebra {
    /**
    Encontrar fim
    @param  String a testar
    @return true -> fim     encontrado
    *       false-> fim nao encontrado
    */
    public static boolean isZero (String s){
        //return (s.length()==3 && s.charAt(0)=='F'&& s.charAt(1)=='I'&& s.charAt(2)=='M');
        return (s.length()==1 && s.charAt(0)=='0');
    }
    /**
    Main
    */
    public static void main (String[] args){
        //MyIO.setCharset("UTF-8");
        //Variaveis de entrada
        String[] entrada = new String[1000];
        int numEntrada=0;
        //Leitura da entrada padrao
        // while not 'FIM'
        do{
            entrada[numEntrada]=MyIO.readLine();
            //If para impedir e entrada da palavra fim
            if (isFim(entrada[numEntrada])==false)
                break; //temp
        } while (isFim(entrada[numEntrada++])==false);
        numEntrada--;   //Desconsidera a linha da palavra FIM
    }
}
