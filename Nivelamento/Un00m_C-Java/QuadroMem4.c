#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main (int argc, char *argv[]){
	double M[3][3];
	double *p = M[0];
	//
	for (int i=0; i<pow(MAXTAM, 2); i++, p++){
		*p = 0.0;
	}
	//
	return 0;
}

/*
QuadroMem4.c: In function ‘main’:
QuadroMem4.c:10:22: error: ‘MAXTAM’ undeclared (first use in this function)
   10 |  for (int i=0; i<pow(MAXTAM, 2); i++, p++){
      |                      ^~~~~~
QuadroMem4.c:10:22: note: each undeclared identifier is reported only once for each function it appears in
*/
