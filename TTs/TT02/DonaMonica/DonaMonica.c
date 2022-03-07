#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int maisVelho (int m, int f1, int f2){
    //filho 3
    int f3 = m-(f1+f2);
    //f1 -> f3 -> f2
    if      (f3<f1 && f3>f2)
            {return f1;}
    //
    else if (f3<f1 && f3<f2)
        // f1 -> f2 -> f3
        if  (f1>f2)
            {return f1;}
        // f2 -> f1 -> f3
        else //f2>f1
            {return f2;}
    //
    else if (f3>f1)
        // f3 -> f1/f2
        if  (f3>f2)
            {return f3;}
        // f2 -> f3 -> f1
        else //f3>f1 && f3<f2
            {return m;}
    // f1=f3
    else if (f1==f3)
        {return f1;}
    // f1==f2
    else if (f1==f2)
        {return f2;}
    // f2=f3
    else
        {return f3;}
}

int main (){
    int m=0;
    int f[3];
    do{
            scanf("%d", &m);
            if(m==0){
                return 0;
            }
            scanf("%d", &f[0]);
            scanf("%d", &f[1]);
            printf("%d\n", maisVelho(m, f[0], f[1]));
    } while (m!=0);
    return 0;
}