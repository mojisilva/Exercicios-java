package br.com.dio.Exercicios;

import java.util.Scanner;

public class ListaNome {
    public static void main(String[] args) {
        Scanner  ler = new Scanner(System.in);
        String nome[] = new String[5];
        System.out.println("Digite os nomes");
        for(int i=0; i< nome.length;i++){
            nome[i] = ler.nextLine();
        }
        System.out.println("----------------------------------");
        for(int i = (nome.length-1);i>=0;i--){
            System.out.println(nome[i]);
        }
        ler.close();
    }
}