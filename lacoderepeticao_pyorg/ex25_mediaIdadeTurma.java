package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex25_mediaIdadeTurma {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        boolean toContinue = false;
        int count = 0, somaIdade = 0;

        while(!toContinue){
            System.out.println("Digite uma idade: ");
            int idade = sc.nextInt();

            somaIdade += idade;
            count++;


            System.out.println("Deseja continuar lendo idades [S/N]");
            String toStop = sc.next();

            if(toStop.equalsIgnoreCase("n")){
                toContinue = true;
            }
        }

        double mediaIdade = somaIdade / count;

        System.out.println(mediaIdade + " é a media de idade da turma.");

        if(mediaIdade < 25.26){
            System.out.println("A turma é jovem.");
        } else if (mediaIdade <= 60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }
    }

/**
 * Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade
 * da turma varia entre 0 e 25,26 e 60 e maior que 60;
 * e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada
 * */

}
