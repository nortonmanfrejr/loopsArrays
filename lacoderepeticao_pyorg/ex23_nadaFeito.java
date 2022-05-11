package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex23_nadaFeito {

    /**
     *
     * Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário.
     * O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos.
     * Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.
     * */




    public static void main(String[] args){

        int totalDivisao = 0;
        boolean primo = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numb = sc.nextInt();


        for(int i = 1; i <= numb; i++){

            while(primo){
                totalDivisao += 1;
                if(numb % i == 0){
                    System.out.println(numb +" é divisivel por " + i);

                    totalDivisao += 1;
                    primo = false;

                }



                if(primo){
                    System.out.println(numb + " é primo.");
                }
            }
        }

        System.out.println("Foi executadas " + totalDivisao + " divisões para encontrar os numeros primos");

    }

}
