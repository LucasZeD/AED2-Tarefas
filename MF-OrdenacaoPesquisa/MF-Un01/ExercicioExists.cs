using System;
using System.Collections.Generic;

public class Aluno{
    public string Nome;
    public int Matricula;

    //@return - atributos concatenados como string
    public override String ToString(){
        return Nome + " - " + Matricula;
    }
}


class MainClass {
    public static void Menu (){
        Console.WriteLine("1- Para cadastras aluno");
        Console.WriteLine("2- Para pesquisar aluno");
        Console.WriteLine("3- Para mostrar todos alunos");
        Console.WriteLine("4- Para sair.");
    }
    public static void Main (string[] args){
        //Declara e inicializa uma lista de alunos
        // List possibilita dinamismo
        List<Aluno> alunos = new List<Aluno>();
        //variavel para opcao escolhida
        int opcao;
        Menu();
        opcao = Int32.Parse(Console.ReadLine());

        while (opcao != 4){
            switch(opcao){
                case 1: //Leitura de dados de aluno e adicionar
                        //ao array list
                    Aluno temp = new Aluno();
                    Console.WriteLine("informe o nome do aluno: ");
                    temp.Nome = Console.ReadLine();
                    Console.WriteLine("Informe o numero de matricula do aluno");
                    temp.Matricula = Int32.Parse(Console.ReadLine());
                    alunos.Add(temp);
                    break;

                case 2: // Pesquisa aluno pela matricula
                    Console.WriteLine("Informe o numero de matricual do aluno: ");
                    int matricula = Int32.Parse(Console.ReadLine());
                    // Usando o Exists para encontrar o Aluno pela matricula
                    if (alunos.Exists(item => item.Matricula == matricula )){
                        Console.WriteLine("Aluno cadastrado!!!");
                    }
                    else {
                    Console.WriteLine("Aluno nao cadastrado!!!");
                    }
                    break;

                case 3: //Imprime na tela todos os alunos cadastrados
                    foreach (Aluno item in alunos)
                        Console.WriteLine(item.ToString());
                    break;
            }
            Console.ReadKey(); // para pausa
            Console.Clear(); // clear de tela
            Menu(); // exibe menu de opcoes
            opcao = Int32.Parse(Console.ReadLine());
        }
    }
}