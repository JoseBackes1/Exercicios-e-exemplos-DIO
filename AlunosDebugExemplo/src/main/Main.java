package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Joao", "Pedro", "Ana Clara"};
        double media = calculaMediaTurma(alunos, scan);

        System.out.printf("Media turma %.2f", media);
    }
    static double calculaMediaTurma(String[] alunos, Scanner scan){
        double soma = 0.0;
        for(String aluno: alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scan.nextInt();
            soma+=nota;
        }
        return soma/alunos.length;
    }
}
