package loops;

import java.util.Scanner;

public class ex2_nota {

    /*
    * Faça um programa que peça uma nota entre zero e dez.
    * Mostre uma mensagem caso o valor seja invalido e continue pedindo
    * até que o usuario informe um valido.
    * */


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // Metodo construtor para um novo Scanner
        int nota; // Declaração de notas

        System.out.print("Nota: ");
        nota = sc.nextInt();

        // Validação de variavel

        while (nota < 0 || nota > 10){

            System.out.println("Nota invalida!! Digite novamente.\n");
            System.out.print("Nota: ");
            nota = sc.nextInt();

            /*
            * A validação de variavel é feita com um laço de repetição, caso o usuario não
            * insira um valor que se enquadre nos parametros designados ira apresentar uma mensagem
            * definida pelo programador para ele reinserir a variavel.
            * */
        }

    }
}
