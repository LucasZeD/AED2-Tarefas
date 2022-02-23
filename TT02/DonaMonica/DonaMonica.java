/**
Dona Mônica é mãe de três filhos que têm idades diferentes. Ela notou que, neste ano, a soma das idades dos seus três filhos é igual à idade dela.
Neste problema, dada a idade de dona Mônica e as idades de dois dos filhos, seu programa deve computar e imprimir a idade do filho mais velho. 
Por exemplo, se sabemos que dona Mônica tem 52 anos e as idades conhecidas de dois dos filhos são 14 e 18 anos,
*    então a idade do outro filho, que não era conhecida, tem que ser 20 anos, pois a soma das três idades tem que ser 52. Portanto, a idade do filho mais velho é 20.
Em mais um exemplo, se dona Mônica tem 47 anos e as idades de dois dos filhos são 21 e 9 anos, então o outro filho tem que ter 17 anos e,
*    portanto, a idade do filho mais velho é 21. 

Entrada : composta por várias linhas, em cada uma temos 3 inteiros sendo a idade de Dona Mônica e dos seus dois filhos mais novos. A última linha contém apenas um zero

Saída : para cada linha de entrada, escreva um número inteiro indicando a idade do filho mais velho
*/

public class DonaMonica {
    /*
    Encontra a idade do terceiro filho baseado na idade da mae e dos outros 2
        @param  m   -> mae 
                f1  -> filho 1
                f2  -> filho 2
                f3  -> filho 3
        @return idade do filho 3
    */
    public static int maisVelho (int m, int f1, int f2){
        //filho 3
        int f3 = m-(f1+f2);
        //f1 -> f3 -> f2
        if      (f3<f1 && f3>f2)
                {return f1;}
        //
        else if (f3<f1 && f3<f2)
            // f1 -> f2 -> f3
            if  (f1>f2)
                {return f1;}
            // f2 -> f1 -> f3
            else //f2>f1
                {return f2;}
        //
        else if (f3>f1)
            // f3 -> f1/f2
            if  (f3>f2)
                {return f3;}
            // f2 -> f3 -> f1
            else //f3>f1 && f3<f2
                {return m;}
        // f1=f3
        else if (f1==f3)
            {return f1;}
        // f1==f2
        else if (f1==f2)
            {return f2;}
        // f2=f3
        else
            {return f3;}
    }

    /*
    Main
    */
    public static void main (String[] args){
        /*Variaveis de entrada
            m   -> mae
            f[] -> array filhos
        */
        int m = 0;
        int f[] = new int [2];
        //Leitura da entrada padrao
        //do while mae != 0
        do{
            //mae
            m = MyIO.readInt();
            //finalizar se passar pelo do
            if(m==0){
                return;
            }
            //filho 1
            f[0]=MyIO.readInt();
            //filho 2
            f[1]=MyIO.readInt();
            //result
            MyIO.println(maisVelho(m, f[0], f[1]));
        }while (m!=0);
    }
}
