/** Questao
A ideia básica é um simples deslocamento de caracteres.
Assim, por exemplo, se a chave utilizada para criptografar as mensagens for 3,
todas as ocorrências do caractere ’a’ são substituı́das pelo caractere ’d’, as do ’b’ por ’e’, e assim sucessivamente.
Crie um método iterativo que recebe uma string como parâmetro e retorna outra contendo a entrada de forma cifrada.
Neste exercı́cio, suponha a chave de ciframento três.
Na saı́da padrão, para cada linha de entrada, escreva uma linha com a mensagem criptografada.
*/
class Ciframento {
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
    */
    public static String Cifrador (String s, int chave){
        //Variavel resultado
        String cifrada = "";
        //  testing purpose
        //  System.out.println("String recebida     -> "+s);
        //operating
        for(int i=0; i<s.length(); i++){
            // armazenar em cifrada, chars os quais estao c/ valor alterado em 'chave'
            cifrada += (char)((int)s.charAt(i) + chave);
            //  testing purpose
            //  MyIO.println      ("building resp      -> "+cifrada);
        }
        //  testing purpose
        //  MyIO.println      ("resp                -> "+cifrada);
        //retornar resposta
        return cifrada;
    }
    /**
    Main
    */
    public static void main (String[] args){
        //Variaveis de entrada
        String[] entrada = new String[1000];
        int numEntrada=0;
        int chaveCifra=3;
        //Leitura da entrada padrao
        // while not 'FIM'
        do{
            entrada[numEntrada]=MyIO.readLine();
            //If para impedir e entrada da palavra fim
            if (isFim(entrada[numEntrada])==false)
                //Cifrador
                MyIO.println(Cifrador(entrada[numEntrada], chaveCifra));
        } while (isFim(entrada[numEntrada++])==false);
        numEntrada--;   //Desconsidera a linha da palavra FIM
    }
}
