package br.com.dio.Exercicios;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario = 10.45;
        int horas;
        double salarioTotal;
        System.out.println("Informe quantas horas o funcionário trabalhou");
        horas = ler.nextInt();
        salarioTotal = (salario*horas);
        System.out.printf("O salário total do funcionário é R$ %.2f \n", salarioTotal);

        if(salarioTotal < 50.00){
            System.out.println("Atenção, dirija-se à direção do hotel");
        }
        ler.close();
    }
}