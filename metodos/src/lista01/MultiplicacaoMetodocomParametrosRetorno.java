package lista01;

public class MultiplicacaoMetodocomParametrosRetorno {

    /*
     * Crie um método chamado Multiplicar que receba dois inteiros como parâmetros e
     * retorne o produto desses dois números.
     */

     public static int Multiplicar(int a, int b) {

        return a * b;
     }


     public static void main(String[] args) {
        int resultado = Multiplicar(5, 6);
        System.out.println("O resultado da multiplicação é: " + resultado);
     }
}