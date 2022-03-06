/**
Refaça em C a questão anterior.
*/
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

#define NUMLINHA    1000
#define TAMPALAVRA  100

/**
Encontrar fim
    @param  String a testar
    @return true -> fim     encontrado
    *       false-> fim nao encontrado
*/
bool isFim (char s[]){
    return (strlen(s)>=3 && s[0]=='F' && s[1]=='I' && s[2]=='M');
}

/**
Testa se Palindromo
@param  String a testar
@param  true -> se     for palindromo
*       false-> se nao for palindromo
*/
bool isPalindromo (char s[]){
    int last = strlen(s)-1;
    for(int i=0; i<last; i++, last--){
        if(s[i] != s[last]){
            return false;
        }
    }
    return true;
}

/**
Main
*/
int main (){
    char entrada[NUMLINHA][TAMPALAVRA];
    int numEntrada=0;
    //
    do{
        scanf("%[^\n]%*c", entrada[numEntrada]);
        if (isFim(entrada[numEntrada])==false){
            if (isPalindromo(entrada[numEntrada])==true)
                printf("SIM\n");
            else
                printf("NAO\n");
        }
    } while (isFim(entrada[numEntrada++])==false);
    numEntrada--;
}