package ExerciciosBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FolhaPagamento {

    public static void main(String[] args) throws IOException {
        InputStream in;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o código do colaborador");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int valor1 = Integer.parseInt(st.nextToken());
        System.out.println("Digita a quantidade de horas trabalhadas do colaborador");
        st = new StringTokenizer(br.readLine());
        int valor2 = Integer.parseInt(st.nextToken());
        System.out.println("Digite o valor do salário hora do colaborador");
        st = new StringTokenizer(br.readLine());
        double valor3 = Double.parseDouble(st.nextToken());
        double salario = valor2*valor3;
        System.out.println("Código do colaborador = " + valor1);
        System.out.printf("Salário = R$ %.2f ", salario);
    }
}