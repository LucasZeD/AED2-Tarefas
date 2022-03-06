#include <stdio.h>
#include <string.h> 
#include <stdbool.h>
#include <math.h>

#define NUMLINHA  1000
#define TAMPALAVRA 100

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
X1      -> Only Vowels
@param  -> String a ser testada
@return ->  true    -> se nao encontrada consoante
*           false   -> se     encontrada consoante
*/
void x1(char s[]){
    char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
    //inicio cod. pesquisa
    bool flag = false;
    for(int i=0; i<strlen(s); i++){
        flag = false;
        for(int j=0; j<10; j++){
            if(s[i]==vowels[j]){
                j=10;
                flag=true;
            }
        }
        //se encontrado consoante nessa letra parar
        if (flag==false){
            flag = false;
            printf("NAO");
            break;
        }
    }
    //primeiro print n tem espaco
    if(flag == true)
        {printf("SIM");}
}
/**
X2  -> Only Consonants
@param  -> String a ser testada
@return ->  true    -> se nao encontrada vogal
*           false   -> se     encontrada vogal
*/
bool x2(char s[]){
    char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
    //inicio cod. pesquisa
    int last = strlen(s);
    bool flag = false;
    for(int i=0; i<last; i++){
        flag = true;
        if(s[i]>65){
            for(int j=0; j<10; j++){
                if(s[i]==vowels[j]){
                    return flag = false;
                }
            }
        }
        else{
            return flag = false;
        }
    }
    return flag;
}
/**
X3  -> Only Integers
@param  -> String a ser testada
@return ->  true    -> se encontrado inteiro
*           false   -> se nao encontrado inteiro
*/
bool x3(char s[]){
    bool flag = false;
    int last = strlen(s);
    //inicio cod. pesquisa
    for(int i=0; i<last; i++){
        //48 -> '0'
        //57 -> '9'
        if(s[i]>=48 && s[i]<=57){
            //46 -> '.'
            //44 -> ','
            if(s[i]!=46 || s[i]!=44){
                flag = true;
            }
            else{
                return flag = false;
            }
        }
        else{
            return flag = false;
        }
    }
    return flag;
}
/**
X4  -> Only Doubles
*/
bool x4(char s[]){
    bool flag = false;
    int last = strlen(s);
    //+1 ponto ou virgula = false
    int tempPonto=0;
    //inicio cod. pesquisa
    for(int i=0; i<last; i++){
        //48 -> '0'
        //57 -> '9'
        //46 -> '.'
        //44 -> ','
        if(s[i]>=48 && s[i]<=57 || s[i]==46 || s[i]==44){
            //testa quantos pontos
            if(s[i]==46 || s[i]==44){
                tempPonto++;
                flag = true;
                if(tempPonto>1){
                    return flag = false;
                }
            }
        }
        else{
            return flag = false;
        }
    }
    return flag;
}
/**
*/
void Print(bool resp){
    if(resp == true)
        printf(" SIM");
    else
        printf(" NAO");
}
/**
Main
*/
int main (){
    char entrada[NUMLINHA][TAMPALAVRA];
    int numEntrada=0;
    //Leitura da entrada padrao
    do{
        scanf("%[^\n]%*c", entrada[numEntrada]);
        if (isFim(entrada[numEntrada])==false){
            //se vogal
            x1(entrada[numEntrada]);
            //se consoante
            bool temp2=x2(entrada[numEntrada]);
            Print(temp2);
            //se int
            bool temp3=x3(entrada[numEntrada]);
            Print(temp3);
            //se double
            bool temp4=x4(entrada[numEntrada]);
            Print(temp4);
            //proxima linha
            printf("\n");
        }
    } while (isFim(entrada[numEntrada++])==false);
    numEntrada--;   //Desconsidera a linha da palavra FIM
    //
    return 0;
}