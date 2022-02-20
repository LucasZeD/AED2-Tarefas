using System;
using System.Collections.Generic;

class MainClass{
    public static void Main (string[] args){
        // Cria um vetor de Pontos com 5 elementos
        Ponto[] pontos = {
            new Ponto(100, 200), new Ponto (150,250),
            new Ponto(250, 375), new Ponto (275, 395),
            new Ponto(295, 450)};
        
        // Obtem o primeiro ponto que satisfaca o predicado
        // Array.Find(vetor, predicado)
        Ponto first = Array.Find(pontos, p => p.X * pY > 100000);

    }
}