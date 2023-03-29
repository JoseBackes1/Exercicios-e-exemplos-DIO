package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d, 7d,0d, 3.6));

        //System.out.println("Exiba a posicao da nota 5.0: ");
        //nao é possivel
        //System.out.println("adicione a nota na posicao 4: ");
        //nao é possivel
        //System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        //nao é possivel
        System.out.println("Confira se a nota 5.0 esta no conjunto: " + notas.contains(5d));
        //System.out.println("Exiba a terceira nota adicionada: ");
        //nao é possivel
        System.out.println("Exbida a menor nota: " + Collections.min(notas));
        System.out.println("Exbida a maior nota: " + Collections.max(notas));

        System.out.print("Exiba a soma dos valores: ");
        Iterator<Double> iterator= notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println(soma);
        System.out.println("Exiba a media das notas: " + soma/notas.size());

        System.out.println("Remova a nota o.o: " + notas.remove(0.0));
        System.out.println(notas);

        //System.out.println("Remove a nota na posicao zero:");
        System.out.print("Remova as notas menores que 7.0: ");
        Iterator<Double> iterator1=notas.iterator();
        while(iterator1.hasNext()){
            if(iterator1.next()<7.0){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.print("Exiba todas as notas na ordem que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d, 7d,0d, 3.6));
        System.out.println(notas2);
        System.out.print("Exiba as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague o primeiro conjunto: ");
        notas.clear();
        System.out.println("Confira se o conjunto1 esta vazio: "+ notas.isEmpty());
        System.out.println("Confira se o conjunto2 esta vazio: "+ notas2.isEmpty());


    }
}
