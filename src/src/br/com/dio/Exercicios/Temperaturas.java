package br.com.dio.Exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        ArrayList<Double> temperaturas = new ArrayList<>();
        Double total = 0.0;
        Double media;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite as temperaturas dos seis primeiro meses do ano");
        do{
            Double t;
            t = ler.nextDouble();
            temperaturas.add(t);
        }while(temperaturas.size()<6);
        System.out.println("------------------------------------------------------------");
        for (Double t: temperaturas) {
            System.out.println(t);
        }
        Iterator<Double> i = temperaturas.iterator();
        while(i.hasNext()){
            Double next = i.next();
            total += next;
        }
        media = (total/temperaturas.size());
        System.out.println("------------------------------------------------------------");
        System.out.printf("A média de temperatura é de %.1f \n", media );
        System.out.println("------------------------------------------------------------");
        System.out.println("Quais meses tiveram temperaturas acima da média? ");
        int x= 0;
        Iterator<Double> it = temperaturas.iterator();
        while(it.hasNext()){
            Double t = it.next();
            if(t>media){
                switch (x){
                    case (0):
                        System.out.printf("1 - Janeiro: %.1f\n", t);
                    break;
                    case(1):
                        System.out.printf("2 - Fevereiro: %.1f\n", t);
                    break;
                    case(2):
                        System.out.printf("3 - Março: %.1f\n", t);
                    break;
                    case(3):
                        System.out.printf("4 - Abril: %.1f\n", t);
                    break;
                    case(4):
                        System.out.printf("5 - Maio: %.1f\n", t);
                    break;
                    case(5):
                        System.out.printf("6 - Junho: %.1f\n", t);
                    break;
                    default:
                        System.out.println("Não houve temperaturas acima da média");
                }x++;
            }
        }
        ler.close();
    }
}