using System;

/*
 * Exemplo de Preenchimento do vetor com valores strings
 */
class MainClass {
    // Define o tamanho para o vetor
    const int TAM = 5;

    public static void Main (string[] args) {
        //Declaração vetor de com tamanho TAM 
        String[] vetor = new String[TAM];
        
        //Leitura do teclado para as palavras
        for(int i=0; i<vetor.Length; i++){
            Console.Write("Entre com a "+(i+1)+"a. palavra: ");
            vetor[i] = Console.ReadLine();
        }

        //Imprime na tela os valores armazenados no vetor
        Console.Write("Array com valores strings lidos: \n");
        Console.Write("[");
        for(int i=0; i<vetor.Length; i++)
            Console.Write(vetor[i] + ",");
        Console.Write("]\n");


        //Declara novo vetor de strings inicializando
        string[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
        //Outra maneira de iterar sobre o vetor, listando os elementos
        Console.Write("[");
        foreach (string item in carros){
            Console.Write(item + ",");
        }
        Console.Write("]\n");
  }

}