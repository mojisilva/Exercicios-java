package br.com.dio.Exercicios;

import java.util.Scanner;

public class MediaVendas {
    public static void main(String[] args) {
        double jan;
        double fev;
        double mar;
        double abr;
        double total;
        double media;
        String vendedor;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor");
        vendedor = ler.nextLine();
        System.out.println("Digite as vendas de Janeiro");
        jan = ler.nextDouble();
        System.out.println("Digite as vendas de Fevereiro");
        fev = ler.nextDouble();
        System.out.println("Digite as vendas de Março");
        mar = ler.nextDouble();
        System.out.println("Digite as vendas de Abril");
        abr = ler.nextDouble();
        total = (jan+fev+mar+abr);
        media = ((jan+fev+mar+abr)/4);
        System.out.println("O total de vendas do vendendor " + vendedor +" foi de: " + total );
        System.out.println("A média de vendas do vendendor " + vendedor +" foi de: " + media );
        ler.close();
    }
}