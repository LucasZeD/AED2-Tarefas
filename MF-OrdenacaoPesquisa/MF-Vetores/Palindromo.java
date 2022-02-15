class Palindromo{
    public static void main (String[] args){
        String[] palavra = new String[100];
        int tam = palavra.length;
        int comp=0;
        int n = 20;
        palavra[0]="Anna";
        for(int i=n-2; i>5; i--){
            comp++;
        }
        System.out.println("Comparacoes: "+comp);
    }
}