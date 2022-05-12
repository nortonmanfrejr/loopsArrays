package lacoderepeticao_pyorg;

import java.util.Scanner;
public class ex30_ex29Panificadora {

    /**
     *
     * O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha,
     * que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de
     * preços de pães, de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:
     *
     * */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        double precoPao = sc.nextDouble();

        System.out.println("Loja do Manoel ------ Lista de preço:");
        for(int i = 1; i <= 50; i++){
            System.out.println(i + " - R$" + (precoPao * i));
        }
    }




}
