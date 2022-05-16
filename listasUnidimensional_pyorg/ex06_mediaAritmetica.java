package listas_pyorg;

import java.util.ArrayList;
import java.util.Scanner;

public class ex06_mediaAritmetica {

    public static void main(String[] args){

        ArrayList<Double> media = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            double somaNotas = 0;
            System.out.println((i + 1) + "º Aluno: ------------------- ");
            for(int j = 0; j < 4; j++){
                System.out.print((j + 1) + "º Nota: ");
                somaNotas += sc.nextDouble();
            }
            media.add((somaNotas / 4));
            System.out.println((i + 1) + "º Aluno média: " + media.get(i));
        }
        System.out.println("Médias: " + media);

        System.out.println("----------------------------------");

        int count = 0;
        System.out.println("Contagem de alunos com média acima de 7: ");

        for(Double medias : media){
            if(medias >= 7){
                count++;
            }
        }

    }
}
//    Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno,
//        imprima o número de alunos com média maior ou igual a 7.0.