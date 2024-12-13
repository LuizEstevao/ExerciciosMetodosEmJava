package lista01;

public class DataMetodosemParametrosComRetorno {

    /*
     * Crie um método chamado ObterDataAtual que não receba parâmetros e retorne a
     * data atual como uma string no formato "dd/MM/yyyy".
     */

     public static String ObterDataAtual() {
        java.time.LocalDate dataAtual = java.time.LocalDate.now();
        return dataAtual.toString();
     }

     public static void main(String[] args) {
        System.out.println(ObterDataAtual());
     }

}