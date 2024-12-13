package lista01;

public class MaiorNumeroMetodocomParametrosRetorno {

    /*
     * Crie um método chamado MaiorNumero que receba dois inteiros como parâmetros e
     * retorne o maior entre eles.
     */

     public static int MaiorNumero(int num1, int num2) {
        
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
     }


     public static void main(String[] args) {
        System.out.println(MaiorNumero(30, 20));
     }
}