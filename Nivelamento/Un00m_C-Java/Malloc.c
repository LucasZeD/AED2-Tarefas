#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main (int argc, char *argv[]){
	char*    p1 = (char*)    malloc (sizeof(char));
	int*     p2 = (int*)     malloc (sizeof(int));
	float*   p3 = (float*)   malloc (sizeof(float));
	Cliente* p4 = (Cliente*) malloc (sizeof(Cliente));
	int*     p5 = (int*)     malloc (MAXTAM* sizeof(int));
	Cliente* p6 = (Cliente*) malloc (MAXTAM* sizeof(Cliente));
	//
	free(p1);
	free(p2);
	free(p3);
	free(p4);
	free(p5);
	free(p6);
	//
	return 0;
}

/*
	EQUIVALENTE

int main (int argc, char *argv[]){
	char*    p1 = new char;
	int*     p2 = new int;
	float*   p3 = new float;
	Cliente* p4 = new Cliente;
	int*     p5 = new int[MAXTAM];
	Cliente* p6 = new Cliente[MAXTAM];
	//
	delete p1;
	delete p2;
	delete p3;
	delete p4;
	delete [] p5;
	delete [] p6;
	//
	return 0;
}


*/
