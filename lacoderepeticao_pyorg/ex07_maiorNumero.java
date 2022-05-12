package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex07_maiorNumero {

    /**
     * Faça um programa que leia 5 números e informe o maior número
     * */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        for(int i = 1; i <= 5; i++){
            System.out.print("Insira o numero: ");
            int n = sc.nextInt();
            if(n > maior)
                maior = n;

        }
        System.out.println("O maior numero é: " + maior);
    }
}
