class Operadores {
	public static void main  (String [] args) {
		int     a = 5,
                	b = 3;
	        int     soma, subt,
	                mult, quoc, resto,
        	        inc, dec;
	        float   divi;
	        //
	        soma = a+b;
	        System.out.println(a+" + "+b+" = "+soma);
		//
        	subt = a-b;
	        System.out.println(a+" - "+b+" = "+subt);
		//
	        mult = a*b;
	        System.out.println(a+" * "+b+" = "+mult);
		//
        	divi = (float)a/b;
        	System.out.println((float)a+" / "+b+" = "+divi);
		//
	        quoc = a/b;
        	System.out.println(a+" / "+b+" = "+quoc);
		//
	        resto = a%b;
        	System.out.println(a+" % "+b+" = "+resto);
		//
	        inc = a;
	        System.out.println("Antes do incremento o valor da variavel inc = "+inc);
        	inc++;
	        System.out.println("Apos o incremento o valor da variavel inc = "+inc);
	        //
        	dec = b;
	        System.out.println("Antes do decremento o valor da variavel dec = "+dec);
	        dec--;
	        System.out.println("Apos o decremento o valor da variavel dec = "+dec);
	}
}

