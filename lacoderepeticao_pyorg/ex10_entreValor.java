package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex10_entreValor {

    /**
     * Faça um programa que receba dois números inteiros e gere os números inteiros
     * que estão no intervalo compreendido por eles.
     * */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Valor minimo: ");
        int valorMin = sc.nextInt();

        System.out.println("Valor maximo: ");
        int valorMax = sc.nextInt();

        if(valorMin < valorMax){
            for(int i = valorMin + 1; i < valorMax; i++)
                System.out.print(i + " ");
        }else if(valorMin > valorMax){
            for(int i = valorMin - 1; i > valorMax; i--)
                System.out.print(i + " ");
        }


    }
}
