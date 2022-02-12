// saida   -> printf()
// entrada -> scanf()

#include <stdio.h>

int main (void) {
	char	nome[20];
	int	idade;
	float	altura;
	//print -> apresentar -> out
	printf	("Digite seu primeiro nome: ");
	//leitura de dados
	//%s -> char
	scanf	("%s", nome);
	printf	("Digite sua idade: ");
	//%d -> int
	scanf	("%d", &idade);
	printf	("Digite sua altura em metros: ");
	//%f -> float
	scanf	("%f", &altura);
	//
	printf ("%s tem %d anos de idade e mede %.2fm.\n", nome, idade, altura);
	return 0;
}
