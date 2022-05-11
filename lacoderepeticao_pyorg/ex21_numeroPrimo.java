package lacoderepeticao_pyorg;


import java.util.Scanner;


public class ex21_numeroPrimo {


    /**
     * Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
     * Um número primo é aquele que é divisível somente por ele mesmo e por 1.
     */


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        boolean primo = true;


        System.out.println("Digite um numero: ");
        int numb = sc.nextInt();



        if (primo)
            System.out.println("O numero " + numb + " é primo.");

    }
}