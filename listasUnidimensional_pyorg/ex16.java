package listas_pyorg;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ex16 {

    public static void main(String[] args){

        ArrayList<Double> vendas = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);


        boolean addSalario = true;
        while(addSalario){

            System.out.print("Valor das vendas: ");
            double venda = sc.nextDouble();
            double pagamento = 200 + (venda * 0.09);
            vendas.add(pagamento);

            while(true){
                System.out.println("Deseja continuar?");
                String toContinue = sc.next();
                if(toContinue.equalsIgnoreCase("s")){
                    break;
                } else if (toContinue.equalsIgnoreCase("n")) {
                    addSalario = false;
                    break;
                } else {
                    System.out.println("Entre com /S/ ou /N/");
                }
            }
        }

        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0, countG = 0, countH = 0, countI = 0;
        for(Double recebimento : vendas){

            if(recebimento < 300){
                countA++;
            } else if (recebimento < 400) {
                countB++;
            } else if (recebimento < 500) {
                countC++;
            } else if (recebimento < 600) {
                countD++;
            } else if (recebimento < 700) {
                countE++;
            } else if (recebimento < 800) {
                countF++;
            } else if (recebimento < 900) {
                countG++;
            } else if (recebimento < 1000) {
                countH++;
            } else countI++;

        }

        System.out.println("Ativos que recebem entre $200 - $299" + countA);
        System.out.println("Ativos que recebem entre $300 - $399" + countB);
        System.out.println("Ativos que recebem entre $400 - $499" + countC);
        System.out.println("Ativos que recebem entre $500 - $599" + countD);
        System.out.println("Ativos que recebem entre $600 - $699" + countE);
        System.out.println("Ativos que recebem entre $700 - $799" + countF);
        System.out.println("Ativos que recebem entre $800 - $899" + countG);
        System.out.println("Ativos que recebem entre $900 - $999" + countH);
        System.out.println("Ativos que recebem mais de $1000" + countI);
    }
}

//
//        Utilize uma lista para resolver o problema a seguir.
//        Uma empresa paga seus vendedores com base em comissões.
//        O vendedor recebe $200 por semana mais 9 por cento de suas vendas brutas daquela semana.
//        Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana recebe $200 mais 9 por cento de $3000,
//        ou seja, um total de $470.
//        Escreva um programa (usando um array de contadores) que determine quantos vendedores receberam
//        salários nos seguintes intervalos de valores:
//        $200 - $299
//        $300 - $399
//        $400 - $499
//        $500 - $599
//        $600 - $699
//        $700 - $799
//        $800 - $899
//        $900 - $999
//        $1000 em diante


//        Desafio: Crie uma fórmula para chegar na posição da lista a partir do salário, sem fazer vários ifs aninhados.