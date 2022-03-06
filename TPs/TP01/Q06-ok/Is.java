/**
Crie um método iterativo que recebe uma string e
*   retorna true se a mesma é composta somente por vogais.
Crie outro método iterativo que recebe uma string e
*   retorna true se a mesma é composta somente por consoantes.
Crie um terceiro método iterativo que recebe uma string e
retorna true se a mesma corresponde a um número inteiro.
Crie um quarto método iterativo que recebe uma string e
*   retorna true se a mesma corresponde a um número real.
Na saı́da padrão, para cada linha de entrada, escreva outra de saı́da da seguinte forma
*   X1 X2 X3 X4 onde cada Xi é um booleano indicando se a é entrada é:
*   composta somente por vogais (X1);
*   composta somente somente por consoantes (X2);
*   um número inteiro (X3);
*   um número real (X4).
*   Se Xi for verdadeiro, seu valor será SIM, caso contrário, NÃO.
*/
import java.lang.Math;
import java.text.NumberFormat;
class Is {
    /**
    Encontrar fim
    @param  String a testar
    @return true -> fim     encontrado
    *       false-> fim nao encontrado
    */
    public static boolean isFim (String s){
        return (s.length()==3 && s.charAt(0)=='F'&& s.charAt(1)=='I'&& s.charAt(2)=='M');
    }
    /**
    X1      -> Only Vowels
    @param  -> String a ser testada
    @return ->  true    -> se nao encontrada consoante
    *           false   -> se     encontrada consoante
    */
    public static void x1(String s){
        //array base
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        //inicio cod. pesquisa
        boolean flag = false;
        //pesquise sequencial (string recebida)
        for(int i=0; i<s.length(); i++){
            //flag de resultado de pesq seq
            flag = false;
                //print teste
                //MyIO.println("s->"+s.charAt(i));
            //pesquisa sequencial (vogais)
            for(int j=0; j<10; j++){
                    //print teste
                    //MyIO.println("vowels->"+vowels[j]);
                //testa se char da string == vogal
                if(s.charAt(i)==vowels[j]){
                    flag = true;
                        //print teste
                        //MyIO.println("found->"+vowels[j]);
                    //finaliza a pesquisa
                    j=10;
                }
            }
            //se encontrado consoante nessa letra parar
            if (flag==false){
                //return flag;
                flag = false;
                break;
            }
        }
        //primeiro print n tem espaco
        if(flag == true)
            {MyIO.print("SIM");}
        else
            {MyIO.print("NAO");}
    }
    /**
    X2  -> Only Consonants
    @param  -> String a ser testada
    @return ->  true    -> se nao encontrada vogal
    *           false   -> se     encontrada vogal
    */
    public static boolean x2(String s){
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        boolean flag = false;
        //pesquise sequencial (string recebida)
        for(int i=0; i<s.length(); i++){
            flag = true;
            //testar se numero
            if(s.charAt(i)<65){
                return flag = false;
            }
            //pesquisa sequencial (vogais)
            for(int j=0; j<10; j++){
                //testa se char da string == vogal
                if(s.charAt(i)==vowels[j]){
                    return flag = false;
                }
            }
        }
        return flag;
    }
    /**
    X3  -> Only Integers
    @param  -> String a ser testada
    @return ->  true    -> se encontrado inteiro
    *           false   -> se nao encontrado inteiro
    */
    public static boolean x3(String s){
        boolean flag = false;
        //
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                try{
                    //alocacao para uso do try
                    int temp = Integer.parseInt(s);
                    //System.out.println("\n"+temp);
                    flag = true;
                    temp = 0;
                } catch (NumberFormatException ex){
                    return flag;
                }
            }
        }
        return flag;
    }
    /**
    X4  -> Only Doubles
    */
    public static boolean x4(String s){
        boolean flag = false;
        //
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                // tentar como int
                try{
                    //inteiro tambem eh real
                    int numero = Integer.parseInt(s);
                    //testar se realmente int
                    if(numero%1==0){
                        return flag = true;
                    }
                    //numero nao identificado
                    else{
                        return flag = false;
                    }
                // exception -> nao eh int
                } catch (NumberFormatException ex){
                    //tentar como double 0.0
                    try{
                        Double numero = Double.parseDouble(s);
                        numero++;
                        //System.out.println("\n"+numero);
                        return flag = true;
                    }
                    //exception -> double 0,0
                    catch(NumberFormatException ex1){
                        /** tentativa de identificar double 0,0
                        try{
                            NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
                            Number number = format.parse(s);
                            Double numero = number.doubleValue();
                            //testar se double
                            if(numero%1!=0){
                                return flag = true;
                            }
                            //erro, numero n identificado
                            else{
                                return flag = false;
                            }
                        }
                        //nao identificado
                        catch (NumberFormatException ex3){
                            return flag = false;
                        }*/
                        return flag = false;
                    }
                }
            }
        }
        return flag;
    }
    /**
    */
    public static void Print(boolean resp){
        if(resp == true)
            MyIO.print(" SIM");
        else
            MyIO.print(" NAO");
    }
    /**
    Main
    */
    public static void main (String[] args){
        //MyIO.setCharset("UTF-8");
        //Variaveis de entrada
        String[] entrada = new String[1000];
        int numEntrada=0;
        //Leitura da entrada padrao
        // while not 'FIM'
        do{
            entrada[numEntrada]=MyIO.readLine();
            //If para impedir e entrada da palavra fim
            if (isFim(entrada[numEntrada])==false){
                //Impressora
                //se vogal
                //boolean temp1=x1(entrada[numEntrada]);
                //Print(temp1);
                x1(entrada[numEntrada]);
                //se consoante
                boolean temp2=x2(entrada[numEntrada]);
                Print(temp2);
                //se int
                boolean temp3=x3(entrada[numEntrada]);
                Print(temp3);
                //se double
                boolean temp4=x4(entrada[numEntrada]);
                Print(temp4);
                //proxima linha
                MyIO.println("");
            }
        } while (isFim(entrada[numEntrada++])==false);
        numEntrada--;   //Desconsidera a linha da palavra FIM
    }
}