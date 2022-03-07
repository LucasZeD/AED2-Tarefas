#include <stdio.h> 
#include <string.h>

int main (int argc, char *argv[]){
	int x1, x2, x3;
	int *p;
	//
	x1=11; //'11' - 89Bh
	x2=22; //'22' - 89Ch
	x3=33; //'33' - 89Dh
	//
	p=&x1; //89Bh - 89Eh (p pointing to &x1)
	x2=*p; // x2 = *p -> x2 = '11'
	*p=x3; // *p = x3 -> *p = x1 = '33'
	p=&x3; //89Dh - 89Eh (p pointing to &x3)
	*p=0;  // *p ='0' -> x3 = '0'
	//
	printf("cont: %d %d %d %d\n", x1, x2, x3, *p);
	printf("addr: %p %p %p %p\n", &x1, &x2, &x3, p);

	//
	return 0;
}
