package ExerciciosBasicos;

public class CestaFrutas {
    public static void main(String[] args) {
        String [][] cesta = {{"Maça", "100"}, {"Pera", "200"}, {"Uva", "300"}, {"Java", "400"}};
        for(int i=0; i<cesta.length; i++){
            System.out.println("Produto: " + cesta[i][0] + " - Quantidade: " + cesta[i][0]);
        }
    }
}