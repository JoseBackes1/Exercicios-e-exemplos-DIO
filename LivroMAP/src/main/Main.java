package main;

import java.util.*;



public class Main {
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria: ");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("IT", 203));
            put("Soares, Jô", new Livro("O chango de baker street", 305));
            put("King, Stephen", new Livro("O conde de monte cristo", 245));
        }};

        for (Map.Entry<String, Livro> livro: meusLivros.entrySet()) {
            System.out.println(livro.getKey() + "-" + livro.getValue().getName());
        }
        System.out.println("Ordem de inserção: ");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("IT", 203));
            put("Soares, Jô", new Livro("O chango de baker street", 305));
            put("King, Stephen", new Livro("O conde de monte cristo", 245));
        }};
        System.out.println(meusLivros1);

        System.out.println("---- ordem alfabetica dos autores: ");
        Map<String, Livro> meusLivros3 = new TreeMap<>(){{
            put("Hawking, Stephen", new Livro("IT", 203));
            put("Soares, Jô", new Livro("O chango de baker street", 305));
            put("King, Stephen", new Livro("O conde de monte cristo", 245));
        }};
        for (Map.Entry<String, Livro> livro: meusLivros3.entrySet()) {
            System.out.println(livro.getKey() + "-" + livro.getValue().getName());
        }
        System.out.println("---- ordem alfabetica ordem dos livros: ");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorName());
        meusLivros4.addAll(meusLivros.entrySet());
        System.out.println(meusLivros4);
    }
}
class Livro{
    private String name;
    private Integer page;

    public Livro(String name, Integer page) {
        this.name = name;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public Integer getPage() {
        return page;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", page=" + page +
                '}';
    }
}
class ComparatorName implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getName().compareToIgnoreCase(l2.getValue().getName());
    }
}