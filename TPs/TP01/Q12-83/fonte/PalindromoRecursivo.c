#include <stdbool.h>
#include <stdio.h>
#include <string.h>

bool checarPalindromo(char *frase, bool verificador, int posicaoInit)
{
    if (posicaoInit >= (strlen(frase) / 2))
        return verificador;
    else
    {
        if (frase[posicaoInit] == frase[(strlen(frase) - 1) - posicaoInit])
            return checarPalindromo(frase, verificador, ++posicaoInit);
        else
            return checarPalindromo(frase, false, strlen(frase) - 1);
    }
}

int main(void)
{
    char fim[4] = "FIM";
    char frase[1000];
    bool verificador;
    int valorDoFim = 0;
    do
    {
        memset(frase, 0, sizeof(frase));
        fgets(frase, 100, stdin);
        if ((strlen(frase) > 0) && (frase[strlen(frase) - 1] == '\n'))
        {
            frase[strlen(frase) - 1] = '\0';
        }
        valorDoFim = strcmp(frase, fim);
        if (valorDoFim != 0)
        {
            verificador = checarPalindromo(frase, true, 0);
            if (verificador == true)
            {
                printf("SIM\n");
            }
            else
            {
                printf("NAO\n");
            }
        }
    } while (valorDoFim != 0);
    return 0;
}