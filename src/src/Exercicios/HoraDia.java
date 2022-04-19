package Exercicios;

import java.time.LocalTime;

public class HoraDia {

    public static void main(String[] args) {
        horaDia();
    }
    public static void horaDia(){
        int hora = LocalTime.now().getHour();
        String mensagem = null;

        if(hora >= 6 && hora <= 12){
            mensagem = "Bom dia!";
        }else if(hora >= 13 && hora <= 18){
            mensagem = "Boa Tarde!";
        }else{
            mensagem = "Boa Noite!";
        }
        System.out.println(mensagem + " São " + hora + " hora(s)!");

    }

}
