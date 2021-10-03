package br.com.dio.Exercicios;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String letra;
        Double unidMedida;
        Double quantidade;
        do {
            System.out.println("Digite L caso queira converter quilos em libras ou K caso queira convertes libras em quilos:");
            letra = ler.nextLine();
            letra = letra.toUpperCase();
            if(letra.equals("L")){
                System.out.println("Digite a quantidade em quilos que deseja converter para libras:");
                quantidade = ler.nextDouble();
                quantidade *=1000;
                unidMedida = (quantidade/454);
                System.out.printf("A quantidade convertida em libras é de %.2f\n", unidMedida);
            }else if(letra.equals("K")){
                System.out.println("Digite a quantidade em libras que deseja converter para quilos:");
                quantidade = ler.nextDouble();
                quantidade *=454;
                unidMedida = (quantidade/1000);
                System.out.printf("A quantidade convertida em libras é de %.2f\n", unidMedida);
            }else{
                System.out.println("Você deve escolher L ou K");
            }
        }while((!letra.equals("K")) && (!letra.equals("L")));
    ler.close();
    }
}