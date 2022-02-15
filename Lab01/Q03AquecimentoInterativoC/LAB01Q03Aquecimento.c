#include <stdio.h>
//strlen
#include <string.h>
//nao ha bool nativo em c
#include <stdbool.h>

#define MAXTAM 1000
#define TAMLIN 1000

bool isFim (char* s)
	{ return (strlen(s)>=3 && s[0]=='F' && s[1]=='I' && s[2]=='M'); }

// NAO SEI POR QUE ESSA FUNCAO NAO FUNCIONA, NAO SEI OQ ESTOU FAZENDO ERRADO!
/* ERRO
LAB01Q03Aquecimento.c: In function ‘contarLetrasMaiusculas’:
LAB01Q03Aquecimento.c:32:21: warning: passing argument 1 of ‘isMaiuscula’ makes pointer from integer without a cast [-Wint-conversion]
   32 |   if ( isMaiuscula(s[pos]) == true){
      |                    ~^~~~~
      |                     |
      |                     char
LAB01Q03Aquecimento.c:20:25: note: expected ‘char *’ but argument is of type ‘char’
   20 | bool isMaiuscula (char* c){
*/
// isFim(String s)	-> isFim(char *s)	<string.h>
// s.length()		-> strlen(s)
// s.charAt(x)		-> s[x]
//bool isMaiuscula (char* c){
//	int pos = 0;
//	return ((c[pos]>='A' && c[pos]<='Z'));
//}

// isFim(String s)	-> isFim(char *s)	<string.h>
// s.length()		-> strlen(s)
// s.charAt(x)		-> s[x]

int contarLetrasMaiusculas (char* s){
	int resp = 0;
	for (int pos=0; pos<strlen(s); pos++){
		//if ( isMaiuscula(s[pos]) == true){
		if ( s[pos]>='A' && s[pos]<='Z'){
			resp++;
		}
		else {
			//do nothing
		}
	}
	return resp;
}

//public static void main (String[] args){
// String[]	-> char[]**	
// args		-> int argc	args -> arg string arg
int main (){
	// instanciar string
	//String[] entrada = new String[1000];
	// [MAXTAM][TAMLIN] encontrada na web
	//  nao consegui sem usar eles, tive muitos erros que nao consegui
	//  resolver
	char entrada[MAXTAM][TAMLIN];
	int numEntrada=0;
	
	//leitura
	do {
		//entrada[numEntrada] = MyIO.readLine();
		//MyIO.readLine() -> fgets (name, sizeof(name), stdin);
		//www.programiz.com/c-programming/c-strings
		// troca de sizeof(name) -> TAMLIN, retirado da web, nao
		//  nao consegui fazer de outra maneira
		fgets(entrada[numEntrada], TAMLIN , stdin);
	} while (isFim(entrada[numEntrada++])==false);
	//desconsiderar 'FIM'
	numEntrada--;
	
	//checar
	for (int i=0; i<numEntrada; i++){
		//MyIO.println(contarLetrasMaiusculas(entrada[i]));
		printf("%d\n", contarLetrasMaiusculas(entrada[i]));
	}
	//
	return 0;
}

