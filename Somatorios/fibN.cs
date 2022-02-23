using System;

class MainClass{
    //int n -> n-th value to be found
    //@return n
    //utilizando tabela de fibonacci dada no slide 43 -> unidade02_somatorio
    public static int Fib (int n){
        //fib(1)->1
        if(n == 1 ){
            return n;
        }
        //fib(0)->1
        else if(n==0){
            return 1;
        }
        //fib(n)=fib(n-1)+fib(n-2)
        else {
            return Fib(n-1)+Fib(n-2);
        }
    }
    //main
    public static void Main (string[] args){
        //n-th value to be found
        int value;
        //read n-th value
        do {
            Console.WriteLine("Digite o enehsimo termo a ser encontrado: ");
            value = Int32.Parse(Console.ReadLine());
        }while (value < 0);
        //write resut
        Console.Write("Fib(" + value + "): ");
        Console.WriteLine(Fib(value));
    }
}
