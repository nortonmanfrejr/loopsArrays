package listas_pyorg;


import java.util.ArrayList;
import java.util.Scanner;


public class ex14 {

    public static void main(String[] args){


        ArrayList<String> perguntas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int sim = 0;

        while(true){
            System.out.println("Telefonou para a vítima?");
            String resposta = sc.next();

            if(resposta.equalsIgnoreCase("sim")){
                perguntas.add(resposta);
                sim++;
                break;
            } else if(resposta.equalsIgnoreCase("nao")){
                break;
            }
            else if(!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("nao")){
                System.out.println("Entre com a resposta /sim/ ou /não/");

            }
        }

        while(true){
            System.out.println("Esteve no local do crime?");
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("sim")){
                perguntas.add(resposta);
                sim++;
                break;
            } else if (resposta.equalsIgnoreCase("nao")){
                break;
            } else if (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("nao")) {
                System.out.println("Entre com a resposta /sim/ ou /não/");
            }
        }

        while (true){
            System.out.println("Mora perto da vítima?");
            String resposta = sc.next();

            if(resposta.equalsIgnoreCase("sim")){
                perguntas.add(resposta);
                sim++;
                break;
            } else if (resposta.equalsIgnoreCase("nao")) {
                break;
            } else if (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("nao")) {
                System.out.println("Entre com a resposta /sim/ ou /não/");
            }
        }

        while(true){
            System.out.println("Devia para a vítima?");
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("sim")){
                perguntas.add(resposta);
                sim++;
                break;
            } else if (resposta.equalsIgnoreCase("nao")){
                break;
            } else if (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("nao")) {
                System.out.println("Entre com a resposta /sim/ ou /não/");
            }
        }

        while(true){
            System.out.println("Já trabalhou com a vítima?");
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("sim")){
                perguntas.add(resposta);
                sim++;
                break;
            } else if (resposta.equalsIgnoreCase("nao")){
                break;
            } else if (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("nao")) {
                System.out.println("Entre com a resposta /sim/ ou /não/");
            }
        }


        switch (sim) {
            case 0:
            case 1: System.out.println("Inocente"); break;
            case 2:  System.out.println("Suspeito"); break;
            case 3:
            case 4: System.out.println("Cumplice"); break;
            case 5: System.out.println("Assassino"); break;
        }


    }
}


//    Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//        "Telefonou para a vítima?" x
//        "Esteve no local do crime?" x
//        "Mora perto da vítima?" x
//        "Devia para a vítima?" x
//        "Já trabalhou com a vítima?"  x

//        O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
//        Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
//        entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
