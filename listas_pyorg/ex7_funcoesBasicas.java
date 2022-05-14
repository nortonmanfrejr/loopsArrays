package listas_pyorg;

import java.util.Scanner;
import java.util.ArrayList;

public class ex7_funcoesBasicas {

    public static void main(String[] args){


        int soma = 0, multiplicacao = 1;
        ArrayList<Integer> numb = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            int n = sc.nextInt();
            numb.add(n);

            soma += n;
            multiplicacao *= n;

        }

        System.out.println("Numeros: " + numb);
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
    }
}


//    Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.