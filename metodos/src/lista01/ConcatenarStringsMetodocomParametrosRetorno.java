package lista01;

public class ConcatenarStringsMetodocomParametrosRetorno {

    /*
     * Crie um método chamado ConcatenarStrings que receba duas strings como
     * parâmetros e retorne a concatenação dessas duas strings.
     */

    public static String ConcatenarStrings(String str1, String str2) {
        return str1 + str2;

    }

    public static void main(String[] args) {
        System.out.println(ConcatenarStrings("Olá, ", "mundo!"));
    }

}
