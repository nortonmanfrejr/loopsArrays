package listas_pyorg;

import java.util.*;

public class ex10_mesclaArrays {

    public static void main(String[] args) {


        ArrayList<Integer> vetorA = new ArrayList<Integer>();
        ArrayList<Integer> vetorB = new ArrayList<Integer>();
        ArrayList<Integer> vetorAB = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "º Numero do vetor A: ");
            vetorA.add(sc.nextInt());
        }

        for (int j = 0; j < 10; j++){
            System.out.println((j + 1) + "º Numero do vetor B: ");
            vetorB.add(sc.nextInt());
        }

        vetorAB.addAll(vetorA);
        vetorAB.addAll(vetorB);


        System.out.println("Vetor A: " + vetorA);
        System.out.println("Vetor B: " + vetorB);
        System.out.println("Vetor AB: " + vetorAB);

    }
}
//
//    Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos,
//        cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.