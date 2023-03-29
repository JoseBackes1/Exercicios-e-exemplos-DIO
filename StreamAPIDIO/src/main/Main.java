package main;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "2", "4", "6","9", "3", "9", "6");

//        System.out.println("Imprima todos os elementos da lista de String: ");
//        numerosAleatorios.stream().forEach(System.out::println);
//        System.out.println("pegue os cinco primeiros numeros e coloque dentro de um set:");
//        numerosAleatorios.stream().limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
//        System.out.println("Transforme a lista em uma lista de numeros inteiros: ");
//        List<Integer> collectList = numerosAleatorios.stream()
//                .map(s->Integer.parseInt(s))
//                .collect(Collectors.toList());

//        System.out.println("Pegue os numeros pares e coloque em uma list: ");
//        List<Integer> lisPareMaioresQueDois=numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i-> (i%2 == 0 && i>2)).collect(Collectors.toList());
//        System.out.println(lisPareMaioresQueDois);

//        System.out.println("Mostre a media da Lista: ");
//        numerosAleatorios.stream()
//                .mapToInt(s->Integer.parseInt(s))
//                .average()
//                .ifPresent(System.out::println);

//
        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);
        Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
        System.out.println(coresDaBandeiraDoBrasil);

    }
}
