//Saida   -> Console.Write() ; Console.WriteLine()
//Entrada -> Console.ReadLine()

using System;

class MainClass {
	public static void Main (string[] args) {
		//string equivale a char, mas melhorado
		string	nome;
		int 	idade;
		float	altura;
		//
		Console.Write("Digite seu primeiro nome: ");
		//Console Read Line sempre retorna string por isso devem ocorrer parses dependendo do tipo
		nome	= Console.ReadLine();
		Console.Write("Digite sua altura: ");
		//Converte string para int -> int.Parse(Console.ReadLine());
		idade	= int.Parse(Console.ReadLine());
		Console.Write("Digite sua altura em metros: ");
		altura	= float.Parse(Console.ReadLine());
		//
		Console.WriteLine(nome+" tem "+idade+" anos de idade e mede "+altura+"m.");
	}
}
