#include <stdio.h>

int main (void) {
	int	a = 5,
	   	b = 3;
	int 	soma, subt,
		mult, quoc, resto,
		inc, dec;
	float 	divi;
	//
	soma = a+b;
	printf("%d + %d = %d\n", a, b, soma);
	//
	subt = a-b;
	printf("%d - %d = %d\n", a, b, subt);
	//
	mult = a*b;
	printf("%d * %d = %d\n", a, b, mult);
	//
	//9/2=4.5 -> um dos operandos deve ser float
	//(float)a -> conversao de a para float
	divi = (float)a/b;
	printf("%f / %d = %f\n", (float)a, b, divi);
	//
	//9/2=4 resto 1 -> a divisao inteira seria 4, pois nao possui nenhum dos valores float
	quoc = a/b;
	printf("%d / %d = %d\n", a, b, quoc);
	//
	//9/2=4 resto 1 -> o resto, "9%2", sera 1
	resto = a%b;
	printf("%d %% %d = %d\n", a, b, resto);
	//
	inc = a;
	printf("Antes do incremento o valor da variavel inc = %d.\n", inc);
	inc++;
	printf("Apos o incremento o valor da variavel inc = %d.\n", inc);
	//
	dec = b;
	printf("Antes do decremento o valor da variavel dec = %d.\n", dec);
	dec--;
	printf("Apos o decremento o valor da variavel dec = %d.\n", dec);
	//
	return 0;

}
