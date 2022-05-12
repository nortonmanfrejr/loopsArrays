package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex14_parImpar {

    /**
     * Faça um programa que peça 10 números inteiros, calcule e
     * mostre a quantidade de números pares e a quantidade de números impares.
     * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int count = 0, qntdPar = 0, qntdImpar = 0;

        do {


            count++;

            System.out.print(count + "ºNumero: ");
            int num = sc.nextInt();

            if(num % 2 == 0)
                qntdPar += 1;
            else qntdImpar += 1;

        }while(count < 10);

        System.out.print("Numeros pares: " + qntdPar + "\nNumeros Impares: " + qntdImpar);

    }
}
