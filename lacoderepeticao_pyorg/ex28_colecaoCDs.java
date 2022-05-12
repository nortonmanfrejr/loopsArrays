package lacoderepeticao_pyorg;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ex28_colecaoCDs {


    public static void main(String[] args){

        int qntCD = 0;
        double mediaGasta = 0, somaValor = 0, valor = 0;

        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos CDs hã na coleção: ");
        qntCD = sc.nextInt();

        for(int i = 1; i <= qntCD ; i++){

            System.out.println(i + "º CD custa: ");
            valor = sc.nextInt();

            somaValor += valor;
        }

        mediaGasta = somaValor / qntCD;
        System.out.println("A média gasta por disco foi de R$" + mediaGasta );

    }
    /**
     *
     *
     * Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor
     * médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.
     *
     */

}


