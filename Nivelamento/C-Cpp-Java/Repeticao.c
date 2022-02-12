#include <stdio.h>

int main(void) {
	float base, altura, area;
	//
	printf("Digite 0 para parar.\n");
	printf("Digite a base do retangulo: ");
	scanf("%f", &base);
	//
	//enquanto a base for maior que zero o programa continuara rodando.
	while(base > 0) {
		printf("Digite a altura do retangulo: ");
		scanf("%f", &altura);
		//
		area = base*altura;
		//
		//
		printf("A area do retangulo = %.1f\n", area);
		printf("Digite a base do retangulo: ");
		scanf("%f", &base);
	}
	return 0;
}
