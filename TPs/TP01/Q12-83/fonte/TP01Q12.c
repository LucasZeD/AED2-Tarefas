#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// verifica se uma palavra eh um palindromo

int palindromo(char palavra[], int f, int i);
int isFim(char palavra[]);
int main();

int palindromo(char palavra[], int last, int start)
{
    if (last == (strlen(palavra) / 2) - 1) // se chegar na posicao (metade + 1), deve parar
    {
        return 1;
    }
    else if (palavra[last] == palavra[start])
    {
        return palindromo(palavra, last - 1, start + 1);
    }

    return 0;
} // fim int palindromo recursivo

int isFim(char palavra[])
{
    if (strcmp(palavra, "FIM") == 0)
    {
        return 1;
    }

    return 0;
} // compara a string com "FIM"

int main()
{
    int numEntrada = 0;
    char entrada[800][1000];
    scanf(" %[^\n]", entrada[numEntrada]);
    entrada[numEntrada][strlen(entrada[numEntrada+1])] = '\0';
    
    while (!(isFim(entrada[numEntrada])))
    {
        numEntrada++;
        scanf(" %[^\n]", entrada[numEntrada]);
        entrada[numEntrada][strlen(entrada[numEntrada+1])] = '\0';
    }
    for (int j = 0; j < numEntrada; j++)
    {
        if (palindromo(entrada[j], strlen(entrada[j]) - 1, 0))
        {
            printf("SIM\n");
        }
        else
        {
            printf("NAO\n");
        }
    }
    return 0;
} // fim int main
