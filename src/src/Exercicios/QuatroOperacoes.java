package Exercicios;

public class QuatroOperacoes {

    public static void soma( double a, double b){
        double  result = a + b;
        System.out.println("A soma entre " +a+" e " +b+" é: " + result);
    }

    public static void subtracao(double a, double b){
        double  result = a - b;
        System.out.println("A subtração entre " +a+" e " +b+" é: " + result);
    }
    public static void multiplicacao(double a, double b){
        double  result = a * b;
        System.out.println("A multiplicação entre " +a+" e " +b+" é: " + result);
    }
    public static void divisao(double a, double b){
        double  result = a / b;
        System.out.println("A divisão entre " +a+" e " +b+" é: " + result);
    }


    public static void main(String[] args) {
        soma(2,2);
        subtracao(4,8);
        multiplicacao(5,7);
        divisao(48,6);
    }

}
