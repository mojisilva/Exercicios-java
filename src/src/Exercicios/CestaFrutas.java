package Exercicios;

public class CestaFrutas {
    public static void main(String[] args) {
        String [][] cesta = {{"Maça", "100"}, {"Pera", "200"}, {"Uva", "300"}, {"Java", "400"}};
        for (String[] strings : cesta) {
            System.out.println("Produto: " + strings[0] + " - Quantidade: " + strings[0]);
        }
    }
}