package Exercicios;

import java.util.Scanner;

public class EscolhePrograma {
    public static void main(String[] args) {
        int menu;
        Scanner ler = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Opções do Menu:");
        System.out.println("1 - Abrir Netflix");
        System.out.println("2 - Abrir Amazon Prime");
        System.out.println("3 - Abrir HGO Go");
        System.out.println("4 - Sair");
        System.out.println("------------------------------------------------");
        do{
            System.out.println("Selecione a opção desejada do menu");
            menu = ler.nextInt();
            switch (menu){
                case 1 :
                    System.out.println("Abrir Netflix!");
                break;
                case 2 :
                    System.out.println("Abrir Amazon Prime!");
                break;
                case 3 :
                    System.out.println("Abrir HBO Go!");
                break;
                case 4 :
                    System.out.println("Sair!");
                break;
                default:
                    System.out.println("Você deve escolher entre as opções 1 e 4!");
            }
        }while((menu > 4) || (menu <=0 ));
        ler.close();
    }
}