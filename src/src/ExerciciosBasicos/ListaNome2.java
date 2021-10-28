package ExerciciosBasicos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNome2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String adiciona;
        ArrayList<String> nome = new ArrayList<>();
        System.out.println("Digite os nome da lista, caso queira parar, digite FIM");
        do{
            adiciona = ler.nextLine();
            adiciona = adiciona.toUpperCase();
            if(!adiciona.equals("FIM")){
                nome.add(adiciona);
            }
        }while(!adiciona.equals("FIM"));
        for (String n:nome) {
            System.out.println(n);
        }
        ler.close();
    }
}
