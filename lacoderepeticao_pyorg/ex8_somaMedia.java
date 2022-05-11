package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex8_somaMedia {

    /**
     * Faça um programa que leia 5 números e informe a soma e a média dos números.
     * */

    public static void main(String[] args){

        int media = 0, soma = 0, count = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){

            System.out.print("Insira o numero: ");
            int num = sc.nextInt();

            System.out.println();

            soma += num;
            System.out.println("O soma total dos numeros é de " + soma);

            count++; // Seria melhor ter feito com While esse exercicio
        }

        media = soma / count;
        System.out.print("A media total dos numeros é de " + media);
    }
}
