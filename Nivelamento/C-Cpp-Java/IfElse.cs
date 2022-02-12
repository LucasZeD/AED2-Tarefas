using System;

class MainClass {
	public static void Main (string[] args) {
		int num;
		//
		Console.Write("Digite um numero: ");
		num = int.Parse(Console.ReadLine());
		//
		if(num < 0)
			Console.WriteLine("O numero "+num+" eh negativo.");
		else
			if (num == 0)
				Console.WriteLine("O numero "+num+" eh zero/nulo.");
			else
				Console.WriteLine("O numero "+num+" eh positivo.");
	}
}
