#include <stdio.h>
#define MAXTAM 100

/*
 *
 *	EXEMPLO 1
 *
struct Funcionario {
	int matricula;
	char nome[MAXTAM];
};

//instanciar estrutura forma 2
typedef struct Funcionario Funcionario;

int main (int argc, char *argv[]){
	//instanciar estrutura forma 1
	//struct Funcionario f;

	//instanciar estrutura forma 2
	//Funcionario f;

	//
	printf("\nEntre com matricula: ");
	scanf("%d", &f.matricula);
	//
	printf("\nEntre com o nome: ");
	scanf("%s", f.nome);
	///
	printf("\nMatricula: %d", f.matricula);
	printf("\nNome: %s", f.nome);
}
*/

/*
 *
 * 	EXEMPLO 2
 *
struct Funcionario {
        int matricula;
        char nome[MAXTAM];
};

typedef struct Funcionario Funcionario;

int main (int argc, char *argv[]){c
        Funcionario f;

        //
        printf("\nEntre com matricula: ");
        scanf("%d", &f.matricula);
        //
        printf("\nEntre com o nome: ");
        scanf("%s", f.nome);
        ///
        printf("\nMatricula: %d", f.matricula);
        printf("\nNome: %s", f.nome);
}
*/

/*
 *
 *	EXEMPLO 3
 *
typedef struct Funcionario {
        int matricula;
        char nome[MAXTAM];
} Funcionario;

int main (int argc, char *argv[]){
	Funcionario f;
        //
        printf("\nEntre com matricula: ");
        scanf("%d", &f.matricula);
        //
        printf("\nEntre com o nome: ");
        scanf("%s", f.nome);
        ///
        printf("\nMatricula: %d", f.matricula);
        printf("\nNome: %s", f.nome);
}
*/

/*
 *
 *	EXEMPLO 4
 *
*/
typedef struct Funcionario {
        int matricula;
        char nome[MAXTAM];
} Funcionario;

int main (int argc, char *argv[]){
	Funcionario vet[MAXTAM];
        //
	for (int i=0; i<3; i++) {
		printf("\nEntre com a matricula do funcionario %d: ", (i+1));
		scanf("%d", &vet[i].matricula);
		printf("\nEntre com o nome do funcionario %d: ", (i+1));
		scanf("%s", vet[i].nome);
	}
	for (int i=0; i<3; i++){
		printf("\nMatricula do funcionario %d: %d", (i+1), vet[i].matricula);
		printf("\nNome do funcionario %d: %s", (i+1), vet[i].nome);
	}
}


