using System;

class MainClass {
	public static void Main (string[] args) {
		double	baseRet = 0,
			altura  = 0,
			area    = 0;
		//
		Console.WriteLine("Digite um numero negativo para parar. ");
		//
		// tambem repetira enquando a base for >=0
		// i -> mostra qual retangulo esta sendo calculado
		// baseRet -> e a condicao de parada e a base do retangulo
		// Esse e um for nao convencional, utiliza duas condicoes diferentes
		//  uma para sinalizacao e a outra como condicao de parada dependente do usuario.
		//  este for esta funcionando como um while
		for (int i=1; baseRet >=0; i++) {
			//
			Console.Write("Digite a base do {0} retangulo: ", i);
			baseRet = double.Parse(Console.ReadLine());
			//
			if (baseRet >=0 ) {
				Console.Write("Digite a altura do "+i+" retangulo: ");
				altura = double.Parse(Console.ReadLine());
				//
				area=baseRet*altura;
				//
				Console.WriteLine("A area do {0} retangulo = {1}.\n", i, area);
			}
		}
	}
}
