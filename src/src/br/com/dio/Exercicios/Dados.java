package br.com.dio.Exercicios;

import java.util.*;

public class Dados {

    public static void main(String[] args) {
        int lancamento = 100;
        List<Integer> valor = new ArrayList<>();
        Random ran = new Random();
        for(int i=0; i<lancamento;i++){
            int numero = ran.nextInt(6)+1;
            valor.add(numero);
        }
        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valor) {
            if (lancamentos.containsKey(resultado))
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            else lancamentos.put(resultado, 1);
        }
        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}