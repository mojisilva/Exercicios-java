package Exercicios;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra que deseja verificar: ");
        verificaPalindromo(sc.nextLine());
    }
    private static void verificaPalindromo(String s) {
        StringBuilder palindromo = new StringBuilder();
        for(int i = s.length()-1; i >=0; i--){
            palindromo.append(s.charAt(i));
        }
        if(palindromo.toString().equals(s)){
            System.out.println("A palavra " + s +  " é um palindromo!");
        }else{
            System.out.println("A palavra " + s +  " não é um palindromo!");
        }
    }
}