package listas_pyorg;


import java.util.Scanner;
import java.util.ArrayList;

public class ex05_imparPar {

    public static void main(String[] args){

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 20; i++){

            System.out.println((i + 1) + "º --> ");
            int numero = sc.nextInt();
            numeros.add(numero);

            if(numeros.get(i) % 2 == 0 ){
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }



        System.out.println(numeros.size() + "Numeros --> " + numeros);
        System.out.println(pares.size() + "Numeros --> " + pares);
        System.out.println(impares.size() + "Numeros --> " + impares);
    }

}

//        Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
//        Armazene os números pares no vetor PAR e os números IMPARES no vetor impar.
//        Imprima os três vetores.