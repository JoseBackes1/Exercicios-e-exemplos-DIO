package application;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione 7 notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(7.5);
        notas.add(8.5);
        notas.add(9d);
        notas.add(6d);
        notas.add(9.3);
        notas.add(5d);

        System.out.println(notas.toString());
        System.out.println("Exiba a posicao da nota 5: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posicao 4: " );
        notas.add(4, 8.0);

        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5d pela nota 7d: ");
        notas.set(notas.indexOf(5d), 7d);

        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));

        System.out.println("exiba todas as notas na ordem em que foram informadas: ");

        for(Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.print("Exiba a soma dos valores: " );
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println(soma);

        System.out.println("exiba a media das notas: " + (soma/notas.size()));

        System.out.println("remova a nota 6.0: ");
        notas.remove(6.0);
        System.out.println(notas);

        System.out.println("remova a nota na posicao zero: ");
        notas.remove(0);
        System.out.println(notas);
        System.out.println("remova as notas menores que 8.0: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next<8.0){
                iterator1.remove();
            }

        }

        System.out.println(notas);

        System.out.println("Apague toda a lista: ");

        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());
    }

}
