#include <stdio.h>

int main (void) {
	int num;
	//
	printf("Digite um numero: ");
	scanf("%d", &num);
	//
	if(num < 0)
		printf("O numero %d eh negativo.\n", num);
	else	
		if (num == 0)
			printf("O numero %d eh nulo/neutro.\n", num);
		else
			printf("O numero %d eh positivo.\n", num);
	return 0;

}
