package loops;

import java.util.Scanner;
public class ex6_fatorial {

    /*
    Faça um programa que calcule o fatorial de um numero inteiro
    fornecido pelo usuario.
    Ex.: 5 != 120 (5 x 4 x 3 x 2 x 1)
    * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // Construtor Scanner

        int fatorial, multiplicacao = 1; // Variaveis

        System.out.print("Fatorial: ");
        fatorial = sc.nextInt();

        System.out.print(fatorial + "!= ");

        for(int i = fatorial; i>= 1; i--){

            multiplicacao *= i;

        }

        System.out.println(multiplicacao);

    }
}
