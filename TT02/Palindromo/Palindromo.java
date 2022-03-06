/*

Faça um programa recebe várias frases e identifica se elas são palíndromos
Entrada : composta por várias linhas sendo que a última contém a palavra FIM
Saída: para cada linha de entrada, escreva SIM / NÃO, indicando se a linha é um palíndromo

*/

class Palindromo{
    /*
    Utilizado para leitura de arquivo até encontrar fim
        @param  String a testar
        @return true -> fim     encontrado
                false-> fim nao encontrado
    */
    public static boolean isFim(String s){
        return (s.length()==3 && s.charAt(0)=='F' && s.charAt(1)=='I' && s.charAt(2)=='M');
    }

    /*
    Testa se Palindromo
        @param  String a testar
        @return true -> se     for palindromo
                false-> se nao for palindromo
    */
    public static boolean isPalindromo(String s){
        //last -> tamanho da palavra -1, ou seja, a ultima posicao
        int last = s.length()-1;
        //testa enquanto i menor que a ultima palavra
        for(int i=0; i<last; i++,last--){
            //testar se nao eh palindromo
            if(s.charAt(i) != s.charAt(last)){
                return false;
            }
        }
        //Deu tudo certo
        return true;
    }

    /*
    Main
    */
    public static void main (String[] args){
        //Variaveis de entrada
        String[] entrada = new String[1000];
        int numEntrada=0;
        //Leitura da entrada padrao
        // do while not FIM
        do {
            //
            entrada[numEntrada]=MyIO.readLine();
            //Desconsidera a linha da palavra FIM
            if(isFim(entrada[numEntrada])==false){
                //Se palindromo Print SIM/NAO
                if (isPalindromo(entrada[numEntrada]) == true)
                    System.out.println("SIM");
                else
                    System.out.println("NAO");
            }
        } while (isFim(entrada[numEntrada++])==false);
        numEntrada--;   //Desconsidera a linha da palavra FIM

        /*Se palindromo Print SIM/NAO
        for(int i=0; i<numEntrada; i++){
            if (isPalindromo(entrada[i]) == true)
                System.out.println("TRUE");
            else
                System.out.println("FALSE");
        */
    }
}