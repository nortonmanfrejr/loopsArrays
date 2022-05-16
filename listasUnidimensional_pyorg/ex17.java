package listas_pyorg;

import java.util.ArrayList;
import java.util.Scanner;

public class ex17 {


    public static void main(String[] args){


        ArrayList<Double> saltos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Nome do atleta: ");
        String nome = sc.next();
        for(int i = 0; i < 5; i++){
            System.out.print((i + 1) + "º Salto: ");
            saltos.add(sc.nextDouble());
        }


        System.out.println(saltos);

        System.out.println("Atleta: " + nome);
        System.out.print("Saltos: ");

        for(Double salto : saltos){
            if(saltos.indexOf(salto) == saltos.size() - 1){
                System.out.println(salto);
            } else{
                System.out.print(salto + " - ");
            }
        }

        double mediaSalto = saltos.stream().
                mapToDouble(Double::doubleValue).
                average().orElse(0d);


        System.out.printf("Media dos saltos: %.2f", mediaSalto);
    }

}


//    Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
//        O resultado do atleta será determinado pela média dos cinco valores restantes.
//        Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e
//        depois informe o nome, os saltos e a média dos saltos. O programa deve ser encerrado quando não for informado
//        o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:
//
//        Atleta: Rodrigo Curvêllo
//
//        Primeiro Salto: 6.5 m
//        Segundo Salto: 6.1 m
//        Terceiro Salto: 6.2 m
//        Quarto Salto: 5.4 m
//        Quinto Salto: 5.3 m
//
//        Resultado final:
//        Atleta: Rodrigo Curvêllo
//        Saltos: 6.5 - 6.1 - 6.2 - 5.4 - 5.3
//        Média dos saltos: 5.9 m
