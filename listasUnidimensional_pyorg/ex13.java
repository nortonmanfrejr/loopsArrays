package exercicios.listasUnidimensional_pyorg;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class ex13 {


    public static void main(String[] args){

        ArrayList<Double> temperaturaMedia = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();
        double soma = 0;


        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 12; i++){
            System.out.println((i + 1) + "ºTemp: ");
            double temp = sc.nextDouble();
            temperaturaMedia.add(temp);
            soma += temp;

        }

        System.out.println(temperaturaMedia);

        double media = soma / temperaturaMedia.size();
        System.out.println(media);

        System.out.println(temperaturaMedia + " --- " + ids);

        temperaturaMedia.removeIf(temp -> temp < media);
//      ids.removeIf(temp -> temp < media);

        System.out.println(temperaturaMedia + " --- " + ids);

        for(int i = 0; i < 12; i++){

            String mes;
            String s = ids.toString();


            switch(s){

                case "0":mes = "Janeiro";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia.get(i) + "ºC");
                    break;

                case "1": mes = "Fevereiro";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia.get(i) + "ºC");
                    break;

                case "2": mes = "Março";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia + "ºC");
                    break;

                case "3": mes = "Abril";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia + "ºC");
                    break;

                case "4": mes = "Maio";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia + "ºC");
                    break;

                case "5": mes = "Junho";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia + "ºC");
                    break;

                case "6": mes = "Julho";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia + "ºC");
                    break;

                case "7": mes = "Agosto";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia + "ºC");
                    break;

                case "8": mes = "Setembro";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia + "ºC");
                    break;

                case "9": mes = "Outubro";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia + "ºC");
                    break;

                case "10": mes = "Novembro";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia + "ºC");
                    break;

                case "11": mes = "Dezembro";
                    System.out.println((i + 1) + " - " + mes + ": " + temperaturaMedia + "ºC");
                    break;
            }
        }



    }

}


//    Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista.
//        Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual,
//        e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).