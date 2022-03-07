#include <iostream>
using namespace std;

int main (void) {
        int     a = 5,
                b = 3;
        int     soma, subt,
                mult, quoc, resto,
                inc, dec;
        float   divi;
        //
        soma = a+b;
        cout << a << " + " << b << " = " << soma << "\n";
        //
        subt = a-b;
        cout << a << " - " << b << " = " << subt << "\n";
        //
        mult = a*b;
        cout << a << " * " << b << " = " << mult << "\n";
        //
        divi = (float)a/b;
        cout << a << " / " << b << " = " << divi << "\n";
        //
        quoc = a/b;
        cout << a << " / " << b << " = " << quoc << "\n";
        //
        resto = a%b;
        cout << a << " % " << b << " = " << resto << "\n";
        //
        inc = a;
        cout << "Antes do incremento o valor da variavel inc = " << inc << ".\n";
        inc++;
        cout << "Apos o incremento o valor da variavel inc = " << inc << ".\n";
        //
        dec = b;
        cout << "Antes do decremento o valor da variavel dec = " << dec << ".\n";
        dec--;
        cout << "Apos o decremento o valor da variavel dec = " << dec << ".\n";
        //
        return 0;

}
