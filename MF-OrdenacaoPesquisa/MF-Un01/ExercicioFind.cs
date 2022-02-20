/*
Fazer um programa que declare um vetor de n inteiros,
preencha o vetor com os números digitados pelo usuário e
em seguida leia e pesquise uma chave usando o método Find da classe Array.
Ao final exiba a mensagem se o dado existe ou não no vetor.
O valor de n pode ser definido a seu critério.
*/
using System;

class MainClass{
    public static void Main (string[] args){
        //Declara e inicializa um vetor de entrada
        int[] vetor= {5, 16, 7, 6, 10};
        //Elemento para pesquisa
        int elemento;
        //Leitura do teclado
        Console.WriteLine("Entre com o valor para pesquisa: ");
        elemento = Convert.ToInt32(Console.ReadLine());
        //Usando o Find para encontrar o elemento
        int index = Array.Find(vetor, item => item == elemento);
        //imprime resposta
        if(index !=0 )
            Console.WriteLine("Valor {0} encontrado!", index);
        else
            Console.WriteLine("Valor nao encontrado!");
    }
}


/* Tentativa Falha
class MainClass {
    public static void Main (string[] args){
        //Quantidade de valores a serem adicionados
        int quantidade;
        // valor a ser pesquisado
        int pesquisado;
        // Declare um vetor de n inteiros.
        int[] vetorN = {0,1};

        // Preencha com os numeros digitados pelo usuario
        quantidade = Convert.ToInt32(
            Console.WriteLine("Quantos numeros deseja adicionar ao vetor:"));
        for (int i=0; i<quantidade; i++){
            Console.WriteLine("Digite o valor de numero [{0}]: ",i);
            vetorN.Add(Convert.ToInt32(Console.ReadLine()));
        }

        //Ler elemento para pesquisa
        Console.Write("Entre com o valor a ser pesquisado: ");
        pesquisado = Convert.ToInt32(Console.ReadLine());

        //Find
        int index = Array.Find(vetorN, item => item == pesquisado);

        //Resposta
        if (index != 0)
            Console.WriteLine("Valor {0} encontrado!", index);
        else
            Console.WriteLine("Valor nao encontrado!");
    }
}
*/