import java.util.Random;

public class AlteracaoAleatoria {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(4);
        String palavra;
        do {
            palavra = MyIO.readLine();
            if (!igualFim(palavra)) {
                //Gera aleatoriamente as letras que serão trocadas.
                char char1 = (char) ('a' + Math.abs(random.nextInt()) % 26);
                char char2 = (char) ('a' + Math.abs(random.nextInt()) % 26);
                // Printa o retorno da funcao, a palavra nova.
                MyIO.println(aleatorizarPalavra(palavra, char1, char2));
            }
        } while (!igualFim(palavra));
    }

    //Função para aleatorizar a palavra recebida como parametro com os dois caracteres tbm passados como parametro
    public static String aleatorizarPalavra(String palavra, char caractere1, char caractere2) {
        String palavraNova = "";
        for (int x = 0; x < palavra.length(); x++) {
            if (palavra.charAt(x) == caractere1) {
                //Quando se tem mudança
                palavraNova = palavraNova + caractere2;
            } else
                //Quando não se tem mudança
                palavraNova = palavraNova + palavra.charAt(x);
        }
        return palavraNova;
    }

    // checa se a palavra de entrada é igual a FIM
    public static boolean igualFim(String palavra) {
        return (palavra.length() == 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M');
    }
}
