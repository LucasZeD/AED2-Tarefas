//saida   -> cout << , '<<' indica que os dados estao indo em direcao ao cout para realizar a saida
//entrada -> cin >>  , '>>' os dados estao entrando pelo objeto cin e indo para a variavel indicada

#include <iostream>
using namespace std;

int main (void){
	char	nome[20];
	int	idade;
	float	altura;
	//
	//texto sendo direcionado ao objeto "cout" para ser apresentado
	cout << "Digite seu nome: ";
	//valor de entrada sendo direcionado ao objeto "nome" para ser armazenado
	cin >> nome;
	cout << "Digite sua idade: ";
	cin >> idade;
	cout << "Digite sua altura: ";
	cin >> altura;
	//
	cout << nome << " tem " << idade << " anos de idade e mede " << altura << "m.\n";
	return 0;	
}
