package lacoderepeticao_pyorg;

import java.util.Scanner;
import java.util.Random;

public class ex31_ex30Conveniencias {



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int count = 0;
        double valorProduto = 0, somaTotal = 0, pagamento = 0;
        boolean inOperation = false;

        // Inicio da operação

        while(true){
            System.out.println("Lojas Tabajara: ");
            while(!inOperation){
                System.out.print("Produto " + (count + 1) + ": R$");
                valorProduto = sc.nextDouble();

                if(valorProduto == 0){
                    inOperation = true;
                }else {
                    somaTotal += valorProduto;
                    count++;
                }
            }
            System.out.println("Total R$ " + somaTotal);

            System.out.print("Pagar: R$");
            pagamento = sc.nextDouble();

            somaTotal -= pagamento;

            if(somaTotal > 0){
                System.out.println("Faltando R$" + somaTotal +"\n Pagar: R$");
                pagamento = sc.nextDouble();
            }else {
                System.out.println("Troco:  R$" + (pagamento - somaTotal));
                break;
            }


        }

    }

    /**
     * O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências.
     * Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um
     * número desconhecido de valores referentes aos preços das mercadorias.
     * Um valor zero deve ser informado pelo operador para indicar o final da compra.
     * O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu,
     * para então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial,
     * para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
     *
     *
     * Lojas Tabajara
     * Produto 1: R$ 2.20
     * Produto 2: R$ 5.80
     * Produto 3: R$ 0
     * Total: R$ 9.00
     * Dinheiro: R$ 20.00
     * Troco: R$ 11.00
     * ...
     * */
}
