#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (int argc, char *argv[]){
	int *x1; // pointing to x1
	int  x2; // just x2
	int *x3; // ponting to x1
	//
	// malloc aloca o numero de bytes passados como parametro e retorna
	//  um ponteiro para a primeira posicao da area alocada
	x1 = (int *)malloc(sizeof(int));
	printf("\nx1(%p)(%i)(%p) x2(%i)(%p)  x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);

	//x1 addr = '20' 	
	*x1 = 20;
	printf("\nx1(%p)(%i)(%p) x2(%i)(%p)  x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);

	//x2 = *x1 = '20'
	// portanto x2 = '20'
	x2 = *x1;
	printf("\nx1(%p)(%i)(%p) x2(%i)(%p)  x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);
	
	//x3 addr = x2('20') TIMES x1 addr('20')
	// portanto x3 addr = 20*20
	//          x3 addr = '400'
	*x3 = x2 * *x1;
	printf("\nx1(%p)(%i)(%p) x2(%i)(%p)  x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);
	
	//x3 EQUALS x2 addr
	// portanto x3 = '20'
	x3 = &x2;
	printf("\nx1(%p)(%i)(%p) x2(%i)(%p)  x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);
	
	//x2 = '15'
	// as x3 is &x2, x3 also gets EQUAL to '15'
	// x1='20'; x2 = '15'; x3 '15'
	x2 = 15;
	printf("\nx1(%p)(%i)(%p) x2(%i)(%p)  x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);
	//
	return 0;
}
