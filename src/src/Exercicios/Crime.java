package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String r;
        int cont=0;
        ArrayList <String>  respostas = new ArrayList<>();
        System.out.println("Responda S ou N para as perguntas a seguir");
        System.out.println("Telefonou para a vítima?");
        r = ler.nextLine();
        r = r.toUpperCase();
        respostas.add(r);
        System.out.println("Esteve no local do crime?");
        r = ler.nextLine();
        r = r.toUpperCase();
        respostas.add(r);
        System.out.println("Mora perto da vítima?");
        r = ler.nextLine();
        r = r.toUpperCase();
        respostas.add(r);
        System.out.println("Devia para a vítima?");
        r = ler.nextLine();
        r = r.toUpperCase();
        respostas.add(r);
        System.out.println("Já trabalhou com a vítima?");
        r = ler.nextLine();
        r = r.toUpperCase();
        respostas.add(r);
        System.out.println(respostas);
        for (String ignored : respostas) {
            if (respostas.contains("S")) {
                cont++;
            }
        }
        System.out.println("Você respondeu a " + cont + " respostas positivas");
        switch (cont) {
            case 2 -> System.out.println("Você foi classificado(a) como suspeito(a)");
            case 3, 4 -> System.out.println("Você foi classificado(a) como cúmplice");
            case 5 -> System.out.println("Você foi classificado(a) como assassino(a)");
            default -> System.out.println("Você foi classificado(a) como inocente");
        }
        ler.close();
    }
}