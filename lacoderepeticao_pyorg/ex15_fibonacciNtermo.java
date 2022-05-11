package lacoderepeticao_pyorg;


import java.util.Scanner;

public class ex15_fibonacciNtermo {

    /**
     * A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
     * Faça um programa capaz de gerar a série até o n−ésimo termo.
     *
     * */

    public static void main(String[] args){


        int fb1 = 0, fb2 = 1, fb3 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira qual termo de fibonacci sera encerrada a função: ");
        int termo = sc.nextInt();


        System.out.print(fb1 + " " + fb2 + " ");

        for(int i = 3; i <= termo; i++){ // O i inicia no 3 pois ja foi printado o 0 e 1 fora do laço de repetição

            fb3 = fb1 + fb2;
            fb1 = fb2;
            fb2 = fb3;

            System.out.print(fb3 + " ");

        }


    }
}
