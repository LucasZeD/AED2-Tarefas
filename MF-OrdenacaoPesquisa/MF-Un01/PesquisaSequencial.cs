/*
preencha um vetor de números de forma aleatória e
pesquise elementos neste vetor utilizando o
algoritmo de Pesquisa Binária? Tema 3-1 -> Pesquisa Sequencial.
Ao final de cada pesquisa, imprima na tela a resposta ao usuário e
o número de comparações que foram efetuadas na execução.
*/
using System;

class MainClass{
    //Define o tamanho para o vetor
    const int TAM = 100;

    //Preenche com valores aleatorios
    public static void preencher(int[] vetor){
        Random rnd = new Random();
        Console.Write("\n[ ");
        for(int i=0; i<TAM; i++){
            vetor[i]=rnd.Next(100);
            Console.Write(vetor[i]+" ");
        }
        Console.Write(" ]\n\n");
    }

    //Pesquisa o elemento chave no vetor
    //@return true/false
    public static bool pesquisaSequencial (int[] vetor, int chave){
        bool flag = false;
        //num comparacoes
        int comp = 0;
        for(int i=0; i<TAM; i++){
            comp++;
            if(vetor[i]==chave){
                flag = true;
                //finaliza a pesquisa
                i = TAM;
            }
        }
    Console.WriteLine("Quantidade de Comparacoes "+ comp);
    return flag;
    }

    //Main
    public static void Main (string[] args){
        //Inicializar array
        int[] vetor = new int[TAM];
        //Preencher vetor com funcao preencher
        preencher(vetor);
        //Entrada de chave de pesquisa
        Console.WriteLine("Entre com um numero: ");
        int num = Int32.Parse(Console.ReadLine());
        //Realizar pesquisa
        bool resp = pesquisaSequencial(vetor, num);
        //Apresentar resposta ao usuario
        if (resp==true)
            Console.WriteLine("Elemento "+num+" encontrado!!");
        else
            Console.WriteLine("Elemento "+num+" nao encontrado!!!");
    }
}
