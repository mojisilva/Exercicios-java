package Exercicios;

import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        int numero;
        int i=0;
        int contador = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = ler.nextInt();
        while(numero >=i){
            i++;
            if(numero % i ==0){
                contador++;
            }
        }
        if((contador<=2) && (contador>1)){
            System.out.println("O número "+  numero + " é primo");
        }else{
            System.out.println("O número "+  numero + " não é primo");
        }
        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é par");
        }else{
            System.out.println("O número " + numero + " é ímpar");
        }
        ler.close();
    }
}