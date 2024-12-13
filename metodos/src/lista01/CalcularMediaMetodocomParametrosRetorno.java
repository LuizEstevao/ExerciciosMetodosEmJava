package lista01;

public class CalcularMediaMetodocomParametrosRetorno {
    /*
     * Crie um método chamado CalcularMedia que receba três números decimais como
     * parâmetros e retorne a média desses números.
     */


     public static float Calcular(float num1,float num2,float num3){

        float media = (num1+num2+num3)/3;

        return media;
     }



     public static void main(String[] args) {
        System.out.println(Calcular(7, 7, 7));
     }

}
