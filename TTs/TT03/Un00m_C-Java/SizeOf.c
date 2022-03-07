#include <stdio.h>

int main (int agc, char *argv[]){
	//
	int a = sizeof(char),
	    b = sizeof(int),
	    c = sizeof(double),
	    d = sizeof(float);
	//
	printf("tamanhos: %i --- %i --- %i --- %i", a, b, c, d);
	//
	return 0;
}
