#include <stdio.h>

int main (){
    /**
    *   Abrir arquivo
    *   Definir variaveis de entrada
    *   Identificador de erro de abertura de arquivo
    *   Ler quantidade de valores a serem lidos
    *       Ler e salvar doubles em arquivo
    *   Fechar arquivo
    */
    FILE *p = fopen("doubles.txt","w");
    //
    double entrada = 0.0;
    int linha = 0;
    int quantidade = 0;
    scanf("%d", &quantidade);
    //
    if(p==NULL){
        printf("Nao foi possivel abrir o arquivo!");
        return 0;
    }
    //
    while (linha < quantidade){
        scanf("%lf", &entrada);
        fwrite(&entrada, sizeof(double), 1, p);
        //
        linha++;
        //testing purpose
        //printf("Entrada -> %f [%d]\n", entrada, linha);
    }
    //
    fclose(p);
    /**
    * Reabrir Arquivo
    * Definir variaveis
    * Identificador de erro de abertura de arquivo
    * Fazer leitura de tras pra frente
    *   Printar doubles de tras para frente
    * Fechar arquivo
    */
    p = fopen("doubles.txt", "r");
    //
    double lido = 0.0;
    int k = 1;
    //
    if(p==NULL){
        printf("Nao foi possivel abrir o arquivo!");
    }
    //
    fseek(p, 0, SEEK_END);
    for(int j=linha-1; j>=0; j--){
        fseek(p, j*8, SEEK_SET);
        //testing purpose
        //printf("iteracaoSeek -> %d [%d]\n", (j*8), k);
        //k++;
        //
        fread(&lido, sizeof(double), 1, p);
        //
        if(lido == (int)lido){
            printf("%d\n", (int)lido);
        }
        else{
            //%g suppress zeros
            printf("%g\n", lido);
        }
    }
    //
    fclose(p);
    return 0;
}