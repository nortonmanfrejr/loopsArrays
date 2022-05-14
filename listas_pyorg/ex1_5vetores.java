package listas_pyorg;

import java.util.Scanner;
import java.util.ArrayList;
public class ex1_5vetores {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite um numero para o vetor: ");
            array.add(sc.nextInt());
        }
        System.out.println(array);
    }
}
//    Faça um Programa que leia um vetor de 5 números inteiros e mostre-os