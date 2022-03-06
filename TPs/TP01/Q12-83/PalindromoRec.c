/**
Refaça em C a questão anterior.
*/
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

#define NUMLINHA    1000
#define TAMPALAVRA  1000



/**
*   Encontrar fim
*   @param  String a testar
*   @return true -> fim     encontrado
*           false-> fim nao encontrado
*/
bool isFim (char s[]){
    return (strlen(s)>=3 && s[0]=='F' && s[1]=='I' && s[2]=='M');
}

/**
*   Testa se Palindromo
*   @param  s       -  string a testar
*   @param  start   -  primeira posicao
*   @param  last    -  ultima posicao
*   @return true    - se     for palindromo
*           false   - se nao for palindromo
*/
bool isPalindromo (char *entrada, int iterador, bool resp){
    memset(entrada, 0, sizeof(entrada));
    int lastAtual = strlen(entrada);
    //
    if (iterador >= (lastAtual / 2))
        return resp;
    else
    {
        if (entrada[iterador] == entrada[(lastAtual)-iterador])
            return isPalindromo(entrada, resp, ++iterador);
        else
            return isPalindromo(entrada, false, lastAtual - 1);
    }
}

/**
Main
*/
int main (){
    //
    char entrada[10000];
    int tamanho = strlen(entrada);
    //
    bool resp = true;
    //
    do{
        memset(entrada, 0, sizeof(entrada));
        //scanf("%[^\n]%*c", entrada);
        fgets(entrada, 100, stdin);
        if(tamanho>0 && entrada[tamanho-1]=='\n'){
            entrada[tamanho-1]='\0';
        }
        if (isFim(entrada)==false){
            resp = isPalindromo(entrada, 0, true);
            if (resp==true)
                printf("NAO\n");
            else
                printf("SIM\n");
        }
    } while (isFim(entrada)==false);
    return 0;
}