class Shift{
	public static void main (String[] args){
		int x=23,
		    y=23;
		//
		x = x << 1;
		y = y >> 1;
		//
		System.out.println("["+x+"-"+y+"]");
	}
}

/*
Por que 46 - 11

<< -> Deslocamento de bit a esquerda
>> -> Deslocamento de bit a direita

Insere zero a posicao vazia

<< LEFT SHIFT
	0b00000100 ->  4(10)
	0b00001000 ->  8(10)
	0b00010000 -> 16(10)
	0b00100000 -> 32(10)
	
	Left shift equivale a multiplicar por 2.
	Neste exemplo, para ir de 4 a 32, fazemos 3 left shifts, ou seja, 4*2^3,
		onde 3 é a quantidade de shifts.

>> RIGHT SHIFT
	Ja no caso do Right Shift é o contrario, estamos dividindo por 2.
	acompanhando os bits acima, se sairmos de	100000(2) -> 32(10) para
							   100(2) ->  4(10), estamos
		fazendo 3 right shifts, 32*2^-3
*/
