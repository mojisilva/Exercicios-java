package br.com.dio.Exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int limite;
        int tabuada;
        int resultado;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número da tabuada que você deseja multiplicar");
        tabuada = ler.nextInt();
        System.out.println("Digite até que número você deseja multiplicar");
        limite = ler.nextInt();
        for(int cont=1; cont<=limite; cont++){
            resultado = (tabuada * cont);
            System.out.println(tabuada + " X "+cont+ " = "+resultado);
        }
        ler.close();
    }
}