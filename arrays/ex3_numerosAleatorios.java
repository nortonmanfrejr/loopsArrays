package arrays;

/**
 *
 *
 *
 *
 * */

import java.util.Random;

public class ex3_numerosAleatorios {


    /*
    * Faça um programa que leia até 20 numeros inteiros aleatorios (entre 0 e 100) e armazene-os em um vetor.
    * No final mostre os numeros e seu sucessor.
    *
    * */


    public static void main(String[] args) {

        Random rd = new Random(); // Construtor do random

        System.out.println("Exercicio numeros aleatorios\n");

        /*
        tipoDado[] <nomeVariavel> = new <tipoDado>[tamanhoVetor]
        */
        int[] numerosAleatorio = new int[20];

        for (int i = 0; i < numerosAleatorio.length; i++) {

            int numero = rd.nextInt(100); // Gerador de numeros aleatorios
            numerosAleatorio[i] = numero; // Armazenamento dos numeros gerados

        }

        System.out.println("Antecessor numero:");
        for(int numero : numerosAleatorio) // Apresenta o antecessor do numero gerado
            System.out.print((numero - 1) + " ");

        // -------------------------------------------

        System.out.println("\nNumeros aleatorios:");
        for (int numero : numerosAleatorio) // Apresenta o numero gerado
            System.out.print(numero + " ");

        // -------------------------------------------

        System.out.println("\nSucessor numero:");
        for(int numero : numerosAleatorio) // Apresenta o sucessor do numero gerado
            System.out.print((numero + 1) + " ");

    }
}
