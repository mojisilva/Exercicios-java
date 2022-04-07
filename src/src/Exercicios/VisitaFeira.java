package Exercicios;

import java.util.Scanner;

public class VisitaFeira {
    public static void main(String[] args) {
        int pimentoesAmarelos;
        int pimentoesVermelhos;
        int total;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de pimentões amarelos");
        pimentoesAmarelos = ler.nextInt();
        System.out.println("Digite a quantidade de pimentões vermelhos");
        pimentoesVermelhos = ler.nextInt();
        total = (pimentoesAmarelos+pimentoesVermelhos);
        System.out.println("O total de pimentões é: " +  total);
        ler.close();
    }
}