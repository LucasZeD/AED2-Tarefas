#include <stdio.h>
#include <string.h>
#include <stdbool.h>

#define NUMLINHA    1000
#define TAMPALAVRA  100

bool isZero (int n){
    return (n==0);
}

int whenCometa (int n){
    int lastCicle = 1986,
        nextCicle = lastCicle+76;
    if((lastCicle+76)%n==1){
        return n + 76;
    }
    else {
        while (n >= nextCicle){
            nextCicle=nextCicle+76;
        }
        return nextCicle;
    }
}

int main(){
    int entrada[TAMPALAVRA];
    int numEntrada=0;
    do{
        scanf("%d", &entrada[numEntrada]);
        if(isZero(entrada[numEntrada]==false)){
            printf("%d\n", whenCometa(entrada[numEntrada]));
        }
    } while (isZero(entrada[numEntrada++])==false);
    numEntrada--;
}