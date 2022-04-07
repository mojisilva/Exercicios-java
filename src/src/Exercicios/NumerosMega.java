package Exercicios;

import java.util.LinkedHashSet;
import java.util.Random;

public class NumerosMega {

    public static void main(String[] args) {
        Random gerador = new Random();
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        String formato;

        for(int i=0; i<6; i++){
            numeros.add(gerador.nextInt(60) + 1);
        }
        formato = String.valueOf(numeros);
        System.out.println(formato.replace("[", "").replace(",", " -").replace("]", ""));
    }
}
