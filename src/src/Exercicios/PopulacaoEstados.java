package Exercicios;

import java.util.*;

public class PopulacaoEstados {
    public static void main(String[] args) {
        Map<String, Double> estados = new HashMap<>();
        estados.put("PE", 9.616621);
        estados.put("AL", 3.351543);
        estados.put("CE", 9.187103);
        estados.put("RN", 3.534265);
        estados.put("RN", 3.534165);
        System.out.println("------------------------------------------------------------------");
        System.out.println("A população do PB consta na lista? " + estados.containsKey("PB"));
        estados.put("PB", 4.039277);
        System.out.println("------------------------------------------------------------------");
        System.out.println("A população do PE é : " + estados.get("PE") + " habitantes");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Exiba a lista por ordem de inclusão :");
        Map<String, Double> estados2 = new LinkedHashMap<>();
        estados2.put("PE", 9.616621);
        estados2.put("AL", 3.351543);
        estados2.put("CE", 9.187103);
        estados2.put("RN", 3.534165);
        estados2.put("PB", 4.039277);
        System.out.println(estados2.toString());
        Map<String, Double> estados3 = new TreeMap<>(estados2);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Exiba a lista por ordem alfabética");
        System.out.println(estados3.toString());
        Double menor = Collections.min(estados.values());
        Double maior = Collections.max(estados.values());
        String estadoMaior = "";
        String estadoMenor = "";
        Set<Map.Entry<String, Double>> entries = estados.entrySet();
        for (Map.Entry<String, Double> entry:entries) {
            if(entry.getValue().equals(menor)){
                estadoMenor = entry.getKey();
            }
        }
        for (Map.Entry<String, Double> entry:entries) {
            if(entry.getValue().equals(maior)){
                estadoMaior = entry.getKey();
            }
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("O estado menos populoso é: " + estadoMenor + " - " + menor);
        System.out.println("------------------------------------------------------------------");
        System.out.println("O estado mais populoso é: " + estadoMaior + " - " + maior);
        System.out.println("------------------------------------------------------------------");
        Iterator<Double> i = estados.values().iterator();
        Double soma = 0.0;
        while(i.hasNext()){
            soma +=i.next();
        }
        System.out.printf("A soma das populações dos estados é %.6f \n:" ,  soma);
        System.out.println("------------------------------------------------------------------");
        System.out.println("A media das populações dos estados é: " + (soma/estados.size()));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Remova os estados com população abaixo de 4.000.000");
        Iterator<Double> it = estados.values().iterator();
        while(it.hasNext()){
            if(it.next() < 4.000000){
                it.remove();
            }
        }
        System.out.println(estados.toString());
        estados.clear();
        System.out.println("------------------------------------------------------------------");
        System.out.println("A lista esta vazia? " + estados.isEmpty());
    }
}