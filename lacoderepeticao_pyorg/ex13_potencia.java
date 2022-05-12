package lacoderepeticao_pyorg;


import java.util.Scanner;

public class ex13_potencia {
    /**
     *
     * Faça um programa que peça dois números,
     * base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
     * Não utilize a função de potência da linguagem.
     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0, pow = 1;

        System.out.print("Insira o valor base: ");
        int base = sc.nextInt();
        System.out.print("Insira o valor do expoente: ");
        int expoente = sc.nextInt();


        // Com Do While

        /**do {

            count++;
            System.out.println(base);
            base *= expoente;

        } while (count < expoente);
         */


        // Com For
        for (count = 0; count < expoente; count++) {
            pow *= base;
        }
        System.out.print(pow);
    }

}

