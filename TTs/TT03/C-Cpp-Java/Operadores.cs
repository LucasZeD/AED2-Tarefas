using System;

class MainClass {
	public static void Main  (string [] args) {
		int     a = 5,
                	b = 3;
	        int     soma, subt,
	                mult, quoc, resto,
        	        inc, dec;
	        float   divi;
	        //
	        soma = a+b;
	        Console.WriteLine(a+" + "+b+" = "+soma);
		//
        	subt = a-b;
	        Console.WriteLine(a+" - "+b+" = "+subt);
		//
	        mult = a*b;
	        Console.WriteLine(a+" * "+b+" = "+mult);
		//
        	divi = (float)a/b;
        	Console.WriteLine((float)a+" / "+b+" = "+divi);
		//
	        quoc = a/b;
        	Console.WriteLine(a+" / "+b+" = "+quoc);
		//
	        resto = a%b;
        	Console.WriteLine(a+" % "+b+" = "+resto);
		//
	        inc = a;
	        Console.WriteLine("Antes do incremento o valor da variavel inc = "+inc);
        	inc++;
	        Console.WriteLine("Apos o incremento o valor da variavel inc = "+inc);
	        //
        	dec = b;
	        Console.WriteLine("Antes do decremento o valor da variavel dec = "+dec);
	        dec--;
	        Console.WriteLine("Apos o decremento o valor da variavel dec = "+dec);
	}
}

