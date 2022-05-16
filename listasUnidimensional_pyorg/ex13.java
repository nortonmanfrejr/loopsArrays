package listas_pyorg;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;




public class ex13 {


    public static void main(String[] args){

        ArrayList<Double> temperatura = new ArrayList<>();
        int count = 0;


        Scanner sc = new Scanner(System.in);

        while(count != 12){

            System.out.println("Digite a temperatura: ");
            temperatura.add(sc.nextDouble());
            count++;

        }

        System.out.println("------------------------------");

        double media = temperatura.stream().
                mapToDouble(Double::doubleValue).
                average().orElse(0d);

        System.out.printf("Temperatura media : %.1fºC", media);

        System.out.println("------------------------------");

        Iterator<Double> iterator = temperatura.iterator();

        count = 0;

        while(iterator.hasNext()){

            double temp = iterator.next();

            if(temp > media){
                switch(count){

                    case 0:
                        System.out.printf("1 - Janeiro: %.1f ºC\n", temp);
                        break;

                    case 1:
                        System.out.printf("2 - Fevereiro: %.1f ºC\n", temp);
                        break;

                    case 2:
                        System.out.printf("3 - Março: %.1f ºC\n", temp);
                        break;

                    case 3:
                        System.out.printf("4 - Abril: %.1f ºC\n", temp);
                        break;

                    case 4:
                        System.out.printf("5 - Maio: %.1f ºC\n", temp);
                        break;

                    case 5:
                        System.out.printf("6 - Junho: %.1f ºC\n", temp);
                        break;

                    case 6:
                        System.out.printf("7 - Julho: %.1f ºC\n", temp);
                        break;

                    case 7:
                        System.out.printf("8 - Agosto: %.1f ºC\n", temp);
                        break;

                    case 8:
                        System.out.printf("9 - Setembro: %.1f ºC\n", temp);
                        break;

                    case 9:
                        System.out.printf("10 - Outubro: %.1f ºC\n", temp);
                        break;

                    case 10:
                        System.out.printf("11 - Novembro: %.1f ºC\n", temp);
                        break;

                    case 11:
                        System.out.printf("12 - Dezembro: %.1f ºC\n", temp);
                        break;
                    default:
                        System.out.println("Sem temperatura acima da média.");
                }

            }

            count++;
        }

    }


}


//    Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista.
//        Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual,
//        e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).