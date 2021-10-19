package br.com.dio.Exercicios;

import java.util.Scanner;

public class MultiplosDois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 2;
        int sequencia;
        System.out.println("Digite a quantidade de números em sequência que deseja multiplicar por dois");
        sequencia = ler.nextInt();
        System.out.println("Os " + sequencia + " primeiros números multíplos de 2 são: ");
        for(int i = 0; i <sequencia; i++){
            System.out.println(numero);
            numero = numero * 2;
        }
        ler.close();
    }
}