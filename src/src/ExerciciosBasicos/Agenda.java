package ExerciciosBasicos;

public class Agenda {
    public static void main(String[] args) {
        String[][] agenda = {{"João","São Paulo","(11) 9999-5241"},{"Maria","Ribeirão Preto","(16) 9999-8596"},{"Ana","Manaus","(92) 9999-8574"}};
        for(int i=0; i< agenda.length;i++){
            System.out.println("----------------------------");
            for(int x = 0;x< agenda.length;x++){
                System.out.println(agenda[i][x]);
            }
        }
    }
}