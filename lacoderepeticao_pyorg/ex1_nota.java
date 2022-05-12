package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex1_nota {

    /**
     * Faça um programa que peça uma nota, entre zero e dez.
     * Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
     * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Nota:");
        nota = sc.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Valor invalido, insira uma nova nota:");
            nota = sc.nextInt();

        }

    }
}
