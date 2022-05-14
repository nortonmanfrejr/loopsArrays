package listas_pyorg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex2_ordemInversa {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> array = new ArrayList<Double>();

        for(int i = 1; i <= 10; i++){

            System.out.println(i + " -> ");
            array.add(sc.nextDouble());

        }

        Collections.reverse(array);

        System.out.println("Matriz reversa: " + array);
    }
}
//    Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.