#include <iostream>

using namespace std;

int main(void) {
	float base, altura, area;
	//
	cout << "Digite 0 para parar." << endl;
	//
	do{
		cout << "Digite a base do retangulo: ";
		cin >> base;
		//
		// nao eh a maneira mais eficiente
		if (base > 0){
			cout <<	"Digite a altura do retangulo: ";
			cin >> altura;
			//
			area = base * altura;
			//
			cout << "A area do retangulo = " << area << endl;
		}
	}while (base > 0);
	//
	return 0;
}
