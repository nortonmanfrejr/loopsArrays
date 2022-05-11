package loops;

import java.util.Scanner;

public class ex5_tabuada {

    /*
    * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer numero inteiro.
    * O usuario devera informar de qual numero ele deseja ver a tabuada.
    * */

    public static void main(String[] args){


        int resultado = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Tabuada: ");
        int tabuada = sc.nextInt();


        System.out.println("Tabuada de " + tabuada);

        for(int i = 0;i <= 10; ++i){

            resultado = tabuada * i; // Processamento de dados
            System.out.println(tabuada + " X " + i + " = " + resultado);

            /*

            Tambem poderiamos imprimir o resultado diretamente na linha de print
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
            */

            /**
             Syntax

             for(tipo<nomeVar> = valorInicial; nomeVar condLogica valorRepetições; incremento)
             **/
        }

    }

}
