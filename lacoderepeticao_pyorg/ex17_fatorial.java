package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex17_fatorial {
    /**
     * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
     * */


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int fatorial = 1;


        System.out.print("Numero que deseja o fatorial: ");
        int numb = sc.nextInt();


        System.out.print(numb + " != ");

        for(int i = numb; i >= 1; i--){
            if(i != 1)
                System.out.print(i + " X ");
            else System.out.print(i + " = ");

            fatorial *= i;

        }


        System.out.print(fatorial + " ");
    }
}
