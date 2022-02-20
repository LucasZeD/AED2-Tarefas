/*
Considerando o exemplo da questão da Classe Alunos da seção anterior,
implemente o gerenciamento de alunos de forma que
o campo chave passa a ser a matricula.
Assim, em cada novo cadastrado o aluno será adicionado no vetor
e ao executar a Pesquisa Sequencial por alunos,
a matricula informada deve ser comparada com todos os elementos
do vetor.
*/

using System;
using System.Collections.Generic;

/*
    Definicao da Classe Aluno
*/
public class Aluno{
    public string Nome {get; set;}
    public int Matricula {get; set;}
    //@return - atributor concatenados como string
    public override String ToString(){
        return Nome + " - " + Matricula;
    }
}

/*
    Exemplo de Pesquisa para um vetor com Alunos
*/
class MainClass{
    /*
        Menu para exibicao das opcoes
    */
    public static void Menu(){
        Console.WriteLine("1 - Para cadastrar aluno");
        Console.WriteLine("2 - Para pesquisar aluno por matricula");
        Console.WriteLine("3 - Para mostrar todos alunos");
        Console.WriteLine("4 - Para sair...");
    }

    /*
        Pesquisa Sequencial
        Busca alunos pelo campo chave matricula
        @return true/false como resposta da pesquisa
    */
    public static bool PesquisaAlunos(Aluno[] vetor, int limite, int chave){
        bool resp = false;
        for (int i=0; i<limite; i++){
            if(vetor[i].Matricula==chave){
                resp=true;
                i=limite;
            }
        }
        return resp;
    }
    
    /*
        Main
    */
    public static void Main (string[] args){
        //Declara e inicializa um vetor para alunos
        Aluno []alunos = new Aluno[20];
        int count = 0;  //Contador para alunos
        //Variavel para opcao escolhida
        int opcao;
        Console.Clear();
        Menu();
        opcao=Int32.Parse(Console.ReadLine());

        while(opcao!=4){
            switch(opcao){
                //Leitura de dados do aluno e adiciona no Vetor de Alunos
                case 1:
                    Aluno temp = new Aluno();
                    Console.WriteLine("Informe o nome do aluno: ");
                    temp.Nome = Console.ReadLine();
                    Console.WriteLine("Informe o numero de matricula: ");
                    temp.Matricula=Int32.Parse(Console.ReadLine());
                    alunos[count]=temp;
                    count++;
                    break;
                //Pesquisa aluno pela matricula
                case 2:
                    Console.WriteLine("Informe o numero de matricula");
                    int matricula = Int32.Parse(Console.ReadLine());
                    //Usando' pesquisa sequencial para encontrar o aluno pela matricula
                    if (PesquisaAlunos(alunos, count, matricula)){
                        Console.WriteLine("Aluno cadastrado!!!");
                    }
                    else{
                        Console.WriteLine("Aluno nao cadastrado!!!");
                    }
                    break;
                //Imprime na tela todos os alunos cadastrados
                case 3:
                    for(int i=0; i<count; i++)
                        Console.WriteLine(alunos[i].ToString());
                    break;
            }
            //para pausa
            Console.ReadKey();
            //clear de tela
            Console.Clear();
            //exibe menu de opcoes
            Menu();
            opcao=Int32.Parse(Console.ReadLine());
        }
    }
}