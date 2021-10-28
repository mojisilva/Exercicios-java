package ExerciciosBasicos;

public class NumeroPrimo {
    public static void main(String[] args) {
        System.out.println("São números primos entre 1 e 123");
        for(int i=2; i<=123; i++){
            boolean primo = true;
            for(int x=2; x<i;x++){
                if(i % x ==0){
                    primo = false;
                }
            }if(primo){
                System.out.println(i);
            }
        }
    }
}