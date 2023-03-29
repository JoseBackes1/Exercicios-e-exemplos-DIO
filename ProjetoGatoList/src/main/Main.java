package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Joao", 15, "marrom"));
            add(new Gato("Simba", 6, "pretinho"));
            add(new Gato("Dona Quiteria", 19, "amarelo"));
        }};

        System.out.println(meusGatos);

        System.out.println("Ordem aleatoria");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("pela ordem natural (nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem de idade: ");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("por cor:");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Nome/cor/idade");
        meusGatos.sort(new ComparatorNomeCorIdade());

    }


}
class Gato implements Comparable<Gato> {
    private String name;
    private Integer age;
    private String color;

    public Gato(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getName().compareToIgnoreCase(gato.getName());
    }
}
class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getAge(), g2.getAge());
    }
}
class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getColor().compareToIgnoreCase(g2.getColor());
    }
}
class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getName().compareToIgnoreCase(g2.getName());
        if(nome != 0) return nome;


        int color = g1.getColor().compareToIgnoreCase(g2.getColor());
        if(color!=0) return color;

        return Integer.compare(g1.getAge(),g2.getAge());
    }
}