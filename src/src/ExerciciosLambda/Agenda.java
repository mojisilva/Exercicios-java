package ExerciciosLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Agenda {
    private String nome;
    private String cidade;
    private String telefone;

    public Agenda(String nome, String cidade, String telefone) {
        this.nome = nome;
        this.cidade = cidade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return  "Nome:" + nome + "\n"  +
                "Cidade:" + cidade + "\n" +
                "Telefone:" + telefone + "\n" +
                "==================================================";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agenda agenda = (Agenda) o;
        return Objects.equals(nome, agenda.nome) && Objects.equals(cidade, agenda.cidade) && Objects.equals(telefone, agenda.telefone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, cidade, telefone);
    }

    public static void main(String[] args) {
        ArrayList<Agenda> agenda = new ArrayList<>() {{
            add(new Agenda("João", "São Paulo", "(11) 9999-5241"));
            add(new Agenda("Maria", "Ribeirão Preto", "(16) 9999-8596"));
            add(new Agenda("Cassio", "Rio de Janeiro", "(21) 9999-3145"));
            add(new Agenda("Felipe", "Feira de Santana", "(75) 9999-3284"));
            add(new Agenda("Cristina", "Pernambuco", "(81) 9999-4571"));
            add(new Agenda("Paula", "Salvador", "(71) 9566-8874"));
            add(new Agenda("Ana", "Manaus", "(92) 9999-7840"));
        }};
        agenda.forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        agenda.sort(Comparator.comparing(Agenda::getNome));
        agenda.forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        agenda.sort(Comparator.comparing(Agenda::getCidade));
        agenda.forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        agenda.sort(Comparator.comparing(Agenda::getTelefone));
        agenda.forEach(System.out::println);

     }
}
