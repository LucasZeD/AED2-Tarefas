#include <iostream>
using namespace std;

int main() {
	int num;
	//
	cout << "Digite um numero: ";
	cin >> num;
	//
	if (num < 0)
		cout << "O numero "<< num << " eh negativo. \n";
	else
		if (num == 0)
			cout << "O numero "<< num << " eh nulo/neutro. \n";
		else
			cout << "O numero "<< num << " eh positivo. \n";
}
