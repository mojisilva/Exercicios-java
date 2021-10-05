package br.com.dio.Exercicios;

public class SomaMulti {
    public static void main(String[] args) {
        int soma=0;
        long mult = 1L;
        for(int i=1;i<=30; i++){
            if(i%2 !=0){
                soma += i;
            }else{
                mult *= i;
            }
        }
        System.out.println("A soma dos números impares entre 1 e 30 é " + soma);
        System.out.println("A multiplicação dos números pares entre 1 e 30 é " + mult);
    }
}