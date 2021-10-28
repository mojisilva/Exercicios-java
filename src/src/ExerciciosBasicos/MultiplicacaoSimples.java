package ExerciciosBasicos;

import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) {
        int a;
        int b;
        int prod;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de 'A'");
        a = ler.nextInt();
        System.out.println("Digite o valor de 'B'");
        b = ler.nextInt();
        prod = a*b;
        System.out.println("O produto da multiplicação é: " + prod);
        ler.close();
    }
}