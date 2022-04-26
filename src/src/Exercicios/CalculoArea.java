package Exercicios;

public class CalculoArea {

    public static void calcularArea(double lado){
        double a;
        a = lado * lado;
        System.out.println("A área de um quadrado é: " + a);
    }
    public static void calcularArea(double base, double altura){
        double a;
        a = base * altura;
        System.out.println("A área de um retângulo é: " + a);
    }
    public static void calcularArea(double baseMenor, double baseMaior, double altura){
        double a;
        a = (altura * (baseMaior+baseMenor))/2;
        System.out.println("A área de um trapézio é: " + a);
    }

    public static void main(String[] args) {
        calcularArea(4);
        calcularArea(4, 5);
        calcularArea(4,6,5);
    }
}
