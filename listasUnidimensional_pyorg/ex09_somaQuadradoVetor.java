package listas_pyorg;

import java.util.Scanner;
import java.util.ArrayList;


public class ex09_somaQuadradoVetor {

    public static void main(String[] args){

        ArrayList<Integer> vetorA = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um numero: ");
            int numb = sc.nextInt();
            vetorA.add((int) Math.pow(numb, 2));
        }

        int somaVetorA = 0;

        for(Integer somaVet : vetorA){
            somaVetorA += somaVet;
        }

        System.out.println("O quadrado dos vetores: " + vetorA);
        System.out.println("A soma dos quadrados: " + somaVetorA);
    }
}
//
//    Faça um Programa que leia um vetor A com 10 números inteiros,
//        calcule e mostre a soma dos quadrados dos elementos do vetor.