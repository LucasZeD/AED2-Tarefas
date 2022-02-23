#include <stdio.h>
#include <string.h>
#include <stdbool.h>

#define NUMLINHA    1000
#define TAMPALAVRA  100

//String s      -> char s[]
//s.length()==3 -> tamanho igual a 3
//strlen(s) >=3 -> tamanho menor ou igual a 3
//charAt(i)     -> s[0]
bool isFim(char s[]){
        return (strlen(s)>=3 && s[0]=='F' && s[1]=='I' && s[2]=='M');
}


bool isPalindromo(char s[]){
    //s.length() -> strlen
    int last = strlen(s)-1;
    //
    for(int i=0; i<last; i++, last--){
        //s.charAt() -> s[posicao]
        if(s[i] != s[last]){
            return false;
        }
    }
    return true;
}

int main(){
    //String[] entrada = new String [1000];
    char entrada[NUMLINHA][TAMPALAVRA];
    int numEntrada=0;
    //
    do{
        //entrada[numEntrada]=MyIO.readLine();
        // scanf("%[^\n]%*c" -> ??????
        scanf("%[^\n]%*c", entrada[numEntrada]);
        //Desconsidera a linha da palavra FIM
        if(isFim(entrada[numEntrada])==false){
            //Se palindromo Print SIM/NAO
            if (isPalindromo(entrada[numEntrada]) == true)
                    printf("SIM\n");
                else
                    printf("NAO\n");
        }
    } while (isFim(entrada[numEntrada++])==false);
    numEntrada--;   //Desconsidera a linha da palavra FIM
}