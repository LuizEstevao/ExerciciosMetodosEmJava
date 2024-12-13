package lista01;


public class MetodocomParametrosRetorno {

    /*
     * Crie um método chamado Somar que receba dois inteiros como parâmetros e
     * retorne a soma desses dois números.
     */
    public static int Somar(int num1, int num2) {
        
        return num1 + num2;

    }

    public static void main(String[] args) {
        int resultado = Somar(10, 20);
        System.out.println("A soma é: " + resultado);
    }

    

}
