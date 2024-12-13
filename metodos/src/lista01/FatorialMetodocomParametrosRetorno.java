package lista01;

public class FatorialMetodocomParametrosRetorno {
    /*
     * Crie um método chamado CalcularFatorial que receba um inteiro positivo como
     * parâmetro e retorne o fatorial desse número.
     */

    public static int CalcularFatorial(int numero) {
        int resultado = 1;

        for (int contadora = 1; contadora < numero; contadora++) {
            resultado *= contadora;

        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(CalcularFatorial(10));
    }
}