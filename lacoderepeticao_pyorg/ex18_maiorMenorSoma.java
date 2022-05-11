package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex18_maiorMenorSoma
{

    /**
     *
     * Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.
     *
     * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, soma = 0;


        System.out.print("Quantos numeros serão lidos: ");
        int n = sc.nextInt();


        for(int i = 1; i <= n; i++){

            System.out.println(i + "ºNumero: ");
            int numb = sc.nextInt();

            if(numb < menor)
                menor = numb;
            else if(numb > maior)
                maior = numb;

            soma += numb;
        }

        System.out.println("O maior numero foi: " + maior);
        System.out.println("O menor numero foi: " + menor);
        System.out.println("A soma dos numeros foi: " + soma);
    }
}
