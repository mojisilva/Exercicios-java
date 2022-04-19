package Exercicios;

public class Emprestimo {

    public static void valorEmprestimo(double valorSolicitado, int numParcelas){
        double valorTotal;
        if(numParcelas > 0 && numParcelas <=12){
            valorTotal = valorSolicitado * 1.1;
        }else if(numParcelas >= 13 && numParcelas <=24){
            valorTotal = valorSolicitado * 1.3;
        }else if(numParcelas >=25 && numParcelas <=36){
            valorTotal = valorSolicitado * 1.5;
        }else if(numParcelas >=37 && numParcelas <=48){
            valorTotal = valorSolicitado * 1.8;
        }else{
            valorTotal = valorSolicitado * 2.5;
        }
        System.out.println("====================================================================");
        System.out.println("O valor pedido em empréstimo são: " +  valorSolicitado + " reais");
        System.out.println("A quantidade de parcelas a ser paga são: "+ numParcelas);
        System.out.println("O valor total do empréstimo é: " + valorTotal  + " reais");
        System.out.println("====================================================================");
    }

    public static void main(String[] args) {
        valorEmprestimo(500, 12);
        valorEmprestimo(500, 15);
        valorEmprestimo(500, 34);
        valorEmprestimo(500, 40);
        valorEmprestimo(500, 60);
    }
}
