package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex23_primoEntre1eN {

    /**
     *
     * Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário.
     * O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos.
     * Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.
     * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com o numero final: ");
        int end = sc.nextInt();


        int numb = 1;
        boolean primo = true;

        for(int i = 2; i < end; i++) {

            if(numb % 2 == 0){
                primo = false;
            }else{
                System.out.println(numb);
            }

            numb++;
        }
    }

}
