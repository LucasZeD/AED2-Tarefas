/**
Leia duas strings sendo que a primeira é o nome de uma página web e
*   a segunda, seu endereço.
Por exemplo, “Pontifı́cia Universidade Católica de Minas Gerais” e “www.pucminas.br”.
Em seguida, mostre na tela o
*   número de vogais (sem e com acento),
*             consoantes e
*   dos padrões “< br >” e “< table >” que aparecem no código dessa página.
//
A entrada padrão é composta por várias linhas.
*   Cada uma contém várias strings sendo que
*   a primeira é um endereço web e
*   as demais o nome dessa página web.
A última linha da entrada padrão contém a palavra “FIM”.
//
A saı́da padrão contém várias linhas sendo que cada uma apresenta número de ocorrência
*   (valor x i entre parênteses) de cada caractere ou string solicitado.
*   Cada linha de saı́da será da seguinte forma:
a(x 1 ) e(x 2 ) i(x 3 ) o(x 4 ) u(x 5 )
á(x 6 ) é(x 7 ) ı́(x 8 ) ó(x 9 ) ú(x 10 )
à(x 11 ) è(x 12 ) ı̀(x 13 ) ò(x 14 ) ù(x 15 )
ã(x 16 ) õ(x 17 )
â(x 19 ) ê(x 19 ) ı̂(x 20 ) ô(x 21 ) û(x 22 )
consoante(x 23 )
< br >(x 24 )
< table >(x 25 )
nomepágina(x 26 ).
*/
import java.io.*;
import java.net.*;

import javax.imageio.stream.MemoryCacheImageInputStream;


public class Html {
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
    GetHTML -> copiado ex
    @param String endereco
    */
    public static String getHtml(String endereco){
        URL url;
        InputStream is = null;
        BufferedReader br;
        String resp = "", line;
        //
        try {
            url = new URL(endereco);
            is = url.openStream();  // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                resp += line + "\n";
            }
        }
        catch (MalformedURLException mue) {
            mue.printStackTrace();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        //
        try {
            is.close();
        } catch (IOException ioe) {
            // nothing to see here
        }
        return resp;
    }
    /**
    IsVowel -> Only Vowels
    @param  -> String a ser testada
    @return -> 1->vowel 2->not vowel
    */
    public static int isVowel(char s, int vowels[]){
        for(int i=0; i<vowels.length-1; i++){
            if(s == vowels[i]){
                return i;
            }
        }
        return -1;
    }
    /**
    IsConsoante -> Only Consonate
    @param  -> String a ser testada
    */
    public static boolean isConsoante(char s){
        //se entre 97 e 122 é letra
        // se for vogal ja foi selecionado anteriorimente
        if(s >= 97 && s <=122){
            return true;
        }
        else{
            return false;
        }
    }
    /**
    isTag -> <br> <table>
    @param s -> html a ser lido
    @param iteracao -> s[i]
    @return 1 -> br; 0 -> tab; -1 -> nenhum
    */
    public static int isTag (String s, int i){
        i = i-1;
        //'<' 'b' 'r' '>'
        if (s.charAt(i) == '<') {
            if (s.charAt(i + 1) == 't') {
                if (s.charAt(i + 2) == 'a') {
                    if (s.charAt(i + 3) == 'b') {
                        if (s.charAt(i + 4) == 'l') {
                            if (s.charAt(i + 5) == 'e') {
                                if (s.charAt(i + 6) == '>') {
                                    return 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        else if(s.charAt(i + 1)== 'b'){
            if(s.charAt(i + 2)== 'r'){
                if(s.charAt(i + 3)== '>'){
                    return 1;
                }
            }
        }
        return -1;
    }
    /**
    Printar Saida padrao
    @param vowels       vogais + vogais acento
    @param consoante    consoantes
    @param breaks       <br>
    @param table        <table>
    @param nomepagina   nomepagina
    */
    public static void Saida(int vowels[], int numVowels[] ,int numConsoante, int numTag[], String nome) {
        //
        for (int i = 0; i < 22; i++) {
            MyIO.print((char)(vowels[i]) + "(" + (numVowels[i]) + ") ");
        }
        //
        MyIO.print("consoante(" + numConsoante + ") ");
        MyIO.print("<br>(" + numTag[1] + ") ");
        MyIO.print("<table>(" + numTag[0] + ") ");
        MyIO.print(nome);
        //
        MyIO.println("");
    }
    /**
    Main
    */
    public static void main(String[] args) {
        //charset
        MyIO.setCharset("ISO-8859-1");
        /**
        Variveis para execucao
        */ 
        int[] vowels    = {97,101,105,111,117,225,233,237,243,250,224,232,236,242,249,227,245,226,234,238,244,251,65,69,73,79,85};
        int numVowels[] = new int[27];
        int numTag[]    = new int [2];
        int numConsoante= 0;
        /**
        Leitura Padrao
        */
        String linha= MyIO.readLine();
        /**
        Variaveis para html
        */
        String endereco = "";
        String nome = "";
        do{
            if (isFim(linha)==false){
                /**
                ZERAR VALORES PARA PROXIMA PAGINA
                */
                numConsoante=0;
                for(int i=0; i<27; i++)
                    { numVowels[i]=0; }
                for(int i=0; i<2; i++)
                    { numTag[i]=0;}
                /**
                LEITURA INICIAL + GET HTML
                */
                nome =linha;                   //nome site
                linha=MyIO.readLine();         //segunda linha html
                endereco = getHtml(linha);   //get
                /**
                LEITURA HTML
                */
                for(int i=0; i<endereco.length();i++){
                    /**
                    TESTES
                    */
                    int respTemp = isVowel(endereco.charAt(i), vowels);
                    //se igual a 1 vogal
                    if(respTemp >= 0){
                        numVowels[respTemp]++;
                    }
                    else{
                        //consoante
                        if((isConsoante(endereco.charAt(i)))==true){
                            numConsoante++;
                        }
                        else{
                            if(i>0){
                                respTemp = isTag(endereco, i);
                                if(respTemp>=0){
                                    i=i+3;
                                    //table
                                    if(respTemp==0){
                                        i=i+3;
                                    }
                                    numTag[respTemp]++;
                                }
                            }
                        }
                    }
                }
                //saida padrao
                Saida(vowels, numVowels, numConsoante, numTag, nome);
                linha= MyIO.readLine();         //primeira linha
            }
        } while (isFim(linha)==false);
     }
}
