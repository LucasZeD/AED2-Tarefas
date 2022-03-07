import java.util.Locale;

public class Cifra {
    public static void main(String palavra){
	//
	int x = 0;
        String palavraCriptografada = new String();
        while (x < palavra.length()) {
            palavraCriptografada = palavraCriptografada + (char) (palavra.charAt(x) + 3);
            x++;
        }
        return palavraCriptografada;
    }
}
