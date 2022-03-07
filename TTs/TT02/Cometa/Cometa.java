/**

O cometa Halley é um dos cometas de menor período do Sistema Solar, completando uma volta em torno do Sol a cada 76 anos.
Na última ocasião em que ele tornou-se visível do planeta Terra, em 1986,
*   várias agências espaciais enviaram sondas para coletar amostras de sua cauda e assim confirmar teorias sobre suas composições químicas. 

Escreva um programa que, dado o ano atual, determina qual o próximo ano em que o cometa Halley será visível novamente do planeta Terra.
Se o ano atual é um ano de passagem do cometa, considere que ele já passou neste ano, logo, nesse caso, considere sempre o próximo ano de passagem,
*   não considerando o ano atual. 

Entrada : composta por várias linhas, em cada uma temos um ano entre 2020 e 3000. A última linha contém apenas um zero
Saída   : para cada linha de entrada, escreva um número inteiro indicando o ano da próxima passagem
*/

public class Cometa {
    /*
    Testa se chegou ao fim do arquivo neste caso 0
        @param  Inteiro a ser testado se 0
        @return true -> fim     encontrado
                false-> fim nao encontrado
    */
     public static boolean isZero (int n){
        return (n==0);
    }

    /*
    Calcula quando sera o proximo ano do ciclo do cometa Harley
        @param n    -> data recebida (ano atual)
        @return     -> retorna int para ser impresso
    */
    public static int whenCometa (int n){
        //Ultimo Ciclo 1986
        int lastCicle = 1986,
        // 1986+76 -> ultimo ciclo + 1
            nextCicle = lastCicle+76;

        //Se ano atual = cometa -> ano atual + 76anos
        if( (lastCicle+76)%n == 1 ){
        //if ( (n-lastCicle)%76 == 0 ){
            return n + 76;
        }
        //Ano atual != cometa
        else {
            //passamos o ciclo até ser menor que cometa (estar no intervalo)
            while (n >= nextCicle){
                nextCicle = nextCicle + 76;
            }
            return nextCicle;
        }
    }
    
    /*
    Main
    */
    public static void main (String[] args){
        //Variaveis de entrada
        int entrada[] = new int[1000];
        int numEntrada=0;
        //Leitura da entrada padrao
        //do while not 0
        do{
            //
            entrada[numEntrada]=MyIO.readInt();
            //Desconsidera a linha do 0
            if(isZero(entrada[numEntrada])==false){
                System.out.println(whenCometa(entrada[numEntrada]));
            }
        }while (isZero(entrada[numEntrada++])==false);
        numEntrada--;   //Desconsidera a linha do 0
    }
}
