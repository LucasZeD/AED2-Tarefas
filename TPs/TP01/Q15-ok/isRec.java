import java.lang.Math;
import java.text.NumberFormat;

class isRec {
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
    public static boolean x1(String s, int start){
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        int last = s.length();
        //testa se fim
        if (start == last){
            return true;
        }
        //procura pelas vogais
        for(int j=0; j<10; j++){
            if(s.charAt(start)==vowels[j]){
                return x1(s, start+1);
            }
        }
        //se encontrado consoante nessa letra parar
        return false;
    }
    /**
    X2  -> Only Consonants
    @param  -> String a ser testada
    @return ->  true    -> se nao encontrada vogal
    *           false   -> se     encontrada vogal
    */
    public static boolean x2(String s, int start){
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        int last = s.length();
        //testa se fim
        if(start==last){
            return true;
        }
        //se numero
        if(s.charAt(start)<65){
            return false;
        }
        //se voltar retorna falso
        for(int j=0; j<10; j++){
            if(s.charAt(start)== vowels[j]){
                return false;
            }
        }
        //consoante
        return x2(s, start+1);
    }
    /**
    X3  -> Only Integers
    @param  -> String a ser testada
    @return ->  true    -> se encontrado inteiro
    *           false   -> se nao encontrado inteiro
    */
    public static boolean x3(String s, int start){
        int last = s.length();
        //testa se fim
        if(start==last){
            return true;
        }
        //se numero
        if(s.charAt(start)>=48 && s.charAt(start)<=57){
            //MyIO.print("\nnumero - "+s.charAt(start)+"\n");
            //se ponto
            if(s.charAt(start)==46 || s.charAt(start)==44){
                //MyIO.print("ponto - "+s.charAt(start)+"\n");
                return false;
            }
        }
        else{
            //MyIO.print("\nnao numero - "+s.charAt(start)+"\n");
            return false;
        }
        return x3(s, start+1);
    }
    /**
    X4  -> Only Doubles
    *   @param  s       -> String a ser testada
    *   @param  start   -> inicio da palavra
    *   @param  nPontos -> qtd de pontos no numero
    *   @return true    -> se encontrado Real
    *           false   -> se nao encontrado real
    */
    public static boolean x4(String s, int start, int nPontos){
        int last = s.length()-1;
        //testa se fim
        if(start==last){
            if(s.charAt(start)>=48 && s.charAt(start)<=57){
                //MyIO.println("\numero - "+s.charAt(start));
                return true;
            }
            else
                //MyIO.println("\nao numero - "+s.charAt(start)+"");
                return false;
        }
        //se nao numero
        
        if(s.charAt(start)==46 || s.charAt(start)==44){
            nPontos++;
            //MyIO.println("\npontos - "+nPontos);
            if(nPontos > 1){
                //MyIO.println("\n2 ponto - "+s.charAt(start)+" - #"+nPontos);
                return false;
            }
        }
        return x4(s, start+1, nPontos);
    }
    /**
    Prints
    *   @param resp - true-sim / false-nao
    */
    public static void PrintPrimeiro(boolean resp){
        if(resp == true)
            MyIO.print("SIM");
        else
            MyIO.print("NAO");
    }
    /**
    Prints
    *   @param resp - true-sim / false-nao
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
        MyIO.setCharset("UTF-8");
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
                boolean temp1=x1(entrada[numEntrada], 0);
                PrintPrimeiro(temp1);
                //se consoante
                boolean temp2=x2(entrada[numEntrada], 0);
                Print(temp2);
                //se int
                boolean temp3=x3(entrada[numEntrada], 0);
                Print(temp3);
                //se double
                boolean temp4=x4(entrada[numEntrada], 0, 0);
                Print(temp4);
                //proxima linha
                MyIO.println("");
            }
        } while (isFim(entrada[numEntrada++])==false);
        numEntrada--;   //Desconsidera a linha da palavra FIM
    }
}