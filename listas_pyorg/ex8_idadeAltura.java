package listas_pyorg;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ex8_idadeAltura {

    public static void main(String[] args){

        ArrayList<Integer> ids = new ArrayList<Integer>();
        ArrayList<Integer> idades = new ArrayList<Integer>();
        ArrayList<Double> alturas = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        for(int i = 0; i < 5; i++){
            ids.add(i);
            System.out.print("Idade: ");
            idades.add(sc.nextInt());
            System.out.print("Altura: ");
            alturas.add(sc.nextDouble());
        }
        Collections.reverse(ids);
        Collections.reverse(idades);
        Collections.reverse(alturas);

        System.out.println("ID: --->     " + ids);
        System.out.println("Idade: --->  " + idades);
        System.out.println("Altura: ---> " + alturas);


    }
}

//
//    Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor.
//        Imprima a idade e a altura na ordem inversa a ordem lida