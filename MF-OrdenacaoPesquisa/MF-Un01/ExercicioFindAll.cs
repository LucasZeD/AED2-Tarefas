/*
Preencha um vetor com valores literais (palavras) e
imprima na tela todas as palavras cujo prefixo é igual
a um valor informado pelo usuário
*/

using System;

class MainClass{
    public static void Main (string[] args){
        //Preencha um vetor com valores literais (palavras)
        String[] vetor = {"Rato", "Sapo", "Sapato", "Ratoeira", "Mato"};
        
        //Elemento para pesquisa
        String prefix;
        
        //Prefixo é igual a um valor informado pelo usuário
        Console.Write("Entre com o prefixo para pesquisa: ");
        prefix=Console.ReadLine();

        //FindAll
        String[] resp = Array.FindAll(vetor, item => item.StartsWith(prefix));
        
        //Imprima na tela todas as palavras cujo prefixo...
        foreach(String palavra in resp)
            Console.WriteLine(palavra);
    }

}