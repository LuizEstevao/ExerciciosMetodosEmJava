package lista01;

public class EhParMetodoComParametrosRetorno {

    /*
     * Crie um método chamado EhPar que receba um inteiro como parâmetro e retorne
     * verdadeiro se o número for par e falso se for ímpar.
     */

    public static boolean EhPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(EhPar(3)); 
    }
}