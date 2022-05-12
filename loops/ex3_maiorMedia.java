package loops;

import java.util.Scanner;

public class ex3_maiorMedia {

    // Faça um programa que leia 5 números e informe o maior deles e a média desses numeros

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // Construtor objeto Scanner


        // Declaração de variaveis

        int numero, maior = 0, soma = 0, count = 0; // É possivel declarar variaveis do mesmo tipo em uma só linha.

        do{

            System.out.print(1+count +"º Número: ");
            numero = sc.nextInt();

            soma += numero; // Realizando a soma de todos os numeros declarados pelo usuario

            if(numero > maior) maior = numero; // Verificando maior numero


            ++count; // Contador pre-posto

            //count = count + n; É uma das formas de se fazer o contador
            // count += n; É uma outra das formas, usando menos caracteres que o exemplo acima

        } while(count < 5);

        System.out.println("Maior numero: " + maior);
        System.out.println("Media numeros: " + (soma/count));
    }
}
