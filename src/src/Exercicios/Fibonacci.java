package Exercicios;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int sequencia;
        int soma = 1;
        int fibo = 0;
        System.out.println("Digite a quantidade da sequência fibonacci que você deseja calcular:");
        sequencia = ler.nextInt();
        System.out.println("Os " + sequencia + " primeiros números da sequência fibonacci é:");
        for(int i =0;i<sequencia; i++){
            System.out.println(fibo);
            soma = soma + fibo;
            fibo = soma - fibo;
        }
        ler.close();
    }
}
