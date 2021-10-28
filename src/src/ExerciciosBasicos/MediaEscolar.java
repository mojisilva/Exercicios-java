package ExerciciosBasicos;

import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        String aluno;
        double n1;
        double n2;
        double n3;
        double n4;
        double media;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        aluno = ler.nextLine();
        System.out.println("Informe as notas");
        System.out.println("Nota 1 ");
        n1 = ler.nextDouble();
        System.out.println("Nota 2 ");
        n2 = ler.nextDouble();
        System.out.println("Nota 3 ");
        n3 = ler.nextDouble();
        System.out.println("Nota 4 ");
        n4 = ler.nextDouble();
        media = ((n1+n2+n3+n4)/4);
        System.out.printf("A média foi: %.2f\n" , media);
        if(media>7){
            System.out.println(aluno + ", parabéns você foi aprovado");
        }else{
            System.out.println(aluno + ", infelizmente você foi reprovado");
        }ler.close();
    }
}