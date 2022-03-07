// public static void main (String[] args) {
//                            ^
//                     array de strings
//   valor inicial definido pelo usuario na chamada de um programa

// para executar o teste compile colocando argumentos junto a chamada do prog.
//
// ex1
// java ArgumentoMain algoritmos
//   ^          ^           ^
// compilar  nomeArquivo  argumentos adicionados ao vetor "String[]"
//
// ex2
// java ArgumentoMain algoritmos e estrutura de dados II

class ArgumentoMain{
	public static void main (String [] args){
		System.out.println("Primeiro parametro: "+args[0]);
		System.out.println("Segundo  parametro: "+args[1]);
		System.out.println("Terceiro parametro: "+args[2]);
		System.out.println("Quarto   parametro: "+args[3]);
		System.out.println("Quinto   parametro: "+args[4]);
		System.out.println("Sexto    parametro: "+args[5]);
		//
		System.out.println("Numero de parametros: "+args.length);
	}
}
