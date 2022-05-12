package lacoderepeticao_pyorg;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;
import java.text.NumberFormat;


public class ex38_aumentoSalarialAnual {

    /*
    * Não achei legal a apresentação de resultado desse exercicio, pois quando chega na data atual o salario fica
    * exorbitante;
    *
    * Para uma apresentação melhor seria bom fazer uma captura da data de contratação, e a data final desejada.
    *
    * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Calendar cal = GregorianCalendar.getInstance();
        Locale local = new Locale("pt", "BR");


        int anoContratacao = 1995, anoAtual = cal.get(Calendar.YEAR);
        double salario = 0, taxaAumento = 0.015d;

        NumberFormat moeda = NumberFormat.getCurrencyInstance(local);

        System.out.print("Salario do funcionario: R$ ");
        salario = sc.nextDouble();


        for(int i = anoContratacao; i <= anoAtual; i++){

            // Nova taxa de aumento
            if(i > 1996){
                taxaAumento *= 2;
            }


            // Apresentação do salario anual do funcionario.
            salario += (salario * taxaAumento);
            System.out.println(i + ": " + moeda.format(salario));
            System.out.println("\n<-----------------> %");



        }

    }
}

/**
 *
 *
 * Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
 * Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
 * Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
 * A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. -- X
 * Faça um programa que determine o salário atual desse funcionário.
 * Após concluir isto, altere o programa permitindo que o usuário digite o salário inicial do funcionário.
 *
 * */
