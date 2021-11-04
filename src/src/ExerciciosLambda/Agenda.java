package ExerciciosLambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
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
        ArrayList<Agenda> agenda = new ArrayList<>(){{
            add( new Agenda("João","São Paulo","(11) 9999-5241"));
            add( new Agenda("Maria","Ribeirão Preto","(16) 9999-8596"));
            add( new Agenda("Ana","Manaus","(92) 9999-8574"));
        }};
        agenda.stream().forEach(System.out::println);
    }
}
