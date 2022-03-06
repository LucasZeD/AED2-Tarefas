/**
Crie um método iterativo que recebe uma string,
*   sorteia duas letras minúsculas aleatórias (código ASCII ≥ ’a’ e ≤ ’z’),
*   substitui todas as ocorrências da primeira letra na string pela segunda e
*   retorna a string com as alterações efetuadas.
Na saı́da padrão, para cada linha de entrada, execute o método desenvolvido nesta questão e
*   mostre a string retornada como uma linha de saı́da.
Abaixo, observamos um exemplo de entrada supondo que para a primeira linha as letras sorteados foram o
*    ’a’ e o ’q’. Para a segunda linha, foram o’e’ e o ’k’
*/
import java.util.Random;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

class alteracao {
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
    Randomizador
    @param  s           -> string a ser randomizada
    @param  c1          -> letra minuscula aleatoria [0]
    @param  c2          -> letra minuscula aleatoria [1]
    @return randomizada -> string cifrada
    */
    public static String Randomizer (String s, char c1, char c2){
        //Variavel resultado
        String randomizada = "";
        //
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c1){

                randomizada += c2;
                
            }
            else{
                randomizada += s.charAt(i);
            }
        }
        //retornar resposta
        return randomizada;
    }
    /**
    Main
    */
    public static void main(String[] args){
        //Radom
        Random gerador = new Random();
        gerador.setSeed(4);
        //Variaveis de entrada
        String entrada = ("");
        //Leitura da entrada padrao
        do{
            entrada=MyIO.readLine();
            //If para impedir entrada da palavra fim
            if (isFim(entrada)==false){
                char c1 = ((char)('a'+(Math.abs(gerador.nextInt())%26)));
                char c2 = ((char)('a'+(Math.abs(gerador.nextInt())%26)));
                MyIO.println(Randomizer(entrada, c1, c2));
            }
        } while (isFim(entrada)==false);
    }
}

