class Repeticao{
	public static void main (String[] agrs){
		int area,
		    i =1;
		//
		// base inicia em 1
		// repetira enquando <=5
		// e incrementara de 1 em 1
		for (int base = 1; base <= 5; base++){
			// inicia altura como 2
			// repetira enquando altura <=10
			// altura incrementara de 2 em 2
			for (int altura = 2; altura <= 10; altura += 2, i++){
				// esta utilizando a propria variavel i para incrementar e atualizar
				//  os retangulos
				//
				area = base * altura;
				//
				System.out.println(i+" retangulo");
				System.out.println("============");
				System.out.println("Base = "+base+" e altura = "+altura);
				System.out.println("Area = "+area+"\n");
			}
		}
	}
}
