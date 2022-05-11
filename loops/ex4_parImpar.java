package loops;

import java.util.Scanner;

public class ex4_parImpar {


    /*
    * Faça um programa que peça N números inteiros,
    * calcule e mostre a quantidade de números pares
    * e a quantidade de números impares
    * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // Construtor do scanner

        int quantNumeros, numero, quantPar = 0, quantImpar = 0, count = 0;


        System.out.print("Quantidade de numeros: ");
        quantNumeros = sc.nextInt(); // Inserção de qntd de Ns que serão analisados

        do{

            System.out.print("Numero: ");
            numero = sc.nextInt();

            if(numero % 2 == 0) quantPar++;
            else quantImpar++;

            ++count;
        }while(count < quantNumeros);

        System.out.println("Numeros Pares: " + quantPar +
                "\nNumero Impares: " + quantImpar);


    }

}
