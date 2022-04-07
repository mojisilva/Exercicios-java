package Exercicios;

import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {
        double area;
        double baseMaior;
        double baseMenor;
        double altura;
        int conversor;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o tamanho da base maior do trapézio");
        baseMaior = ler.nextDouble();
        System.out.println("Qual o tamanho da base menor do trapézio");
        baseMenor = ler.nextDouble();
        System.out.println("Qual o tamanho da altura do trapézio");
        altura = ler.nextDouble();
        area = (altura * (baseMaior+baseMenor))/2;
        System.out.printf("O tamanho da área do trapézio é: %.2f\n", area);
        conversor = (int) area;
        System.out.println("O tamanho arrendodado da área do trapézio é: " + conversor);
        ler.close();
    }
}