package br.com.dio.Exercicios;

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        ArrayList<String> arco = new ArrayList<>();
        arco.add("vermelho");
        arco.add("laranja");
        arco.add("amarelo");
        arco.add("verde");
        arco.add("azul");
        arco.add("anil");
        arco.add("violeta");
        System.out.println("--------------------------------------------------------");
        System.out.println("Exiba as cores uma baixo da outra na ordem informada:");
        System.out.println("--------------------------------------------------------");
        for (String a:arco) {
            System.out.println(a);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Exiba as cores por ordem alfabética:");
        System.out.println("--------------------------------------------------------");
        Set<String> arco2 = new TreeSet<>(arco);
        for (String a:arco2) {
            System.out.println(a);
        }
        Iterator<String> i = arco.iterator();
        int cont=0;
        while(i.hasNext()) {
            i.next();
            cont++;
        }
        System.out.println("O arco íris tem "+ cont + " cores");
        System.out.println("--------------------------------------------------------");
        System.out.println("Exiba as cores na ordem inversa a informada:");
        System.out.println("--------------------------------------------------------");
        Collections.reverse(arco);
        for (String a:arco) {
            System.out.println(a);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Exiba as cores com a letra v:");
        System.out.println("--------------------------------------------------------");
        for (String a:arco) {
            if(a.startsWith("v")){
                System.out.println(a);
            }
        }
        Iterator<String> it = arco.iterator();
        while(it.hasNext()){
            if(!it.next().startsWith("v")){
                it.remove();
            }
        }
        arco.clear();
        System.out.println("--------------------------------------------------------");
        System.out.println("Se a lista estiver vazia retorna true:");
        System.out.println("--------------------------------------------------------");
        System.out.println(arco.isEmpty());
    }
}