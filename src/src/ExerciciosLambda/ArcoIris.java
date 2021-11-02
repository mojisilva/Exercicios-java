package ExerciciosLambda;

import java.util.*;
import java.util.stream.Collectors;


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
        arco.forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
        System.out.println("Exiba as cores por ordem alfabética:");
        System.out.println("--------------------------------------------------------");
        arco.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("O arco íris tem "+ arco.size() + " cores");
        System.out.println("--------------------------------------------------------");
        System.out.println("Exiba as cores na ordem inversa a informada:");
        System.out.println("--------------------------------------------------------");
        Collections.reverse(arco);
        arco.forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
        System.out.println("Exiba as cores com a letra v:");
        System.out.println("--------------------------------------------------------");
        arco.stream()
                .filter(a-> a.startsWith("v"))
                .collect(Collectors.toSet()).stream().sorted()
                .forEach(System.out::println);
        arco.removeIf(a -> !a.startsWith("v"));
        arco.forEach(System.out::println);
        arco.clear();
        System.out.println("--------------------------------------------------------");
        System.out.println("Se a lista estiver vazia retorna true:");
        System.out.println("--------------------------------------------------------");
        System.out.println(arco.isEmpty());
    }
}