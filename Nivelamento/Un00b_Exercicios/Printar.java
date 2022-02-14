/*
Este programa entrará em loop pela falta de condicao de parada.
Esta mostrando dados possivelmente inteiros de subtipos diferentes:
	byte	 8bit
	short	16bit
	int	32bit
	long	64bit
*/

class Printar{
	public static void main (String[] args){
		byte	b=0;
		short	s=0;
		int	i=0;
		long	l=0;
	
		while (true){
			b++; s++; i++; l++;
			//
			System.out.println(b+""+s+""+i+""+l);
		}
	}
}
