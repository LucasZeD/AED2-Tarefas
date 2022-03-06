/**
Faça um programa que leia um número inteiro n indicando o número de valores reais que devem ser lidos e
*   salvos sequencialmente em um arquivo texto. Após a leitura dos valores, devemos fechar o arquivo.
*
Em seguida, reabri-lo e fazer a leitura de trás para frente usando os métodos
*   getFilePointer e seek da classe RandomAccessFile
*   e mostre todos os valores lidos na tela.
*   getFilePointer  -> retorna posicao corrente
*   seek            -> altera valor (getFilePointer)
*
Nessa questão, você não pode usar, arrays, strings ou qualquer estrutura de dados.
*
A entrada padrão é composta por um número inteiro n e mais n números reais.
A saı́da padrão corresponde a n números reais mostrados um por linha de saı́da.
*/

import java.io.*;

class Arquivo {
    public static void main (String[] args) throws Exception{
        /**
        *   Abrir arquivo
        *   Definir variaveis de entrada
        *   Ler quantidade de valores a serem lidos
        *   Ler e salvar doubles em arquivo
        *   Fechar arquivo
        */
        RandomAccessFile raf = new RandomAccessFile("doubles.txt","rw");
        //
        double  entrada = 0.0;
        int     linha = 0;
        int     quantidade = MyIO.readInt();
        //
        while (linha < quantidade){
            entrada = MyIO.readDouble();
            linha++;
            //
            raf.writeDouble(entrada);
                //testing purpose
                //MyIO.println("entrada -> "+entrada+" ["+linha+"]");
        }
        //
        raf.close();
        /**
        * Reabrir Arquivo
        * Definir variaveis
        * Fazer leitura de tras pra frente
        *   Printar doubles de tras para frente
        * Fechar arquivo
        */
        raf = new RandomAccessFile("doubles.txt", "rw");
        double lido = 0.0;
        //
        for (int j=linha-1; j>=0; j--){
            //(j*8) - retirar do seek os 7sets valores de bits que precedem o index
            raf.seek(j*8);
                //testing purpose
                //MyIO.println("iteracaoSeek -> "+j*8);
            lido = raf.readDouble();
            //se int    -> 1
            //se double -> 1.0
            if(lido == (int)lido){
                MyIO.println((int)lido);
            }
            else {
                MyIO.println(lido);
            }
        }
        //
        raf.close();
    }
}